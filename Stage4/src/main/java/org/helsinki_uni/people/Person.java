package org.helsinki_uni.people;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.age = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
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
}
