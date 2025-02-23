package org.helsinki_uni.objectsasparameter.amusement;

public class AmusementParkRide {
    private final String name;
    private final int lowestHeight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }

    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }

        this.visitors++;
        return true;
    }


    @Override
    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight +
                ", visitors: " + this.visitors;
    }
}
