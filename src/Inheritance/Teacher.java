package Inheritance;

import java.sql.SQLOutput;


public class Teacher {

    int id;
    String name;
    String address;
}

class MathTeacher extends Teacher
{
    public static void main(String[] args)
    {

        MathTeacher obj = new MathTeacher();
        obj.id = 1;
        obj.name = "sanket";
        obj.address = "mumbai";

        System.out.println("id=>" + obj.id + " name=>" + obj.name + " address=>" + obj.address);

    }
}
