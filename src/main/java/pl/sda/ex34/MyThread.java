package pl.sda.ex34;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }//extends Thread{

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }

}
