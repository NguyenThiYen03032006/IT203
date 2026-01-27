import java.util.Scanner;

public class BTTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int[] ids = new int[MAX];
        String[] titles = new String[MAX];
        int[] quantities = new int[MAX];
        int count = 0;
        int choice;
        do{
            System.out.println("""
            ---- MENU ----
            1. Xem danh sach.
            2. Them sach moi.
            3. Cap nhat so luong.
            4. Xoa sach.
            5. Tim kiem.
            6. Sap xeo theo so luong.
            7. Thoat.""");
            System.out.print("Chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sach rong!");
                    } else {
                        System.out.printf("%-10s |%-25s |%-10s\n","Ma", "Ten sach", "So luong");
                        for (int i = 0; i < count; i++) {
                            System.out.printf("%-10d |%-25s |%-10d\n", ids[i], titles[i], quantities[i]);
                        }
                    }
                    break;
                case 2:
                    if (count == MAX) {
                        System.out.println("Mang da day, khong the them!");
                        break;
                    }
                    System.out.print("Nhap ma sach: ");
                    int newId = sc.nextInt();
                    sc.nextLine();
                    boolean exists = false;
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == newId) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        System.out.println("Ma sach da ton tai!");
                        break;
                    }
                    System.out.print("Nhap ten sach: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Nhap so luong: ");
                    int newQty = sc.nextInt();
                    ids[count] = newId;
                    titles[count] = newTitle;
                    quantities[count] = newQty;
                    count++;
                    System.out.println("Them sach thanh cong!");
                    break;
                case 3:
                    System.out.print("Nhap ma sach can cap nhat: ");
                    int updateId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == updateId) {
                            System.out.print("Nhap so luong moi: ");
                            quantities[i] = sc.nextInt();
                            found = true;
                            System.out.println("Cap nhat thanh cong!");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay ma sach!");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma sach can xoa: ");
                    int deleteId = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < count; i++) {
                        if (ids[i] == deleteId) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Khong tim thay ma sach!");
                        break;
                    }
                    for (int i = index; i < count - 1; i++) {
                        ids[i] = ids[i + 1];
                        titles[i] = titles[i + 1];
                        quantities[i] = quantities[i + 1];
                    }
                    count--;
                    System.out.println("Xoa sach thanh cong!");
                    break;
                case 5:
                    System.out.print("Nhap tu khoa: ");
                    String keyword = sc.nextLine().toLowerCase();
                    boolean hasResult = false;
                    for (int i = 0; i < count; i++) {
                        if (titles[i].toLowerCase().contains(keyword)) {
                            System.out.printf("%-10d |%-25s |%-10d\n",ids[i], titles[i], quantities[i]);
                            hasResult = true;
                        }
                    }
                    if (!hasResult) {
                        System.out.println("Khong tim thay sach phu hop!");
                    }
                    break;
                case 6:
                    for (int i = 0; i < count - 1; i++) {
                        for (int j = i + 1; j < count; j++) {
                            if (quantities[i] < quantities[j]) {
                                // doi so luong
                                int tmpQty = quantities[i];
                                quantities[i] = quantities[j];
                                quantities[j] = tmpQty;
                                // doi id
                                int tmpId = ids[i];
                                ids[i] = ids[j];
                                ids[j] = tmpId;
                                // doi tieu de
                                String tmpTitle = titles[i];
                                titles[i] = titles[j];
                                titles[j] = tmpTitle;
                            }
                        }
                    }
                    System.out.println("Da sap xep giam dan theo so luong!");
                    break;
                case 7:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }while(choice!=7);
    }
}
