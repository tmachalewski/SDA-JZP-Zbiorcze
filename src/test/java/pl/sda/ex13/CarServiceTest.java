package pl.sda.ex13;

import org.junit.jupiter.api.Test;
import pl.sda.ex12.Car;
import pl.sda.ex12.EngineEnum;
import pl.sda.ex12.Manufacturer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarServiceTest {

    @Test
    public void yearComparatorMethodShouldReturnCorrectCars()
    {
        Manufacturer man1 = new Manufacturer("m1", "c1", 1950);
        Manufacturer man2 = new Manufacturer("m2", "c1", 1975);
        Manufacturer man3 = new Manufacturer("m3", "c1", 2000);
        //Manufacturer man4 = new Manufacturer("m4", "c1", 2020);

        Car car1 = new Car("ca1", "mo1", 40.0d, 2000, Arrays.asList(man1, man2), EngineEnum.V12);
        Car car2 = new Car("ca2", "mo1", 40.0d, 2000, Arrays.asList(man2), EngineEnum.V12);
        Car car3 = new Car("ca3", "mo1", 40.0d, 2000, Arrays.asList(man3), EngineEnum.V12);
        Car car4 = new Car("ca4", "mo1", 40.0d, 2000, Arrays.asList(man2, man3), EngineEnum.V12);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        CarService cs = new CarService(cars);

        assertEquals(
                Arrays.asList(car4, car2, car1),
                cs.returnCarsManufactureByManufacturerWithCreationYearsSpecifiedWithComparator(1975, CarServiceComparatorEnum.LESS_OR_EQUAL)
        );
    }
}
