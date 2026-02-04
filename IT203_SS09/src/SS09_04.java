public class SS09_04 {
    static class Animal{
        public void sound(){
            System.out.println("Tieng keu");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound(){
            System.out.println("Cho sua gau gau");
        }
        public void run(){
            System.out.println("Cho dang chay");
        }
    }

    public static void main(String[] args) {
    Animal animal=new Dog();
    animal.sound();
    if(animal instanceof Dog){
        Dog dog=(Dog) animal;
        dog.run();
    }
    }
}
