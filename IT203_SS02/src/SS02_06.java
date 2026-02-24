import java.util.Scanner;

public class SS02_06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int min=0,max=0,count=0,sum=0;
        for(int i=0;i<7;i++){

            if(i!=6)
                System.out.println("Nhap luot muon ngay thu "+ (i+2)+" : ");
            else
                System.out.println("Nhap luot muon ngay chu nhat: ");
            int quantity=sc.nextInt();
            if(quantity==0)continue;
            if (i==0) min=quantity;
            if (quantity > max) {
                max = quantity;
            }
            if (quantity < min) {
                min = quantity;
            }
            sum+=quantity;
            count++;

        }
        if (count==0)
            System.out.println("Ca tuan thu vien nghi");
        else{
            double average = (double) sum / count;
            System.out.println("--- KET QUA THONG KE ---");
            System.out.println("Luot muon cao nhat: "+ max);
            System.out.println("Luot muon thap nhat: "+ min);
            System.out.println("Trung binh luot muon/ngay: "+ average);

        }
    }
}
