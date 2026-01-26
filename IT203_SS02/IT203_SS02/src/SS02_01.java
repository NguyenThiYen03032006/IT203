import java.util.Scanner;

public class SS02_01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age, quantity;
        do{
            System.out.print("Nhap so tuoi cua ban: ");
            age= sc.nextInt();
            System.out.print("Nhap so sach dang muon: ");
            quantity=sc.nextInt();
        }while(age<0 || quantity<0);

        if(age<18){
            System.out.println("Ket qua: KHONG DU DIEU KIEN");
            System.out.println("Ly do: Ban chua du tuoi");
            return;
        }

        if(quantity>=3){
            System.out.println("Ket qua: KHONG DU DIEU KIEN");
            System.out.println("Ly do: Ban da muon qua so luong cho phep");
            return;
        }

        System.out.println("Ket qua: BAN DU DIEU KIEN");
    }
}
