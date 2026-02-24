import java.util.Scanner;
import java.util.regex.Pattern;
public class HnKs24Cntt2NguyenThiYen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mssvList = new String[100];
        int count = 0; // index và la so luong phan tu da dc them vao
        String regex = "^B\\d{7}$"; // Bxxxxxxx
        int choice;
        do {
            System.out.println("""
            --- QUAN LY MSSV ---
            1.Hien thi
            2. Them moi
            3. Cap nhat
            4. Xoa
            5. Tim kiem
            6. Thoat""");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    if (count == 0) {
                        System.out.println("Danh sach rong!");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(i + ": " + mssvList[i]);
                        }
                    }
                    break;
                case 2:
                    if (count >= 100) {
                        System.out.println("Danh sach da day!");
                        break;
                    }
                    String newMSSV;
                    while (true) {
                        System.out.print("Nhap MSSV moi (Vi du: B2101234): ");
                        newMSSV = sc.nextLine();
                        if (Pattern.matches(regex, newMSSV)) {
                            break;
                        }
                        System.out.println("Sai dinh dang!");
                    }
                    boolean flag=true;
                    if(count>0){
                        for(int i=0;i<count;i++){
                            if(mssvList[i].equals(newMSSV)){
                                System.out.println("Ma sinh vien da ton tai! ");
                                flag=false;
                                break;
                            }
                        }
                    }
                    if(flag){
                        mssvList[count++] = newMSSV;
                        System.out.println("Them thanh cong!");
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    System.out.print("Nhap index can sua: ");
                    int index = Integer.parseInt(sc.nextLine());
                    if (index < 0 || index >= count) {
                        System.out.println("Index khong hop le!");
                        break;
                    }
                    String updateMSSV;
                    while (true) {
                        System.out.print("Nhap MSSV moi: ");
                        updateMSSV = sc.nextLine();
                        if (Pattern.matches(regex, updateMSSV)) {
                            break;
                        }
                        System.out.println("Sai dinh dang!");
                    }
                    mssvList[index] = updateMSSV;
                    System.out.println("Cap nhat thanh cong!");
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("Danh sach rong!");
                        break;
                    }
                    System.out.print("Nhap MSSV can xoa: ");
                    String deleteMSSV = sc.nextLine();
                    int findIndex = -1;
                    for (int i = 0; i < count; i++) {
                        if (mssvList[i].equals(deleteMSSV)) {
                            findIndex = i;
                            break;
                        }
                    }
                    if (findIndex == -1) {
                        System.out.println("Khong tim thay MSSV!");
                        break;
                    }
                    for (int i = findIndex; i < count - 1; i++) {
                        mssvList[i] = mssvList[i + 1];
                    }
                    count--;
                    System.out.println("Xoa thanh cong!");
                    break;
                case 5:
                    System.out.print("Nhap chuoi can tim: ");
                    String key = sc.nextLine().toLowerCase();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (mssvList[i].toLowerCase().contains(key)) {
                            System.out.println(mssvList[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay MSSV nao!");
                    }
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 6);
    }
}