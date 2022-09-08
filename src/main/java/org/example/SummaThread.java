package org.example;

import java.util.stream.IntStream;
import static org.example.Main.array;

public class SummaThread extends  Thread {
    public void run() {

        try {
            int count = IntStream.of(array).sum();
            System.out.println(count + " - the sum of the array.");

            Thread.sleep(500);
        }

        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
