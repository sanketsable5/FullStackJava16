package superkeyword;

/**
 * super->
 * 1. it refers immediate parent class instance variable
 * it refers immediate parent class method
 */
public class SuperKeywordDemo {
    int i=10;
    public SuperKeywordDemo(){
        System.out.println("in parent constructor");
    }
    public SuperKeywordDemo(int i){
        System.out.println("in parent constructor parameter");
    }
    public void show(){
        System.out.println("in show");
    }
}
 class B extends SuperKeywordDemo{
    int i=12;
    public B(){
        System.out.println("in child constructor");
    }

    public B(int i){
        super();
        System.out.println("in b constructor parameter");
    }

     public static void main(String[] args) {
         B obj=new B(1);
     }
     public void display(){
        super.show();
         System.out.println("in display" + super.i);
     }
 }