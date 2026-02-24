package bkt;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks=new Drink[3];
        drinks[0]=new Coffe(1,"Bac siu",30000,true);
        drinks[1]=new FruitJuice(2,"Nuoc cam",40000,10);
        drinks[2]=null;
        for(int i=0;i<drinks.length;i++){
            if(drinks[i]!=null){
                if(drinks[i]instanceof IMixable){
                    IMixable im=(IMixable) drinks[i];
                    IMixable im1 = im;
                    im1.mix();
                }
                drinks[i].displayInfo();
                System.out.println("Thanh tien: "+ drinks[i].calculatePrice());
            }
        }
    }
}
