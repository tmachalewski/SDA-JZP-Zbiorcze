package pl.sda.ex26;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class CarService {

    public void printAllModels(List<Manufacturer> manufacturers){
        Consumer<Model> consumer1 =  o  -> System.out.println(o);
        Set<? super Model> models =
                manufacturers.stream()
                .flatMap(m->m.models.stream())
                .flatMap(m->m.cars.stream())
                .collect(Collectors.toSet());

        System.out.print(models.size());
                //.forEach(consumer1);
    }
}
