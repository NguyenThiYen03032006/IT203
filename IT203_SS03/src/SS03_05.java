import java.util.Scanner;

public class SS03_05 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }
    public static void displayBooks(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] books = {101, 102, 103, 104, 105};
        int n = 5;
        int bookId;
        do {
            System.out.println("Kho sach hien tại ("+n+" cuon): ");
            displayBooks(books, n);

            if (n == 0) {
                System.out.println("Mang da rong!");
                break;
            }

            System.out.print("Nhap ma sach can xoa: ");
            bookId = sc.nextInt();

            int oldN = n;
            n = deleteBook(books, n, bookId);

            if (n == oldN) {
                System.out.println("Khong tim thay ma sach!");
            } else {
                System.out.println("Da xoa ma sach "+ bookId);
            }

        } while (bookId != 0);
    }
}