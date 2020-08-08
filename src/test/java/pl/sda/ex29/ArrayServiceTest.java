package pl.sda.ex29;

import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

public class ArrayServiceTest {

    @Test
    public void showcase(){
        Integer[] arr = new Integer[]{5,4,3,2,1,0};
        Predicate<Integer> pr = (Integer i)->i>3;

        ArrayService as = new ArrayService();
        System.out.println(as.onArrayGetProportionOfFullfiledPredicate(pr, arr));
    }
}
