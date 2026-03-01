import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> list1= new HashSet<>();
        list1.add("Aspirin");
        list1.add("Caffeine");
        list1.add("Paracetamol");

        Set<String> list2= new HashSet<>();
        list2.add("Penicillin");
        list2.add("Aspirin");
        list2.add("Pollen");

        // tim giao
        Set<String> giao= new HashSet<>(list1);
        giao.retainAll(list2);

        // an toan
        Set<String> anToan=new HashSet<>(list1);
        anToan.removeAll(list2);
        System.out.println("Canh bao di ung: "+giao);
        System.out.println("Thanh phan an toan: "+anToan);
    }
}
