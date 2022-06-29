package statickeyword;

public class Outer {
    int i=10;

    public void show() {
        System.out.println("In Outer show");
    }

   private static class Inner {
      static int j=12;
      static public void display(){
            System.out.println("In Inner display");
        }
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        System.out.println(outer.i);
        outer.show();
     //without static     //  Outer.Inner inner =new Outer().new Inner();
        //inner.display();
        Outer.Inner inner=new Outer.Inner();
        inner.display();

        Outer.Inner.display();

    }
}
