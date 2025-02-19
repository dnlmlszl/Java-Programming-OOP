package org.helsinki_uni.objectsinalist.people;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInterface ui = new UserInterface(scanner);

        ui.start();
    }

}
