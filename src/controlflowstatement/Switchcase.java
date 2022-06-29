package controlflowstatement;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int num;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter number");
        num = Scanner.nextInt();
        switch (num){
            case 1:
                System.out.println("one");
            case 2:
                    System.out.println("two");
            case 3:
                        System.out.println("three");
            default:
                            System.out.println("no not found");
        }
    }
}
