package org.helsinki_uni.recap.containers;

import java.util.Scanner;

public class ContainersMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();

        do {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            System.out.println("Enter command (add, move, remove, quit): ");
            String command = scanner.nextLine();

            if (command.equals("quit")) { break; }

            if (command.startsWith("add")) {
                int amount = Integer.parseInt(command.split(" ")[1]);
                container1.add(amount);
            } else if (command.startsWith("move")) {
                int amount = Integer.parseInt(command.split(" ")[1]);
                int movableAmount = Math.min(amount, container1.getCurrentVolume());
                container1.remove(movableAmount);
                container2.add(movableAmount);
            } else if (command.startsWith("remove")) {
                int amount = Integer.parseInt(command.split(" ")[1]);
                container2.remove(amount);
            }


        } while (true);

    }
}
