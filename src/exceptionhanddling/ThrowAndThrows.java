package exceptionhanddling;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        int age = 17;

        if (age >= 18) {
            System.out.println("You can vote");
        } else {
            throw new Exception("you can not vote");
        }
        System.out.println("hii");
    }

}

class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

/**
 *      Throw..................................................................Throws
 *  1. throw is used to throw exception explicitly    1. throws is used to declaring exception
 *  2. throw is used within method                    2. throws is used within method signature
 *  3. you cannot throw multiple exceptions           3. using throws you can declare multiple exceptions
 *  4. throw is followed by instance of class         4. throws is followed by class exception
 */