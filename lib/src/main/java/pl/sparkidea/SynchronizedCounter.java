package pl.sparkidea;

public class SynchronizedCounter implements Counter {

    private int counter;

    public SynchronizedCounter(int counter) {
        this.counter = counter;
    }

    @Override
    public synchronized SynchronizedCounter inc() {
        counter++;
        return this;
    }

    @Override
    public synchronized SynchronizedCounter dec() {
        counter--;
        return this;
    }

    @Override
    public synchronized int getCounter() {
        return counter;
    }

}
