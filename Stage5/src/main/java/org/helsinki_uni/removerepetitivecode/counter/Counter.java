package org.helsinki_uni.removerepetitivecode.counter;

public class Counter {
    private int value;

    public Counter(int initialValue) {
        this.value = initialValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }
    public void increase() {
        increase(1);
    }
    public void increase(int extraValue) {
        this.value = this.value + extraValue;
    }
    public void decrease() {
        decrease(1);
    }
    public void decrease(int extraValue) {
        this.value = this.value - extraValue;
    }
}
