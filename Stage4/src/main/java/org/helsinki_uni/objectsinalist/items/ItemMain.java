package org.helsinki_uni.objectsinalist.items;

import java.util.Scanner;

public class ItemMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }
}
