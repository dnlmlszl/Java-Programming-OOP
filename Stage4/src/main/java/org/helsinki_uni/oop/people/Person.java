package org.helsinki_uni.oop.people;

public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String name) {
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + " - " + this.age + " years old");
    }
    public void growOlder() {
        this.age++;
    }

    public boolean isOfLegalAge() {
        return this.age > 18;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / Math.pow(heightPerHundred, 2);
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();
    }
}
