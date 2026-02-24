public class SS09_02 {
    static class Animal{
        public void sound(){
            System.out.println("Tieng keu");
        }
    }
    static class Cat extends Animal{
        @Override
        public void sound(){
            System.out.println("Meo keu meow meow");
        }
    }
    static class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("Cho sua gau gau");
        }
    }

    public static void main(String[] args) {
        Cat cat=new Cat();
        Dog dog=new Dog();
        cat.sound();
        dog.sound();
    }
}
