package org.helsinki_uni.objectsinalist.personalinformation;

import java.util.Scanner;

public class InfoMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersonalInformationCollection ui = new PersonalInformationCollection(scanner);

        ui.start();
    }
}
