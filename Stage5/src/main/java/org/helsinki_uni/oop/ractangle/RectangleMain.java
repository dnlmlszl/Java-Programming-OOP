package org.helsinki_uni.oop.ractangle;

import java.util.Scanner;

public class RectangleMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }
}
