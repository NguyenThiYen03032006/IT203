import java.util.Scanner;
public class ss01_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ma sach (4 chu so): ");
        int bookId=sc.nextInt();
        if(bookId<1000 || bookId>9999){
            System.out.println("Thong tin nhap vao khong hop le");
            return;
        }
        // abcd
        int units= bookId%10; //d
        int dozens=(bookId/10)%10;//c
        int hundreds=(bookId/100)%10;//b
        int thousands= bookId/1000;//a
        int sumOfFirstThreeNumber= thousands+hundreds+dozens;
        String text= sumOfFirstThreeNumber==units? "Hop le" : "Sai ma";
        System.out.println("Chu so kiem tra ky vong: "+ units);
        System.out.println("Ket qua kiem tra ma sach: "+ text);
    }
}
