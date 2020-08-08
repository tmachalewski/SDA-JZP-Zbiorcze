package pl.sda.ex38;

public class Drinker implements Runnable{
    private CoffeMachine cm;

    public Drinker(CoffeMachine cm) {
        this.cm = cm;
    }


    @Override
    public void run() {
        while(true){
            synchronized(cm){
                if(cm.getWaterLevel()>0){
                    System.out.println(Thread.currentThread().getName() + " is preparing to drink. In CM there is available"+cm.getWaterLevel());
                    cm.setWaterLevel(cm.getWaterLevel()-1);
                }
                else{
                    try {
                        System.out.println(Thread.currentThread().getName() + " waiting, no water in CM");
                        cm.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
