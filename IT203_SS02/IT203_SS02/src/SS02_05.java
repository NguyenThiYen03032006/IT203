import java.util.Scanner;

public class SS02_05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int point=100;
        int day=0;
        System.out.println("""
                    --- HE THONG DANH GIA DOC GIA ---
                    (Nhap so ngay tre. Nhap 999 de ket thuc)
        """);
        do{

            System.out.print("So ngay tre cua lan nay: ");
            int quantity=sc.nextInt();
            if(quantity<=0){
                point +=5;
                System.out.println("Tra som dung han : + 5 diem");
            }
            else {
                point-=(quantity*2);
                System.out.println("Tra tre "+ quantity+"ngay: -" +(quantity*2) +" diem");
            }
        }while(day!=999);
        if(point>120) System.out.println("Doc gia than thiet");
        else if (point>=80) System.out.println("Doc gia tieu chuan");
        else System.out.println("Doc gia can luu y");
    }
}
