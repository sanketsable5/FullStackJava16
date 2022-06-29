package collection;



import java.util.Arrays;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Integer>list1= Arrays.asList(12,34,564,644,34);
        printlist(list1);

        System.out.println();
        List<String>list2= Arrays.asList("java","CPP","python");
        printlist(list2);

        System.out.println();
        List list3= Arrays.asList(54,"akash",32.1,'t');
        printlist(list3);

    }
    public static void printlist(List<?>list){
        list.forEach(s->{
            System.out.println(s);
        });
    }
}
