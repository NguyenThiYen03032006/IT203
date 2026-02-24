package BTTH;

import java.util.Scanner;

public class StudentManager {
    private Student[] students = new Student[100];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        if (count >= students.length) {
            System.out.println("Danh sách đã đầy!");
            return;
        }

        System.out.print("Mã SV: ");
        String id = sc.nextLine();

        System.out.print("Họ tên: ");
        String name = sc.nextLine();

        System.out.print("Tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Giới tính: ");
        String gender = sc.nextLine();

        System.out.print("Điểm Toán: ");
        double math = Double.parseDouble(sc.nextLine());

        System.out.print("Điểm Lý: ");
        double physics = Double.parseDouble(sc.nextLine());

        System.out.print("Điểm Hóa: ");
        double chemistry = Double.parseDouble(sc.nextLine());

        students[count++] = new Student(id, name, age, gender, math, physics, chemistry);
        System.out.println("Thêm sinh viên thành công!");
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }

        System.out.printf("%-8s %-20s %-5s %-6s %-6s %-6s %-6s %-6s %-12s\n",
                "Mã", "Tên", "Tuổi", "GT", "Toán", "Lý", "Hóa", "TB", "Xếp loại");

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    public void searchStudent() {
        System.out.print("Nhập mã hoặc tên cần tìm: ");
        String key = sc.nextLine().toLowerCase();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (students[i].getId().toLowerCase().contains(key) ||
                    students[i].getName().toLowerCase().contains(key)) {
                students[i].display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }

    public void updateStudent() {
        System.out.print("Nhập mã SV cần cập nhật: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                System.out.print("Tên mới: ");
                students[i].setName(sc.nextLine());

                System.out.print("Tuổi mới: ");
                students[i].setAge(Integer.parseInt(sc.nextLine()));

                System.out.print("Giới tính mới: ");
                students[i].setGender(sc.nextLine());

                System.out.print("Điểm Toán: ");
                students[i].setMath(Double.parseDouble(sc.nextLine()));

                System.out.print("Điểm Lý: ");
                students[i].setPhysics(Double.parseDouble(sc.nextLine()));

                System.out.print("Điểm Hóa: ");
                students[i].setChemistry(Double.parseDouble(sc.nextLine()));

                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public void deleteStudent() {
        System.out.print("Nhập mã SV cần xóa: ");
        String id = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--count] = null;
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    public void sortStudents() {
        System.out.println("1. Theo điểm TB giảm dần");
        System.out.println("2. Theo tên A-Z");
        int choice = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                boolean swap = false;

                if (choice == 1 &&
                        students[i].getAverage() < students[j].getAverage()) {
                    swap = true;
                }

                if (choice == 2 &&
                        students[i].getName().compareToIgnoreCase(students[j].getName()) > 0) {
                    swap = true;
                }

                if (swap) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        System.out.println("Sắp xếp thành công!");
    }

    public void statistic() {
        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        Student max = students[0], min = students[0];

        for (int i = 0; i < count; i++) {
            String rank = students[i].getRank();
            if (rank.equals("Giỏi")) gioi++;
            else if (rank.equals("Khá")) kha++;
            else if (rank.equals("Trung bình")) tb++;
            else yeu++;

            if (students[i].getAverage() > max.getAverage()) max = students[i];
            if (students[i].getAverage() < min.getAverage()) min = students[i];
        }

        System.out.println("Giỏi: " + gioi);
        System.out.println("Khá: " + kha);
        System.out.println("Trung bình: " + tb);
        System.out.println("Yếu: " + yeu);

        System.out.println("SV điểm cao nhất: " + max.getName());
        System.out.println("SV điểm thấp nhất: " + min.getName());
    }
}
