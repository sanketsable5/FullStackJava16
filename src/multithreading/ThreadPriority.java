package multithreading;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread T1");

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread T2");

            }
        });
        t1.setPriority(5);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
