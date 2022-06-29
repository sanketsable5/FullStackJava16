package Inheritance;

public class Teachera {

    int id;
    String name;
    String address;

}
class Mathsteacher extends Teacher
{
    public static void main(String[] args)
    {
        Mathsteacher obj= new Mathsteacher ();
        obj.id =1;
        obj.name = "abhishek";
        obj.address ="aurangabad";

        System.out.println();
    }
}