package org.helsinki_uni.statistics;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private final Statistics statistics = new Statistics();

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter numbers - '-1' stops the program:");
        while (true) {
            System.out.println("Add next:");
            try {
                int num = Integer.parseInt(scanner.nextLine());
                if (num == -1) {
                    break;
                }
                statistics.addNumber(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statistics.sumEven());
        System.out.println("Sum of odd numbers: " + statistics.sumOdd());
        System.out.println("Average: " + statistics.average());
    }
}
