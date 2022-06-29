package controlflowstatement;

public class IfElseDemo {
    public static void main(String[] args) {
        int age = 19;
        String nationality = "Aus";

        if (age >= 18) {
            System.out.println("You can vote");
            if (nationality.equals("indian")) {

            } else {
                System.out.println("not indian");

            }

        } else {
            System.out.println("you cannot vote");
        }
        int a = 1000, b = 2000, c = 300, d = 5000;

        if (a > b && a > c && a > d) {
            System.out.println("a is greater");
        } else if (b > c && b > d) {
            System.out.println("b is greater");
        } else if (c > d) {
            System.out.println("c is greater");
        } else {
            System.out.println("d is greater");
        }
        int j=0;
        if (j>0){
            System.out.println("not zero");
        }else {
            System.out.println("zero");
        }
//        String str = j>0?"not zero":"zero";//ternary operator
//        System.out.println(str);
    }
}
