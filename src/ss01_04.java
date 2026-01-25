import java.util.Scanner;
public class ss01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap gia sach (USD - kieu double): ");
        double giaUSD = sc.nextDouble();
        System.out.print("Nhap ty gia USD/VND (kieu float): ");
        float tyGia = sc.nextFloat();
        double giaChinhXac = giaUSD * tyGia;
        long giaLamTron = (long) giaChinhXac;
        System.out.println("Gia chinh xac (so thuc): " + giaChinhXac);
        System.out.println("Gia lam tron de thanh toan (long): " + giaLamTron);
    }
}