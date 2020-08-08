package pl.sda.ex37;

import pl.sda.ex36.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor e = Executors.newFixedThreadPool(2);

        for(int i=0; i<10; i++){
            e.execute(new ThreadPlaygroundRunnable("w"+i));
        }
    }
}
