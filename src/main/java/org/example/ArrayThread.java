package org.example;
import static org.example.Main.array;

public class ArrayThread extends Thread  {

    public void run() {

        try {
            array = new int[100];

            System.out.println("Your array filled with random numbers:");

            for(int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random() * 11);
            }

            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i] + " ");
            }
            Thread.sleep(500);
        }

        catch (InterruptedException e) {
            System.out.println("e");
        }
    }
}
