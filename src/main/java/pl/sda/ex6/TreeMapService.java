package pl.sda.ex6;

import java.util.TreeMap;

public class TreeMapService {
    public void printFirstAndLastEntry(TreeMap col){
        System.out.println(col.firstEntry());
        System.out.println(col.lastEntry());
    }
}
