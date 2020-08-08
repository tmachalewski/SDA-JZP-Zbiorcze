package pl.sda.ex31;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileServiceTest {
    @Test
    public void showcase() throws IOException {

        Path path = Paths.get("src/main/resources/logger.properties");
        assertTrue(Files.exists(path));

        List<String> lines = Files.readAllLines(path);

        Map<String, Integer> freq = new HashMap<>();
        for(String line : lines){
            String[] splited = line.split("[\\.\\=\\s]");
            for(String word : splited)
            {
                if(!freq.containsKey(word)){
                    freq.put(word, 1);
                }
                else{
                    int currentFreq = freq.get(word);
                    freq.put(word, currentFreq+1);
                }
            }
        }
        freq.remove("");

        Path outputFile = Paths.get("src/main/resources/frequencyTable.txt");
        try(BufferedWriter bw = Files.newBufferedWriter(outputFile)){
            for(Map.Entry<String, Integer> entry : freq.entrySet()){
                bw.write(entry.getKey() + " : " + entry.getValue()+System.lineSeparator());
            }
        }
    }
}
