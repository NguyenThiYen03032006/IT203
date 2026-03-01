import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Cúm A", "Sốt xuất huyết", "Cúm A", "Covid-19", "Cúm A", "Sốt xuất huyết");
        Map<String,Integer> count= new TreeMap<>();
        for(String val:list){
            count.put(val,count.getOrDefault(val,0)+1);
        }
        for(String val: count.keySet()){
            System.out.println(val+" : "+count.get(val)+" ca");
        }
    }
}
