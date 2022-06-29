package Inheritance;

public class Abhi {// parent class, super class , sub class, base class

    int id;
    String name;
    String address;


}
 class Abhi1 extends Abhi{

     public static void main(String[] args) {
         Abhi1 obj =new Abhi1();
         obj.id = 12 ;
         obj.name = "abhishek";
         obj.address= "pune";

         System.out.println("id=>"+obj.id+"name="+obj.name+"address="+obj.address);

     }



 }