package org.example;

public class Main {
    static int array[];

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello world!");
        long start = System.nanoTime();


        new ArrayThread().start();
        ArrayThread.sleep(10);

        new SummaThread().start();
        new AverageThread().start();


        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.println("Time has passed: " + elapsed / 1000000 + " millisecond.");
    }
}