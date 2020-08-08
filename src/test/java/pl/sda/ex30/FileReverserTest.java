package pl.sda.ex30;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileReverserTest {

    @Test
    public void showcase() throws IOException {

        Path path = Paths.get("src/main/resources/logger.properties");
        assertTrue(Files.exists(path));

        List<String> lines = Files.readAllLines(path);

        String reversedName = new StringBuffer(path.getFileName().toString()).reverse().toString();

        Path outputFile = Paths.get("src/main/resources/" + reversedName);
        try(BufferedWriter bw = Files.newBufferedWriter(outputFile)){
            for(int i = lines.size()-1; i>=0; i--)
            {
                bw.write(lines.get(i) + System.lineSeparator());
            }
        }
    }

}
