package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {
    int id;
    String name;
    String address;

    public StudentComparator(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {
        StudentSetDemo s1 = new StudentSetDemo(45, "sanket", "aurangabad");
        StudentSetDemo s2 = new StudentSetDemo(22, "abhishek", "hydrabad");
        StudentSetDemo s3 = new StudentSetDemo(5, "sagar", "beed");

        List<StudentSetDemo> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Comparator<StudentComparator> comparator =(o1,o2)-> {
                if (o1.id == o2.id) {
                    return 0;
                } else if (o1.id > o2.id) {
                    return 1;
                } else {
                    return -1;
                }

        };

//
//        Collections.sort(listcomparator.thenComparing((StudentComparator o1,StudentComparator o2)->{
//            return o1.name.compareTo(o2.name);
//        }));

        list.forEach(s -> {
            System.out.println("id " + s.id + " name " + s.name + " address " + s.address);
        });


    }
}