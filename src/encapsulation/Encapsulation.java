package encapsulation;

public class Encapsulation {
    //instance variable/global variable
    private int id;
    private String name;
    private String address;

    public int getId(){
        return id;
    }

    public void setId(int id){
        if (id > 0){//local variable
            this.id=id;
    } else {
            System.out.println("cannot set zero");
        }
}
  public String getName(){
    return name;}
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
    return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
class Sample{
    public static void main(String[] args) {
        Encapsulation obj=new Encapsulation();
        obj.setId(0);
        obj.setName("Rakesh");
        obj.setAddress("Pune");

        System.out.println("Id=>" + obj.getId() + " name=>" + obj.getName() + " address=>" + obj.getAddress() );
    }
}

