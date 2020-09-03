package HW11;

import HW11.PrimesStorage;

public class Runner {

    private int fromIndex;
    private int toIndex;
    private int threadsCount;
    private Thread[] finderThreads;
    private PrimesStorage storage;

    public Runner(int fromIndex, int toIndex, int threadsCount, Thread[] finderThreads, PrimesStorage storage) {
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.threadsCount = threadsCount;
        this.finderThreads = finderThreads;
        this.storage = storage;
        divideIntervalToSubIntervalsBetweenThreads();
    }

    public Runner(int from, int to, int threadsCount, PrimesStorage storage) {

    }

    public void startThreads() {
        for (Thread thread : finderThreads) {
            thread.start();
        }
    }

    public void waitForThreadsCompletion() throws InterruptedException {
        for (Thread thread : finderThreads) {
            thread.join();
        }
    }

    private void divideIntervalToSubIntervalsBetweenThreads() {
        int period = (toIndex - fromIndex) / threadsCount;
        finderThreads = new Thread[threadsCount];
        int tFrom = fromIndex;
        int tTo = fromIndex;
        for (int i = 0; i < threadsCount; i++) {
            if (isFirstThread(i)) {
                tTo += period;
            } else if (isLastThread(i)) {
                tFrom += period;
                tTo = toIndex;
            } else {
                tFrom += period;
                tTo += period;
            }
            finderThreads[i] = new Thread(new PrimesFinderThread(tFrom + 1, tTo, storage));
        }
    }

    private boolean isLastThread(int index) {
        return index == this.threadsCount - 1;
    }

    private boolean isFirstThread(int index) {
        return index == 0;

    }

}
