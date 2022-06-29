package multithreading;

public class DemonThread extends Thread{
    public static void main(String[] args) {

        DemonThread obj=new DemonThread();
        obj.setDaemon(true);
        obj.start();

        System.out.println("In main");
        System.out.println(obj.isDaemon());

    }

    @Override
    public void run() {
        System.out.println("in run");
    }
}
