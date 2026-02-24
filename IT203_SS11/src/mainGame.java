
    // Main.java
    public class mainGame {
        public static void main(String[] args) {
            GameCharacter[] characters = new GameCharacter[3];

            characters[0] = new Warrior("Leon", 120, 25, 8);
            characters[1] = new Mage("Iris", 90, 30, 60);
            // Goblin - Anonymous Class (FR-04)
            characters[2] = new GameCharacter("Goblin", 70, 0) {
                @Override
                public int attack() {
                    System.out.println("Goblin cắn trộm...");
                    return 10;
                }
            };

            // Simulation Loop (FR-05) - ví dụ: vòng tròn i đánh i+1
            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == null) continue;

                int j = (i + 1) % characters.length;
                if (characters[j] == null) continue;

                GameCharacter attacker = characters[i];
                GameCharacter target = characters[j];

                if (!attacker.isAlive() || !target.isAlive()) continue;

                System.out.println("\n" + attacker.getName() + " tấn công " + target.getName());
                int dmg = attacker.attack();
                target.takeDamage(dmg);

                // demo: nếu có ultimate thì dùng thử 1 lần (tuỳ bạn chỉnh luật)
                if (attacker instanceof ISkill skillUser && target.isAlive()) {
                    System.out.println(attacker.getName() + " dùng chiêu cuối lên " + target.getName());
                    skillUser.useUltimate(target);
                }
            }

            // Tổng kết
            System.out.println("\n===== KẾT QUẢ =====");
            System.out.println("Tổng số nhân vật đã tạo: " + GameCharacter.count);

            for (int i = 0; i < characters.length; i++) {
                if (characters[i] == null) continue;
                System.out.println(characters[i].getStatus());
            }
        }
    }

    // FR-01
    abstract class GameCharacter {
        protected String name;
        protected int hp;
        protected int attackPower;

        public static int count = 0;

        public GameCharacter(String name, int hp, int attackPower) {
            this.name = name;
            this.hp = hp;
            this.attackPower = attackPower;
            count++;
        }

        public abstract int attack();

        public void takeDamage(int damage) {
            hp -= damage;
            if (hp <= 0) {
                hp = 0;
                System.out.println(name + " đã bị hạ gục");
            }
        }

        public boolean isAlive() {
            return hp > 0;
        }

        public String getName() {
            return name;
        }

        // dùng để in trạng thái cuối (FR-05)
        public String getStatus() {
            return "- " + name + " | HP: " + hp;
        }
    }

    interface ISkill {
        void useUltimate(GameCharacter target);
    }

    // FR-02
    class Warrior extends GameCharacter implements ISkill {
        private int armor;

        public Warrior(String name, int hp, int attackPower, int armor) {
            super(name, hp, attackPower);
            this.armor = armor;
        }

        @Override
        public int attack() {
            return attackPower;
        }

        @Override
        public void takeDamage(int damage) {
            int realDamage = damage - armor;
            if (realDamage < 0) realDamage = 0;
            super.takeDamage(realDamage);
        }

        @Override
        public void useUltimate(GameCharacter target) {
            if (!isAlive()) return;

            System.out.println("Chiêu cuối: Đấm ngàn cân!");
            int damage = attackPower * 2;
            target.takeDamage(damage);

            int selfLoss = (int) Math.floor(hp * 0.10); // 10% HP hiện tại
            hp -= selfLoss;
            if (hp <= 0) {
                hp = 0;
                System.out.println(name + " đã bị hạ gục");
            }
        }

        @Override
        public String getStatus() {
            return super.getStatus() + " | Armor: " + armor;
        }
    }

    // FR-03
    class Mage extends GameCharacter implements ISkill {
        private int mana;

        public Mage(String name, int hp, int attackPower, int mana) {
            super(name, hp, attackPower);
            this.mana = mana;
        }

        @Override
        public int attack() {
            if (mana >= 5) {
                mana -= 5;
                return attackPower;
            }
            return attackPower / 2;
        }

        @Override
        public void useUltimate(GameCharacter target) {
            if (!isAlive()) return;

            System.out.println("Chiêu cuối: Hỏa cầu!");
            if (mana >= 50) {
                mana -= 50;
                int damage = attackPower * 3;
                target.takeDamage(damage);
            } else {
                System.out.println(name + " không đủ mana để dùng Hỏa cầu!");
            }
        }

        @Override
        public String getStatus() {
            return super.getStatus() + " | Mana: " + mana;
        }
    }
