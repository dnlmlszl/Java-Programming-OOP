package org.helsinki_uni.movies;

import java.util.Scanner;

public class MovieMain {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        System.out.println("How old are you?");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println();
        if (age >= chipmunks.getAgeRating()) {
            System.out.println("You may watch the film " + chipmunks.getName());
        } else {
            System.out.println("You may not watch the film " + chipmunks.getName());
        }
    }
}
