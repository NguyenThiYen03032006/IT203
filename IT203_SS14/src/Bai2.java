import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,String> list= new HashMap<>();
        list.put("T01","Paracetamol");
        list.put("T02","Ibuprofen");
        list.put("T03","Aspirin");
        list.put("T04","Amoxicillin");
        list.put("T05","Morphine");

        System.out.println("Nhap vao ma thuoc: ");
        String id= sc.nextLine();
        if(list.containsKey(id)){
            System.out.println("Ten thuoc: "+list.get(id));
        }else {
            System.out.println("Thuoc khong ton tai");
        }

    }
}
