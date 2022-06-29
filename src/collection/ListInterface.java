package collection;

public interface ListInterface {
    void show();

    void display();
}

class ArrayListClass implements ListInterface {

    @Override
    public void show() {
        System.out.println("in show");
    }

    @Override
    public void display() {
        System.out.println("in display");
    }


    public static void main(String[] args) {
        ListInterface obj = new ArrayListClass();
        obj.display();
        obj.show();

    }
}