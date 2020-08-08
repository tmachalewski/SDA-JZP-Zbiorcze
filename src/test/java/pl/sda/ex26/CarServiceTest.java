package pl.sda.ex26;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarServiceTest {
    @Test
    public void showcase(){
        Car c1 = new Car("c1", "desc1", CarTypeEnum.CABRIO);
        Car c2 = new Car("c2", "desc2", CarTypeEnum.COUPE);
        Car c3 = new Car("c3", "desc3", CarTypeEnum.SEDAN);
        Car c4 = new Car("c4", "desc4", CarTypeEnum.HATCHBACK);

        Model mo1 = new Model("mo1", 1900, Arrays.asList(c1));
        Model mo2 = new Model("mo2", 1925, Arrays.asList(c1, c2));
        Model mo3 = new Model("mo3", 1950, Arrays.asList(c3));
        Model mo4 = new Model("mo4", 1975, Arrays.asList(c2,c3,c4));

        Manufacturer man1 = new Manufacturer("man1", 1910, Arrays.asList(mo4));
        Manufacturer man2 = new Manufacturer("man2", 1935, Arrays.asList(mo3, mo2));
        Manufacturer man3 = new Manufacturer("man3", 1960, Arrays.asList(mo1));
        Manufacturer man4 = new Manufacturer("man4", 1985, Arrays.asList(mo4,mo1,mo2));

        List<Manufacturer> mans = new ArrayList<>();
        mans.add(man1);
        mans.add(man2);
        mans.add(man3);
        mans.add(man4);
        CarService cs = new CarService();

        //cs.printAllModels(mans);
        //cs.printAllCars(mans);
        //cs.printAllManufacturerNames(mans);
        //cs.printAllModelsProducedInEvenYear(mans);

        //cs.printAllModelsProducedInEvenYearMethodReferenceVersion(mans);
        cs.printAllCarsProducedInEvenYearByProducersFoundedInOddYear(mans);
    }
}
