package polymorphism;
/**
 * Method overloading
 *   if class have multiple methods with same name but different number of arguments or parameters.
 * Rules
 * 1. number of arguments should be different
 * 2. return type should be different
 * 3. Changing the datatype of parameter
 * Advantages
 * 1. it increases the readability of the program
 */
import java.net.SocketOption;

public class PolymorphismDemo {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        int c = obj.add(2, 3, 9);

        System.out.println(c);

    }
}