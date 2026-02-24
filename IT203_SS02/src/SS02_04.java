import java.util.Scanner;

public class SS02_04 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int id=0;
        do{
            System.out.print("Nhap ma id sach moi (>0): ");
            id=sc.nextInt();
        }while(id<=0);
        System.out.println("Xac nhan: Ma sach "+id+" da duoc ghi nhan");
    }
}
