package compare;

import java.util.*;

public class Demo {
    // Luu y: de sap xep thi cac phan tu ohai so sanh dc
    public static void main(String[] args) {
        "Nguyen Van A".compareTo("Nguyen Van B");
        // 2 interface de so sanh: comparable,comparator
        List<Student> name= Arrays.asList(
                new Student(1,"Trang",8),
                new Student(2,"Son",8),
                new Student(3,"Anh",7),
                new Student(4,"Binh",8)
        );
        Collections.sort(name);
        // nang cao java 8: Lambda
       // Collections.sort(name,(o1,o2)-> o1.getName().compareTo(o2.getName()));
       // Collections.sort(name,(o1,o2)-> Double.compare(o1.getScore(),o2.getScore()));
        // sx da tieu chi: sx theo diem tang dan, neu diem giong nhau thi id gim dan
        System.out.println(name);

    }
}
