import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Nhập số nguyên dương n");
            System.out.println("2. Tính tổng số chẵn và số lẻ < n");
            System.out.println("3. Tìm các số hoàn hảo < n");
            System.out.println("4. Tính n!");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    do {
                        System.out.print("Nhập n (>0): ");
                        n = sc.nextInt();
                    } while (n <= 0);
                    break;

                case 2:
                    if (n > 0){
                        int sumEven = 0;
                        int sumOdd = 0;
                        for (int i = 1; i < n; i++) {
                            if (i % 2 == 0)
                                sumEven += i;
                            else
                                sumOdd += i;
                        }
                        System.out.println("Tổng số chẵn < n = " + sumEven);
                        System.out.println("Tổng số lẻ < n = " + sumOdd);
                    }
                    else {
                        System.out.println("Vui lòng nhập n trước!");
                    }
                    break;
                case 3:
                    if (n > 0){
                        for (int i = 2; i < n; i++) {
                            int sum = 1;
                            for (int j = 2; j <= i / 2; j++) {
                                if (i % j == 0) {
                                    sum += j;
                                }
                            }
                            if (sum == i) {
                                System.out.println(i);
                            }
                        }
                    }
                    else {
                        System.out.println("Vui lòng nhập n trước!");
                    }
                    break;
                case 4:
                    if (n > 0) {
                        long fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        System.out.println(fact);
                    }
                    else {
                        System.out.println("Vui lòng nhập n trước!");
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 5);
    }
}
