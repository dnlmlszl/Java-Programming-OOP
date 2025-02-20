package org.helsinki_uni.objectsinalist.items;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;
    private ArrayList<Item> items;
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.items = new ArrayList<>();
    }

    public void start() {
        while (true) {
            System.out.println("Enter a name, empty will stop: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            items.add(new Item(name));
        }

        System.out.println();
        System.out.println("Items in total: " + items.size());
        System.out.println("Items: ");

        for (Item item : items) {
            System.out.println(item);
        }
    }
}
