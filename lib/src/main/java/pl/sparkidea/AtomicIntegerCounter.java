package pl.sparkidea;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerCounter implements Counter {

    private final AtomicInteger counter;

    public AtomicIntegerCounter(int counter) {
        this.counter = new AtomicInteger(counter);
    }

    @Override
    public Counter inc() {
        counter.incrementAndGet();
        return this;
    }

    @Override
    public Counter dec() {
        counter.decrementAndGet();
        return this;
    }

    @Override
    public synchronized int getCounter() {
        return counter.get();
    }

}
