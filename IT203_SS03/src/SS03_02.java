import java.util.Scanner;
public class SS03_02 {
    // Phương thức tìm kiếm sách
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i; // tìm thấy, trả về vị trí
            }
        }
        return -1; // không tìm thấy
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// Khai báo và khởi tạo mảng sách
        String[] books = {
                "Lap trinh Java",
                "Cau truc du lieu",
                "Giai thuat",
                "Lap trinh C",
                "Co so du lieu"
        };
        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();
        int index = searchBooks(books, search);
        if (index != -1) {
            System.out.println("Tim thay tai vi tri " + index);
        } else {
            System.out.println("Sach khong ton tai");
        }
    }
}
