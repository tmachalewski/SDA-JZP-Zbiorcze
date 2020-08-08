package pl.sda.ex39;

import java.util.Random;

public class Sensor implements Runnable{
    private ScoreJudge sj;
    private String name;

    public Sensor(String name, ScoreJudge sj) {
        this.sj = sj;
        this.name = name;
    }


    @Override
    public void run() {
        while(true){
            synchronized (sj){
                Random r = new Random();
                Integer newScore = r.nextInt(100);
                Integer currentScore = sj.getScore();
                try {
                    Thread.sleep(r.nextInt(2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name+ " sent score to update " + newScore +" , with old " +currentScore);
                sj.setScore(currentScore, newScore);

            }

        }

    }
}
