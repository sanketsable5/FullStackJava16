package polymorphism;

/**
 * Method overriding
 * If 2 classes having same method name and signature
 *
 * Advantages
 * we are implementing parent class method in child class
 */
public class Animal {
    public void sound() {

        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }

    @Override
    public void sound() {

        System.out.println("Dog sound");
    }
}
