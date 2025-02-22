package org.helsinki_uni.removerepetitivecode.product;

public class Product {
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String location) {
        this(name, location, 1);
    }

    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    @Override
    public String toString() {
        return String.format("%s (%d kg) can be found from the %s", this.name, this.weight, this.location);
    }
}
