package map;

import java.util.*;

public class BaiOn {
    public static void main(String[] args) {
        Random rad=new Random();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<99;i++){
            list.add(rad.nextInt(1000));
        }
        // loai trung
        System.out.println("Do dai danh sach ban dau: ");
        System.out.println(list.size());
        Set<Integer> set=new LinkedHashSet<>(list);
        System.out.println("Do dai danh sach sau khi bo trung lap");
        System.out.println(set.size());

        // Dem so lan xuat hien
        // cach 1
        Map<Integer,Integer> count= new HashMap<>();
        for(Integer num:list){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        // cách 2
        Map<Integer,Integer> map= new HashMap<>();
        for(Integer num:list){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

    }
}
