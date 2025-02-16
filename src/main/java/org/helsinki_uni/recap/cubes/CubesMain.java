package org.helsinki_uni.recap.cubes;

import java.util.Scanner;

public class CubesMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input;
//        while (true) {
//            System.out.println("Add a reference number (type 'end' to quit):");
//            input = scanner.nextLine();
//            System.out.println(input);
//            if (input.equals("end")) {
//                System.out.println("Goodbye!");
//                return;
//            }
//        }
        do {
            System.out.print("Add a reference number (type 'end' to quit): ");
            input = scanner.nextLine();
            if (!"end".equals(input)) {
                System.out.println("You entered: " + input);
            }
        } while (!"end".equals(input));
        System.out.println("Goodbye!");
        scanner.close();
    }
}
