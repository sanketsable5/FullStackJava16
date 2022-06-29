package collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,34,53,21,3,8);

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
