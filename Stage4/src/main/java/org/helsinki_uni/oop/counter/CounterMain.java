package org.helsinki_uni.oop.counter;

public class CounterMain {
    public static void main(String[] args) {
        Counter decreaseCounter = new Counter(100);

        decreaseCounter.printValue();

        decreaseCounter.resetCounter();
        decreaseCounter.printValue();

        decreaseCounter.decrement();
        decreaseCounter.printValue();

    }
}
