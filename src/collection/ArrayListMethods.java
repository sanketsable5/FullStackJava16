package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(18);
        list1.add(56);
        list1.add(46);
        list1.add(74);


        List<Integer> list2=new ArrayList<>();
        list2.add(10);
        list2.add(18);
        list2.add(59);
        list2.add(23);
        list2.add(74);

        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.contains(10));
        System.out.println(list1.get(4));
        System.out.println(list1.indexOf(18));
        System.out.println(list1.isEmpty());
    }
}
