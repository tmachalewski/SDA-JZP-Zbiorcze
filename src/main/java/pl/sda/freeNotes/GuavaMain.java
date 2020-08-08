package pl.sda.freeNotes;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.SetMultimap;
import com.google.common.collect.TreeMultimap;

public class GuavaMain {

    public static void main(String[] args) {
        ListMultimap<Integer, Double> lmm = ArrayListMultimap.create();
        SetMultimap<Integer,Double> smm = TreeMultimap.create();

        lmm.put(1,2.0);
        lmm.put(1,3.0);
        lmm.put(1,3.0);
        lmm.put(1,4.0);
        lmm.put(2,2.0);

        smm.put(1,2.0);
        smm.put(1,3.0);
        smm.put(1,3.0);
        smm.put(1,4.0);
        smm.put(2,2.0);

        System.out.println(lmm);
        System.out.println(smm);
        lmm.asMap().entrySet();
    }
}
