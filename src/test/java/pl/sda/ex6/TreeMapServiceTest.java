package pl.sda.ex6;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

public class TreeMapServiceTest {

    @Test
    public void showcase(){
        TreeMapService tms = new TreeMapService();

        TreeMap map = new TreeMap();
        map.put(1, 5);
        map.put(3, 1);
        map.put(2, 4);

        tms.printFirstAndLastEntry(map);

    }
}
