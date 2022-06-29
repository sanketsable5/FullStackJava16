package java8;
import java.util.function.Predicate;
public class PredicateDemo {
    public static void main(String[] args) {
        Integer i=12;
        Predicate<Integer> predicate= integer -> integer>0;
        System.out.println(predicate.test(i));


    }
}
