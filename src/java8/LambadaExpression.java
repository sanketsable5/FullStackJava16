package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambadaExpression {
    public static void main(String[] args) {
        myInterface myInterface=() -> "hello";
        System.out.println(myInterface.Display());

        myInterface1 myInterface1=(a,b) ->{
          return a+b;
        };
        System.out.println(myInterface1.add(23,33));

        
        List<Integer>list= Arrays.asList(1,2,3,4,5,6);
        Consumer<Integer>consumer=new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {

            }
        };
        list.forEach(consumer);
        System.out.println(list);

    }
}
@FunctionalInterface
interface myInterface{
    String Display();
}
@FunctionalInterface
interface myInterface1{
    Integer add(Integer a,Integer b);
}