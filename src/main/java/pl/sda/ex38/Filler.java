package pl.sda.ex38;

public class Filler implements Runnable{
    private CoffeMachine cm;

    public Filler(CoffeMachine cm) {
        this.cm = cm;
    }


    @Override
    public void run() {
        while(true){
            synchronized (cm){
                if(cm.getWaterLevel()==0){
                    System.out.println(Thread.currentThread().getName() + " filling CM");
                    cm.setWaterLevel(5);
                    System.out.println(Thread.currentThread().getName() + " informing Drinkers water is available");
                    cm.notifyAll();
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
