package SS02;

public class Bicycle extends Vehicle {
    public Bicycle(String brand){
        super(brand);
    }
    @Override
    void move(){
        System.out.println("Di chuyen bang suc nguoi");
    }
}
