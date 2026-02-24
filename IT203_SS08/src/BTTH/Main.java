package BTTH;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sinh viên");
            System.out.println("4. Cập nhật sinh viên");
            System.out.println("5. Xóa sinh viên");
            System.out.println("6. Sắp xếp sinh viên");
            System.out.println("7. Thống kê");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1: {
                    manager.addStudent();
                    break;
                }
                case 2: {
                    manager.displayAll();
                    break;
                }
                case 3: {
                    manager.searchStudent();
                    break;
                }
                case 4: {
                    manager.updateStudent();
                    break;
                }
                case 5: {
                    manager.deleteStudent();
                    break;
                }
                case 6: {
                    manager.sortStudents();
                    break;
                }
                case 7: {
                    manager.statistic();
                    break;
                }
                case 0: {
                    System.out.println("Thoát chương trình!");
                    break;
                }
                default: {
                    System.out.println("Chọn sai!");
                    break;
                }
            }
        } while (choice != 0);
    }
}
