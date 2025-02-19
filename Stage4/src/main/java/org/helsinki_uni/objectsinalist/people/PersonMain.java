package org.helsinki_uni.objectsinalist.people;

import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        Person john = new Person("John");
        Person matthew = new Person("Matthew");
        Person martin = new Person("Martin");
        people.add(john);
        people.add(matthew);
        people.add(martin);

        for (Person person : people) {
            System.out.println(person);
        }
    }

}
