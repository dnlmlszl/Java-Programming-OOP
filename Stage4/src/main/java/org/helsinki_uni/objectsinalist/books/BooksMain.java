package org.helsinki_uni.objectsinalist.books;

import java.util.Scanner;

public class BooksMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }
}
