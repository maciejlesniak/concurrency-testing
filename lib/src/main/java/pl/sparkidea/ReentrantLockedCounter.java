package pl.sparkidea;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockedCounter implements Counter {

    private final ReentrantLock lock = new ReentrantLock();
    private int counter;

    public ReentrantLockedCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public Counter inc() {
        lock.lock();
        try {
            counter++;
            return this;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Counter dec() {
        lock.lock();
        try {
            counter--;
            return this;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public int getCounter() {
        lock.lock();
        try {
            return this.counter;
        } finally {
            lock.unlock();
        }
    }

}
