package pl.sda.ex39;

public class Screen implements Runnable{
    private ScoreJudge sj;
    private String name;

    public Screen(String name, ScoreJudge sj) {
        this.sj = sj;
        this.name = name;
    }


    @Override
    public void run() {
        while(true){
            System.out.println(name+ " " + sj.getScore());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
