package ex1;

import java.util.concurrent.locks.Lock;

/** Wrap around Lock to simplify interface */
public class LockWrapper {
    private final Lock lock;

    public LockWrapper(Lock lock) {
        this.lock = lock;
    }

    public void waitForSignal() {
        try {
            synchronized (lock) {
                lock.wait();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
