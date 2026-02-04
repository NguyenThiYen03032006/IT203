import re.inherit.Child;
import re.polymorphism.Animal;
import re.polymorphism.Calculator;
import re.polymorphism.Cat;
import re.polymorphism.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private int b;// bien instance
    private static final String name="abc";// bien tinh

    public static void main(String[] args) {
        Child child=new Child();
        child.say();
        child.say1();

//        Calculator.sum(1,2);// bien dich se biet phg thuc nao dc goi
//        Animal[] animals=new Animal[3];
//        animals[0].makeSound();// goi cua cho hay me ko

        // kieu khai bao va kieu thuc te
        Animal cat=new Cat();// kieu khai bao: Animal - kieu thuc te: Cat
        // bien tuan thu theo kieu khai bao => cat chi co the dung phuong thuc, thuoc tinh cua animal
        Animal dog=new Dog();
        Animal animal=new Animal();

        // ep kieu ngam dinh / tuong minh
        Cat cat1=new Cat();
        Animal ani=cat1;// ep kieu ngam dinh: con ->cha
        //Dog dog1=(Dog)ani;
        Cat cat2=(Cat) ani;// ep kieu tuong minh: cha-> con (co the loi)
        // toan tu instanceOf : kiem tra kieu thuc te
        if(ani instanceof Dog){// ktra kieu thuc te trc khi ep kieu tuong minh
          //  Cat cat3=(Cat) ani;
            Dog dog2=(Dog)ani;
        }
    }
    private static void print(final int a,int b){

    }
}