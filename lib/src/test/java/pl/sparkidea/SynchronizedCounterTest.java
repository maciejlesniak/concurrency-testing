package pl.sparkidea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SynchronizedCounterTest {

    @Test
    void inc_shouldIncrementCounterByOne_whenInvoked() {
        assertEquals(1, new SynchronizedCounter(0).inc().getCounter());
    }

    @Test
    void dec_shouldDecrementCounterByOne_whenInvoked() {
        assertEquals(0, new SynchronizedCounter(1).dec().getCounter());
    }

}
