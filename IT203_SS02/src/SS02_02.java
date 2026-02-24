import java.util.Scanner;
public class SS02_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap 1 ky tu code (A/B/C/D): ");
        char code= sc.next().charAt(0);
        System.out.print("Vi tri: ");
        switch (code){
            case 'A':
                System.out.println("Tầng 1: Sách Văn học");
                break;
            case 'B':
                System.out.println("Tầng 2: Sách Khoa học");
                break;
            case 'C':
                System.out.println("Tầng 3: Sách Ngoại ngữ");
                break;
            case 'D':
                System.out.println("Tầng 4: Sách Tin học");
                break;
            default:
                System.out.println("Gia tri nhap khong hop le");
        }
    }
}
