package constructor;

/**
 * Constructor -> It is special type function which invoke automatically when you create object
 * of class
 *
 * Rules to create constructor
 * 1. your class name and constructor name should be same
 * 2. there should be no explicit return type
 * 3. static,final,synchronized keywords are not allowed with constructor
 *
 * types of constructors
 * 1. Default constructor
 * 2. Parameterized constructor
 *
 * Advantages of constructor
 * It initializes variable to their default value
 */

public class ConstructorDemo {

  public int add(){
      System.out.println("in add");
      return 1;
  }
    public ConstructorDemo() {
        System.out.println("in default constructor");
    }
    public ConstructorDemo(int i) {
        System.out.println("in parameter construction");
    }

    public static void main(String[] args) {
        ConstructorDemo obj=new ConstructorDemo();
        obj.add();

    }
}
