package pl.sda.ex29;

import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayService {
    public <T> Double onArrayGetProportionOfFullfiledPredicate(Predicate<T> prd, T[] arr){
        long itemsFullfingCondition = Arrays.stream(arr).filter(prd).count();
        return new Double(itemsFullfingCondition)/arr.length;

    }
}
