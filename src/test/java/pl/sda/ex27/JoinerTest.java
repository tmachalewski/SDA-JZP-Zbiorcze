package pl.sda.ex27;

import org.junit.jupiter.api.Test;
import pl.sda.ex26.Car;
import pl.sda.ex26.CarTypeEnum;

public class JoinerTest {
    @Test
    public void showcase(){
        Joiner<Car> j = new Joiner<>("|");
        Car c1 = new Car("c1", "desc1", CarTypeEnum.CABRIO);
        Car c2 = new Car("c2", "desc2", CarTypeEnum.COUPE);
        Car c3 = new Car("c3", "desc3", CarTypeEnum.SEDAN);

        System.out.println(j.join(c1,c2,c3));
    }
}
