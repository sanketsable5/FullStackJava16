package thiskeyword;

/**
 * Uses:-
 * 1. It refers the current class instance variable
 * 2. It invokes the current class method
 * 3. It invokes the current class constructor.
 */
public class ThisKeywordDemo {
    private int id;
    private String name;
    private String address;

    public static void main(String[] args) {
        ThisKeywordDemo obj = new ThisKeywordDemo();
        obj.display();
    }

    private void show(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        System.out.println("id=>" + id + " name=>" + name + " address=>" + address);
    }

    private void display() {
        this.show(1, "ajit", "Pune");
        System.out.println("in display");
    }
}
