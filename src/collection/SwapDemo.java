package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapDemo implements Comparable<SwapDemo>{

        int id;
        String name;
        String address;

    public SwapDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        SwapDemo obj1=new SwapDemo(1,"Ramesh","Pune");
        SwapDemo obj2=new SwapDemo(624,"Ram","Mumbai");
        SwapDemo obj3=new SwapDemo(431,"Raghavan","Thane");

        List<SwapDemo> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        Collections.sort(list);
        list.forEach(s -> {
            System.out.println(s.id + " " + s.name +" "+ s.address);
        });

    }

    @Override
    public int compareTo(SwapDemo o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(SwapDemo o) {
//      if (this.id ==o.id){
//          return 0;
//      }else if (this.id >o.id){
//          return 1;
//      }else {
//          return -1;
//      }
    }
//}
