package org.helsinki_uni.oop.counter;

public class Counter {
    private int value;

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public void decrement() {
        if (this.value > 0) {
            this.value -= 1;
        }
    }

    public void resetCounter() {
        this.value = 0;
    }
}
