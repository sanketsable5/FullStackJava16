package practice;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"mumbai");
        map.put(2,"nashik");
        map.put(3,"pune");

        System.out.println(map);
        map.forEach((k,v)->{
            System.out.println(k+" "+v);
        });

        Map<Integer,String> map1=new HashMap<>();

        map1.put(1,"mumbai");
        map1.put(2,"nashik");
        map1.put(3,"pune");

        System.out.println(map);
        map1.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
    }
}
