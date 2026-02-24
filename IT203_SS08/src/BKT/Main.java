package BKT;
import java.util.Scanner;
public class Main {
    static Student[] listStudent = new Student[100];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("""
                    ===== QUAN LY SINH VIEN =====
                    1. Nhap danh sach sinh vien
                    2. Hien thi danh sach sinh vien
                    3. Tim kiem sinh vien theo hoc luc
                    4. Sap xep theo hoc luc giam dan
                    5. Thoat""");
            System.out.print("Lua chon cua ban: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    findByRank();
                    break;
                case 4:
                    sortByRankDesc();
                    break;
                case 5:
                    System.out.println("Ban da chon thoat !");
                    break;
                default:
                    System.out.println("Lua chon khong co trong menu");
            }
        } while (choice != 5);
    }

// case 1
    static void inputStudents() {
        System.out.print("Nhap so sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (count + 1));
            String id;
            while (true) {
                System.out.print("Ma SV (SV001): ");
                id = sc.nextLine();
                if (id.matches("^SV\\d{3}$")) {
                    break;
                }
                System.out.println("Ma sinh vien khong hop le!(VD: SV001)");
            }
            System.out.print("Ten SV: ");
            String name = sc.nextLine();
            System.out.print("Diem: ");
            double score = Double.parseDouble(sc.nextLine());
            listStudent[count] = new Student(id, name, score);
            count++;
        }
    }


    // case 2
    static void showStudents() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(listStudent[i]);
        }
    }

    // case3
    static void findByRank() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();
        boolean find = false;
        for (int i = 0; i < count; i++) {
            if (listStudent[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(listStudent[i]);
                find = true;
            }
        }
        if (!find) {
            System.out.println("Khong tim thay sinh vien!");
        }
    }


    // case 4
    static void sortByRankDesc() {
        if (count == 0) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (rankValue(listStudent[i]) < rankValue(listStudent[j])) {
                    Student temp = listStudent[i];
                    listStudent[i] = listStudent[j];
                    listStudent[j] = temp;
                }
            }
        }
        System.out.println("Sap xep thanh cong !");
    }

    static int rankValue(Student s) {
        String rank = s.getRank();
        switch (rank) {
            case "Gioi":
                return 3;
            case "Kha":
                return 2;
            default:
                return 1;
        }
    }
}

