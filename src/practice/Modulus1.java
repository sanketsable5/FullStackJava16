package practice;

import java.io.InputStream;
import java.util.Scanner;

public class Modulus1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no.");
        int n=sc.nextInt();

        for (int i=n;i<=25;i++){
           if ( i%5==0){
               System.out.println(i);

           }
        }
    }
}
