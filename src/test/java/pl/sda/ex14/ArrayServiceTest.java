package pl.sda.ex14;

import org.junit.jupiter.api.Test;

public class ArrayServiceTest {
    @Test
    public void showcase(){
        ArrayService as = new ArrayService();
        Integer[] arr= new Integer[]{1,1,1,2,4,2,2,3,4,3,3};


        //System.out.println(as.return3MostFrequentElements(arr));
        System.out.println(as.returnDuplicates(arr));
        as.deduplicate(arr, 50);
        System.out.println(as.returnDuplicates(arr));
    }
}
