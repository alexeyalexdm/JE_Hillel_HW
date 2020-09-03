package HW11;

import java.util.Arrays;

public class PrimesFinderThread implements Runnable {

    private int[] localPrimes;
    private int from;
    private int to;
    private PrimesStorage storage;

    public PrimesFinderThread(int[] localPrimes, int from, int to, PrimesStorage storage) {
        this.localPrimes = localPrimes;
        this.from = from;
        this.to = to;
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = from; i < to; i++) {
            if (isPrime(i)) {
                int previousArrayLength = localPrimes.length;
                localPrimes = Arrays.copyOf(localPrimes, previousArrayLength + 1);
                localPrimes[previousArrayLength] = i;
            }
        }
        storage.addPrimes(localPrimes);
    }


    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public PrimesStorage getStorage() {
        return storage;
    }

    public void setStorage(PrimesStorage storage) {
        this.storage = storage;
    }
}
