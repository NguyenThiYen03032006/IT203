import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
// khai bao Scanner
        Scanner sc=new Scanner(System.in);
        // khai bao cac bien
        int bookId;
        String title;
        float price;
        int quantity;
        boolean isAvailable;
        // nhap du lieu
        System.out.println("Nhap ma sach: ");
        bookId= Integer.parseInt(sc.nextLine());

        System.out.println("Nhap tieu de sach: ");
        title=sc.nextLine();

        System.out.println("Nhap gia sach: ");
        price=sc.nextFloat();

        System.out.println("Nhap so luong sach: ");
        quantity=sc.nextInt();

        System.out.println("Trang thai sach (true/false): ");
        isAvailable=sc.nextBoolean();

        float totalValue= price*quantity;
        boolean isLargeStock= quantity>100? true : false;
        boolean canBorrow=isAvailable && quantity>0;

        System.out.println("\n--- BÁO CÁO TÌNH TRANG SÁCH ---");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.printf("Giá nhập: %.2f\n", price);
        System.out.println("Số lượng: " + quantity);
        System.out.printf("Tổng giá trị kho: %.2f\n", totalValue);
        System.out.println("Kho lớn (>100 sách): " + isLargeStock);
        System.out.println("Trạng thái: " + (isAvailable ? "Còn hàng" : "Hết hàng"));
        System.out.println("Có thể mượn: " + canBorrow);

    }
}
