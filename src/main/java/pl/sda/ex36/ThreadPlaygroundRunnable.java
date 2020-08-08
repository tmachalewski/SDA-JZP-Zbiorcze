package pl.sda.ex36;

public class ThreadPlaygroundRunnable implements Runnable {
    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +" " + name + " " + i);
        }
    }
}
