package org.helsinki_uni.recap.averageofpositives;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvgMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int input;

        do {
            System.out.println("Add a number (type 0 to quit): ");
            input = Integer.parseInt(scanner.nextLine());
            if (input > 0) {
                numbers.add(input);
            }
        } while (!(input == 0));

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = (double) sum / numbers.size();

        System.out.println("Average of numbers: " + average);
    }
}
