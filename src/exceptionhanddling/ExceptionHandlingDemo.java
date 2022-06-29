package exceptionhanddling;
//why to use exception handling : to continue normal flow of program

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("hii");
        int i = 10;
        try {
            int j = i / 0;  //critical statement

//            try {
//                String str = null;
//                System.out.println(str.length());//critical statement
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception =>" + e.getMessage());
        }finally {
            System.out.println("Finally block");
//           scanner close()
        }
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
        System.out.println("hii");
    }

}

