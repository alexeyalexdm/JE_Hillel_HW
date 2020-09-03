package HW11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();
        int threadsCount = scanner.nextInt();

        PrimesStorage storage = new PrimesStorage();
        Runner runner = new Runner(from, to, threadsCount, storage);

        long start = System.currentTimeMillis();

        runner.startThreads();

        try {
            runner.waitForThreadsCompletion();
        } catch (InterruptedException e) {

        }
        long stop = System.currentTimeMillis();

        System.out.println("Time: " + (stop - start));

        for (int number : storage.getPrimes()) {
            System.out.println(number);

        }
    }
}
