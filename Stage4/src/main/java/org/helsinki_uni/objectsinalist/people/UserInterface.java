package org.helsinki_uni.objectsinalist.people;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Person> people;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.people = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Enter a name, empty will stop: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            people.add(new Person(name));
        }

        System.out.println();
        System.out.println("Persons in total: " + people.size());
        System.out.println("Persons: ");

        for (Person person: people) {
            System.out.println(person);
        }
    }


}
