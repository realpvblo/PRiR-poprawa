// package JAVA;
// import java.util.Random;
// import java.util.Scanner;
// import java.util.concurrent.Semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class zad1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final int start = i * 10 + 1;
            final int end = (i + 1) * 10 + 1;
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    int sum = 0;
                    for (int j = start; j < end; j++) {
                        sum += j;
                    }
                    double average = (double) sum / (end - start);
                    System.out.println("Suma: " + sum + " Średnia: " + average);
                }
            });
        }

        executor.shutdown();
    }
}
