package org.helsinki_uni.objectsasparameter.dates;

public class Person {
    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
        this.weight = 0;
        this.height = 0;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
        this.weight = 0;
        this.height = 0;
    }

    @Override
    public String toString() {
        return this.name + ", born on " + this.birthday;
    }
}
