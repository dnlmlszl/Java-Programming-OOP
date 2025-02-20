package org.helsinki_uni.objectsinalist.personalinformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalInformationCollection {
    private Scanner scanner;
    private List<PersonalInformation> people;

    public PersonalInformationCollection(Scanner scanner) {
        this.scanner = scanner;
        this.people = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Enter a first name, empty will stop: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.println("Enter a last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter a Identification number: ");
            String idNum = scanner.nextLine();

            people.add(new PersonalInformation(firstName, lastName, idNum));
        }

        for (PersonalInformation info : people) {
            System.out.println(info);
        }
    }
}
