package org.helsinki_uni.oop.clock;

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit, int initialValue) {
        this.limit = limit;
        this.value = initialValue;
    }

    public void advance() {
        this.value += 1;

        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        return String.format("%02d", this.value);
    }

}
