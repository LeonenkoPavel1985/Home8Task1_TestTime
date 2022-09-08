package org.example;

import java.util.Arrays;
import static org.example.Main.array;

public class AverageThread extends Thread {
    public void run() {

        try {
            double avg = Arrays.stream(array).average().orElse(Double.NaN);
            System.out.println(avg + " - is the arithmetic mean of the array.");

            Thread.sleep(500);
        }

        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
