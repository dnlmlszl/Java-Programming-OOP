package org.helsinki_uni.recap.containers;

public class Container {
    private int currentVolume;
    private final int capacity;
    private int MAX_CAPACITY = 100;

    public Container() {
        this.currentVolume = 0;
        this.capacity = MAX_CAPACITY;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(int volume) {
        if (volume < 0) {
            System.out.println("Cannot add a negative amount.");
            return;
        }
        currentVolume = Math.min(currentVolume + volume, capacity);
    }

    public void remove(int volume) {
        if (volume < 0) {
            System.out.println("Cannot add a negative amount.");
            return;
        }
        currentVolume = Math.max(currentVolume - volume, 0);
    }

    @Override
    public String toString() {
        return currentVolume + "/" + capacity;
    }
}
