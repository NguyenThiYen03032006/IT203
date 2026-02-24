import java.util.Scanner;

public class SS02_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap so sach tra muon: ");
        int quantity= sc.nextInt();
        int total=0;
        for(int i=0; i<quantity;i++){
            System.out.print("Nhap so ngay tre cua cuon thu "+ (i+1) +" : ");
            int temp=sc.nextInt();
            total+=temp*5000;
        }
        System.out.println("Tong tien phat: "+ total + " VND");
    }
}
