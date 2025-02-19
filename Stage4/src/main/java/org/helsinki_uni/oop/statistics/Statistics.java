package org.helsinki_uni.oop.statistics;

public class Statistics {
    private int count;
    private int sum;
    private int sumOdd;
    private int sumEven;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
        this.sumOdd = 0;
        this.sumEven = 0;
    }

    public void addNumber(int num) {
        this.sum += num;

        if (num % 2 != 0) {
            this.sumOdd += num;
        } else {
            this.sumEven += num;
        }

        this.count++;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return this.sum;
    }

    public int sumOdd() {
        return this.sumOdd;
    }

    public int sumEven() {
        return this.sumEven;
    }

    public double average() {
        return (double) this.sum / this.count;
    }

}
