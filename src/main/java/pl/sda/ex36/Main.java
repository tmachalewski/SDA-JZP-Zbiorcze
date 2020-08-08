package pl.sda.ex36;

public class Main {
    private static Thread t1;
    private static Thread t2;

    public static void main(String[] args) throws InterruptedException {
        t1 = new Thread(new ThreadPlaygroundRunnable("watek1"));
        t2 = new Thread(new ThreadPlaygroundRunnable("watek2"));

        t1.start();
        t1.join();
        t2.start();

    }
}
