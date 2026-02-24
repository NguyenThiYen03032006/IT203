package bkt;

public class Coffe extends Drink {
    private boolean hasMilk=false;

    public Coffe(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk=hasMilk;
    }

    @Override
    double calculatePrice() {
        if(hasMilk){
            return price+5000;
        }
        return price;
    }
    @Override
    void displayInfo(){
        super.displayInfo();
        if(hasMilk){
            System.out.println("Loai: co sua");
        }else {
            System.out.println("Loai: khong sua");
        }
    }
}
