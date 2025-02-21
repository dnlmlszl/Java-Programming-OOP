package org.helsinki_uni.objectsinalist.televisionprogram;

import java.util.Scanner;

public class TVMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }
}
