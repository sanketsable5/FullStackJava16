package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class ReduceDemo {
    public static void main(String[] args) {
//        int []arr=new  int[]{1,2,3,4,5,};
//        int sum=0;
//        for(int i=0;i< arr.length;i++) {
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);

        List<Integer>list=Arrays.asList(1,2,3,4,5,6);
        int sum=0;
        for (int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        System.out.println(sum);


//        Optional<Integer>optional=list.stream().reduce(t1, t2)->t1+t2;        ERRORRR
//        System.out.println(optional.get());
    }

}
