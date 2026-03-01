package map;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        // Map luu cap key,value (key- khoa la 1 SET<key>), giong Class)
        // tuong tu set

        // 4 lop trien khai
        //HashMap
        //LinkedHashMap
        // TreeMap
        //EnumMap

        Map<String,String> dictionary= new HashMap<>();
        // cac phuong thuc
        dictionary.put("apple","tao");
        dictionary.put("apple","cam");// ghi de

        dictionary.remove("apple");// lm vc vs key

        String val=dictionary.get("apple");// lay gtri theo khoa(ko co nguoc lai)

        // ktra ton tai true/false
        dictionary.containsKey("apple");
        dictionary.containsValue("tao");
        // duyet collection
        // 3 cach
        // theo key
        for(String key:dictionary.keySet()){
            // lm vc vs key -> value (bang get)
        }
        // theo value
        for(String values: dictionary.values()){
            // lm vc vs val (ko the tim key)
        }
        // theo ca 2
        for(Map.Entry<String,String> entry: dictionary.entrySet()){
            // lm vc
            String key=entry.getKey();
            String values=entry.getValue();
        }
    }
}
