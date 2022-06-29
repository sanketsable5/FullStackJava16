package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * stream api - it is sequence of object and have multiple methods, and we combine that method and produce desire result
 *
 *types of stream api - sequential and parallel(multithreading)
 *
 * operations-
 * terminal - forEach(consumer),collect(),reduce()
 * intermediate - map(function) , filter(predicate) ,sorted()
 *
 */
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Function<Integer,Integer> function=f->f*2;
        Stream<Integer> list1=list.stream().map(function);

        list1.forEach(System.out::println);

    }
}
