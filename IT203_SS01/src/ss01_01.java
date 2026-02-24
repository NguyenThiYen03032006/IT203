
import java.util.Scanner;

public class ss01_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // khai bao
            String bookID;
            String bookName;
            int publishYear;
            double price;
            boolean isAvailable;
        // nhap tu ban phim
        System.out.print("Nhap ma sach: ");
        bookID= sc.nextLine();

        System.out.print("Nhap ten sach: ");
        bookName=sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        publishYear=sc.nextInt();

        System.out.print("Nhap gia bia: ");
        price=sc.nextFloat();

        System.out.print("Sach con trong kho (true/false): ");
        isAvailable=sc.nextBoolean();

        int bookAge= 2026-publishYear;

        // dinh dang du lieu
        String upperCaseBookName=bookName.toUpperCase();
        String status= isAvailable ? "Con sach" : "Da muon";
        // xuat du lieu
        System.out.println("--- PHIEU THONG TIN SACH ---");
        System.out.printf("Ten sach : %s \n" ,upperCaseBookName);
        System.out.printf("Ma so: %s | Tuoi tho: %d nam \n",bookID,bookAge);
        System.out.printf("Gia ban: %.2f VND \n",price);
        System.out.printf("Tinh trang: %s",status);
    }
}
