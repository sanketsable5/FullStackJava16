package controlflowstatement;

public class Patterns {
    public static void main(String[] args) {

        for (int i=1;i<=4;i++){
            for (int j=1;j<=4;j++){
                System.out.print("*");//for NOT breaking the line
            }
            System.out.println();//for breaking the line
        }
        System.out.println();
        for (int i=1;i<=4;i++){
            for (int j=i;j<=4;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=4;i++){
            for (int j=i;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
