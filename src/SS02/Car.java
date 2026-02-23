package SS02;

public class Car extends Vehicle {
    public Car(String brand){
        super(brand);
    }
    @Override
    void move(){
        System.out.println("Di chuyen banwg dong co");
    }
}
