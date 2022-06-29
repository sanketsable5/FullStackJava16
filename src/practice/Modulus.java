package practice;

import java.util.Scanner;

public class Modulus {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please insert your number");
        int num= sc.nextInt();
        for (int i=num;i<=25;i++){
            if (i%2!=0){
                System.out.println(i);
            }

        }
    }
}
