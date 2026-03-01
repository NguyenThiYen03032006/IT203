package set;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        // set ke thua collection
        // set khong luu tru phan tu trung lap

        // 4 lop trien khai:
        // HashSet(ko xac dinh thu tu luu tru)
        // LinkedHashSet(vi tri chen)
        // TreeSet (cay nhi phan, dc sx)
        // EnumSet (Nhe va nhanh khi tim kiem)

        //Set<Integer> set1=new HashSet<>();
        //Set<Integer> set1=new LinkedHashSet<>();
       Set<Integer> set1=new TreeSet<>(Comparator.reverseOrder());
        set1.add(1);
        set1.add(10);
        set1.add(11);
        set1.add(101);
        System.out.println(set1);
        Set<Sex> set=EnumSet.of(Sex.Female,Sex.Male,Sex.Other);
        System.out.println(set);

        // cac phuong thuc lam viec
      //  TreeSet<Integer> set1=new TreeSet<>();
        // duyet set
        for(Integer val:set1){
            System.out.println(val);
        }
        // duyet bang iterator
        Iterator<Integer> iterator=set1.iterator();
        while(iterator.hasNext()){
            Integer val=iterator.next();
        }
    }
}
