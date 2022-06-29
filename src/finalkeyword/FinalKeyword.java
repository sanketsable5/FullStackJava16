package finalkeyword;

/**
 * using final variable => you cannot reassign the value
 * using final method => you cannot override the method
 * using final class => you cannot inherit the class
 */
public class FinalKeyword {
    int i=19;
    final String direction ="NORTH";

    public final  void display() {
        i=33;
    }

    public static void main(String[] args) {
        FinalKeyword obj=new FinalKeyword();
        obj.display();
        System.out.println(obj.i);
    }
}
