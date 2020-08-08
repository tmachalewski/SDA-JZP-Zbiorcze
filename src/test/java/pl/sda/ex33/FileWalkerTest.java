package pl.sda.ex33;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWalkerTest {

    @Test
    public void showcase(){
        Path path = Paths.get("src/main/resources/logger.properties");

        try (Stream<Path> paths = Files.walk(Paths.get("src/main/resources/"))) {
            paths
                    .filter(Files::isRegularFile)
                    .filter(p->p.toString().endsWith(".txt")||p.toString().endsWith(".properties"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
