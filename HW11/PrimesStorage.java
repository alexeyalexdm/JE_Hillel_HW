package HW11;


import java.util.Arrays;

public class PrimesStorage {

    private int[] primes;

    public PrimesStorage() {
        primes = new int[0];
    }

    public synchronized void addPrimes(int[] primesToAdd) {
        int previousArrayLength = this.primes.length;
        primes = Arrays.copyOf(primes, previousArrayLength + primesToAdd.length);
        for (int number : primesToAdd) {
            primes[previousArrayLength++] = number;
        }
    }

    public int[] getPrimes() {
        return primes;
    }

    public void setPrimes(int[] primes) {
        this.primes = primes;
    }
}
