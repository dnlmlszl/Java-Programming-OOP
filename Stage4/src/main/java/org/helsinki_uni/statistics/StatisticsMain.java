package org.helsinki_uni.statistics;

import java.util.Scanner;

public class StatisticsMain {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        Statistics statistics = new Statistics();
//
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
}
