package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(15,54,65,23,1,45);

        list.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
