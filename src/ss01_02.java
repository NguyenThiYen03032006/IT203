import java.util.Scanner;

public class ss01_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,m;
        float total;
        String text;

        System.out.print("Nhap so ngay cham tre: ");
        n=sc.nextInt();
        System.out.print("Nhap so luong sach muon: ");
        m=sc.nextInt();
        if (n>7 && m>=3){
            total=m*n*5000* 1.2f;
        }else {
            total=n*m*5000;
        }
        text=total>50000? "true" : "false";
        // in ra man hinh
        System.out.printf("Tien phat goc: %.1f VND\n",n*m*5000f);
        System.out.printf("Tien phat sau dieu chinh: %.1f VND\n", total);
        System.out.println("Yeu cau khoa the: "+text);
    }
}
