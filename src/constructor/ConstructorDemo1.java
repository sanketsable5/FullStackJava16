package constructor;

import thiskeyword.ThisKeywordDemo;

public class ConstructorDemo1 {

     int i;
     String string;


    public ConstructorDemo1() {
        System.out.println("in default constructor");
    }
    public ConstructorDemo1(String str) {
        this();
        System.out.println("in default construction" +str);
    }

    public ConstructorDemo1(int i,String string){
        this.i=i;
        this.string=string;
        System.out.println("i=> "+i+" string=> "+string);
    }

    public static void main(String[] args) {
        ConstructorDemo1 obj=new ConstructorDemo1();
        obj.add();
        ConstructorDemo1 obj1 =new ConstructorDemo1();
        System.out.println(obj1.i);
        System.out.println(obj1.string);

        ConstructorDemo1 obj2=new ConstructorDemo1(1,"welcome");
        ThisKeywordDemo thisKeywordDemo= new ThisKeywordDemo();

    }
    public int add()
    {
        System.out.println("in add");
        return 1;
    }
}


