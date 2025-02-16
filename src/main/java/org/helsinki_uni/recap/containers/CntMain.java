package org.helsinki_uni.recap.containers;

import java.util.Scanner;

public class CntMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            System.out.println("Enter command (add, move, remove, quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) { break; }

            String[] parts = input.split(" ");
            if (parts.length < 2) {
                System.out.println("Invalid command. Please use the format: <command> <amount>");
                continue;
            }

            String command = parts[0];
            int amount;

            try {
                amount = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount. Please enter a valid integer.");
                continue;
            }

            switch (command.toLowerCase()) {
                case "add" -> container1.add(amount);
                case "move" -> {
                    int movableAmount = Math.min(amount, container1.getCurrentVolume());
                    container1.remove(movableAmount);
                    container2.add(movableAmount);
                }
                case "remove" -> container2.remove(amount);
                default -> System.out.println("Unknown command. Available commands: add, move, remove, quit.");
            }
        }
        System.out.println("Exiting program. Goodbye!");
    }
}
