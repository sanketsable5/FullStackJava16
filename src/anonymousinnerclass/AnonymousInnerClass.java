package anonymousinnerclass;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Add add = new Add() {
            @Override
            public int addition(int a, int b) {
                return a + b;
            }

        };
        System.out.println(add.addition(3,4));


//        Add add=(a,b)->a+b;
//        System.out.println(add.addition(3,4));
    }
    interface Add{
        int addition(int a,int b);
    }
}
