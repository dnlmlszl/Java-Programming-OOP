package org.helsinki_uni.oop.people;

import java.util.Scanner;

public class ProgramMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);

        ui.start("-111");
    }
}
