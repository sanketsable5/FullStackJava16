package java8;

public class Student {
    int id;
    String name;
    int marks;
    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Student obj1=new Student(1,"sanket",34);
        Student obj2=new Student(2,"rahul",87);
        Student obj3=new Student(3,"saurabh",34);
        Student obj4=new Student(4,"satyam",54);
    }



}
