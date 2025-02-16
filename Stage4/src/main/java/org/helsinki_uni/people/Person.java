package org.helsinki_uni.people;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.age = 0;
        this.name = name;
    }

    public void printPerson() {
        System.out.println(this.name + ": " + this.age + "years old");
    }
    public void growOlder() {
        this.age++;
    }

    public int returnAge() {
        return this.age;
    }
}
