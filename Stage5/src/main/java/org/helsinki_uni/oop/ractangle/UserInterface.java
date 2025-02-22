package org.helsinki_uni.oop.ractangle;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    Rectangle first = new Rectangle(40, 80);
    Rectangle rectangle = new Rectangle(10, 10);

    public void start() {
        System.out.println(first);
        System.out.println(rectangle);

        first.narrow();
        System.out.println(first);
        System.out.println(first.surfaceArea());
    }
}
