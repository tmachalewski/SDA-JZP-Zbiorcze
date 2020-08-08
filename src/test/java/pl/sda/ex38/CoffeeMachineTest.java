package pl.sda.ex38;

import org.junit.jupiter.api.Test;

public class CoffeeMachineTest {

    @Test
    public void showcase() throws InterruptedException {
        CoffeMachine cf = new CoffeMachine(5);
        Thread d1 = new Thread(new Drinker(cf));
        Thread d2 = new Thread(new Drinker(cf));
        Thread d3 = new Thread(new Drinker(cf));
        Thread f1 = new Thread(new Filler(cf));

        d1.start();
        d2.start();
        d3.start();
        f1.start();

        d1.join();

    }
}
