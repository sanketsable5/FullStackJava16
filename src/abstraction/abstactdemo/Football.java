package abstraction.abstactdemo;

public class Football extends AbsSport {
    @Override
    public void play() {
        System.out.println("in play football");
    }

    @Override
    public void exercise() {
        System.out.println("for football exercise");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
        obj.exercise();
    }
}
