package collection;

import java.util.Objects;

public class StudentSetDemo {
    int id;
    String name;
    String address;

    public StudentSetDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSetDemo s = (StudentSetDemo) o;
        return id == s.id && Objects.equals(name, s.name) && Objects.equals(address, s.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        StudentSetDemo obj=new StudentSetDemo(1,"rahul","pune");
        StudentSetDemo obj1=new StudentSetDemo(1,"rahul","pune");
        StudentSetDemo obj2=new StudentSetDemo(2,"ram","mumbai");


    }
}
