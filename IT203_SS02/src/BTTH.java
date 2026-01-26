import java.util.Scanner;
public class BTTH {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("--------- MENU ---------");
            System.out.println("1:Tính tiền phạt trả sách");
            System.out.println("2: Đăng ký thẻ mượn sách VIP");
            System.out.println("3: Thống kê số sách nhập kho");
            System.out.println("4: Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice=sc.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Lựa chọn 1");
                    System.out.print("Nhập số lượng sách độc giả trả: ");
                    int quantity = sc.nextInt();
                    int[] amount = new int[quantity];
                    if (quantity <= 0) {
                        System.out.println("Số lượng sách nhập vào không hợp lệ !");
                        break;
                    }
                    // tính tiền phạt cho từng cuốn
                    boolean flag = true;
                    for (int i = 0; i < quantity; i++) {
                        System.out.print("Nhập số ngày quá hạn cho cuốn sách thứ " + (i+1) + " : ");
                        int temp = sc.nextInt();
                        if (temp < 1) {
                            System.out.println("Số ngày quá hạn không hợp lệ ");
                            flag = false;
                            break;
                        } else if (temp <= 5) {
                            amount[i] = temp * 2000;
                        } else {
                            amount[i] = temp * 5000;
                        }
                        flag = true;
                    }
                    // tính tổng tiền phạt
                    int sumAmount = 0;
                    if (flag) {
                        for (int i = 0; i < quantity; i++) {
                            sumAmount += amount[i];
                        }
                        System.out.println("Tổng tiền phạt của độc giả là: " + sumAmount);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Lựa chọn 2 ");
                    System.out.print("Nhập tuổi đọc giả: ");
                    int age = sc.nextInt();
                    System.out.print("Số sách đã mượn: ");
                    int quantity=sc.nextInt();
                    System.out.println("Độc giả có thẻ ưu tiên không ? (true/false)");
                    boolean check=sc.nextBoolean();
                    if ((age>=18 && quantity>=10) || check){
                        System.out.println("Đủ điều kiện nâng cấp VIP");
                    }else {
                        System.out.println("Chưa đủ điều kiện");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Lựa chọn 3");
                    int bookId=0;
                    int n=0;
                    do{
                        System.out.print("Nhập mã số cho cuốn sách thứ "+ (n+1)+" : ");
                        bookId=sc.nextInt();
                        if(bookId>0){
                            n++;
                        }else{
                            if (bookId<0){
                                System.out.println("Mã không hợp lệ ");
                                continue;
                            }

                        }

                    }while(bookId!=0);
                    System.out.println("Tổng số lượng sách hợp lệ: "+n);
                    break;
                }
                case 4:
                    System.out.println("Bạn đã chọn thoát");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
            }
        }while (choice!=4);
        sc.close();
    }
}
