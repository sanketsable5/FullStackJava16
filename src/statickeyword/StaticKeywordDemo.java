package statickeyword;

public class StaticKeywordDemo {
    int empId;
    String empName;
    static String companyName="ABC";

    public StaticKeywordDemo(int empId, String empName){
        this.empId=empId;
        this.empName=empName;
        System.out.println("id=>"+empId+" name=>"+empName+" companyName=>"+companyName);
    }

    public static void main(String[] args) {
        StaticKeywordDemo obj1=new StaticKeywordDemo(1,"akash");
        StaticKeywordDemo obj2=new StaticKeywordDemo(2,"suhas");
        StaticKeywordDemo obj3=new StaticKeywordDemo(3,"ravi");

    }
}
