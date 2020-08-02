package pl.sda.ex14;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayService {

    public Integer[] returnRandomArray(int n, int bound){
        Integer[] arr = new Integer[n];
        Random r = new Random();
        for(int i=0; i<arr.length; i++){
            arr[i]=r.nextInt(bound);
        }
        return arr;
    }

    public List<Integer> returnUniqueValues(Integer[] arr)
    {
        Set<Integer> uniquesValues = new HashSet<>();
        for(Integer i : arr){
            uniquesValues.add(i);
        }
        List<Integer> output = new ArrayList<>(uniquesValues);
        return output;
    }

    public List<Integer> returnDuplicates(Integer[] arr){
        Set<Integer> encountered = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(Integer i : arr){
            if(encountered.contains(i))
            {
                duplicates.add(i);
            }
            else{
                encountered.add(i);
            }
        }
        List<Integer> output = new ArrayList<>(duplicates);
        return output;
    }

    public List<Integer> return3MostFrequentElements(Integer[] arr){
        //List<>
        Map<Integer,Integer> freq = new LinkedHashMap<>();
        for(Integer i : arr){
            if(freq.containsKey(i))
            {
                freq.put(i, freq.get(i)+1);
            }
            else{
                freq.put(i, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> listOfFrequencies = new ArrayList(freq.entrySet());
        Collections.sort(listOfFrequencies, Comparator.comparing((Map.Entry<Integer, Integer> e)->e.getValue()).reversed());

        return listOfFrequencies.stream().limit(3).map((e)->e.getKey()).collect(Collectors.toList());
    }

    public void deduplicate(Integer[] arr, int bound){
        Set<Integer> encountered = new HashSet<>();
        Random r = new Random();
        for(int i=0; i<arr.length; i++) {
            while (encountered.contains(arr[i])) {
                arr[i] = r.nextInt(bound);
            }
            encountered.add(arr[i]);
        }
    }

}
