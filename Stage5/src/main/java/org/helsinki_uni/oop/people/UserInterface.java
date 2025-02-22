package org.helsinki_uni.oop.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Person> people;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.people = new ArrayList<>();
    }

    public void start(String magicNumber) {
        System.out.println("Enter your details - " + magicNumber + " will quit:");
        while(true) {
            System.out.println("What's your name? ");
            String name = scanner.nextLine();

            if (name.equals(magicNumber)) { break; }

            System.out.println("What's your age?");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("What's your weight?");
            double weight = Double.parseDouble(scanner.nextLine());

            System.out.println("What's your height?");
            double height = Double.parseDouble(scanner.nextLine());

            Person person = new Person(name, age, weight, height);
            people.add(person);

        }

        for (Person person : people) {
            System.out.println(person);
        }
    }
}
