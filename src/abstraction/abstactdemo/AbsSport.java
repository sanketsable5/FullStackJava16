package abstraction.abstactdemo;

public abstract class AbsSport {
    public abstract void play();//abstract method

    public void exercise(){//concrete method
        System.out.println("in exercise");
    }
}


/**
 * Abstraction: we are hiding the implementation and only showing the functionality
 *
 * Difference between abstract class and interface
 *
 *   Abstract class                                                              Interface
 *
 * 1.We can declare abstract class using abstract keyword              1. using interface
 * 2.we have both method abstract and concrete                         2. only abstract
 * 3.abstract class can extends another class or implements interface  3. only interface can extend
 * 4.we have private,protected,public method                           4. only public
 * 5.partial abstraction                                               5.100% abstraction.
 * 6.Use abstract class if you have common method                      6.use interface if there is no common method
 */