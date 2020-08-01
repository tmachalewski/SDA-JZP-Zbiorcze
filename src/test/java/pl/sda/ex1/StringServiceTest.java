package pl.sda.ex1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringServiceTest {
    @Test
    public void testGetSortedAlphabetiacllyZAShouldSortCorrectly(){
        List<String> listUnsorted = getUnsortedStrings();

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted=ss.getSortedAlphabeticallyZA(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted = Arrays.asList("za", "ab", "aa", "aB", "Ab");

        assertEquals(manuallyListSorted, listSorted);

    }

    @Test
    public void testGetSortedAlphabetiacllyZACaseInsensitiveShouldSortCorrectly() {
        List<String> listUnsorted = getUnsortedStrings();

        StringService ss = new StringService();
        List<String> listSorted = new ArrayList<>();
        listSorted = ss.getSortedAlphabeticallyZACaseInsensitive(listUnsorted);
        System.out.println(listSorted);

        List<String> manuallyListSorted = Arrays.asList("za", "ab", "Ab", "aB", "aa");

        assertEquals(manuallyListSorted, listSorted);
    }
    private List<String> getUnsortedStrings() {
        List<String> listUnsorted = new ArrayList<>();
        listUnsorted.add("ab");
        listUnsorted.add("Ab");
        listUnsorted.add("aa");
        listUnsorted.add("za");
        listUnsorted.add("aB");
        return listUnsorted;
    }
}
