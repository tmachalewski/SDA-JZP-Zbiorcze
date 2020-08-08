package pl.sda.ex39;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ScoreJudgeTest {
    @Test
    public void showcase() throws InterruptedException {
        ScoreJudge sj = new ScoreJudge(0);

        Screen sc1 = new Screen("sc1", sj);
        Screen sc2 = new Screen("sc2", sj);
        Screen sc3 = new Screen("sc3", sj);

        Thread t1 = new Thread(sc1);
        Thread t2 = new Thread(sc2);
        Thread t3 = new Thread(sc3);
        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(3000);

        Sensor s1 = new Sensor("s1", sj);
        Sensor s2 = new Sensor("s2", sj);
        Sensor s3 = new Sensor("s3", sj);

        Thread t4 = new Thread(s1);
        Thread t5 = new Thread(s2);
        Thread t6 = new Thread(s3);
        t4.start();
        t5.start();
        t6.start();

        t1.join();
    }
}
