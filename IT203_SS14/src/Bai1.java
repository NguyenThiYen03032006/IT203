
import java.util.*;

public class Bai1 {
    public static void main(String[] args) {

        List<String> list= Arrays.asList(
                "Nguyen Van A- Yen Bai",
                "Tran Thi B- Thai Binh",
                "Nguyen Van A- Yen Bai",
                "Le Van C- Hung Yen"
        );
        Set<String> list1=new LinkedHashSet<>();
        for(String val:list){
            list1.add(val);
        }
        for(String val:list1){
            System.out.println(val);
        }

    }
}
