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
            System.out.println("Enter the details, empty will stop: ");
            String details = scanner.nextLine();

            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String name = parts[0];
            int age = Integer.parseInt(parts[1]);

            people.add(new Person(name, age));
        }

        System.out.println();
        System.out.println("Persons in total: " + people.size());
        System.out.println("Persons: ");

        System.out.println("Select an age limit:");
        int ageLimit = Integer.parseInt(scanner.nextLine());

        for (Person person: people) {
            if (person.getAge() >= ageLimit) {
                System.out.println(person);
            }
        }
    }


}
