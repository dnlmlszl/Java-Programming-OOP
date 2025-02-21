package org.helsinki_uni.objectsinalist.televisionprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<TelevisionProgram> shows;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.shows = new ArrayList<>();
    }

    public void start() {
        System.out.println("Add your TV shows:");

        while (true) {
            System.out.println("Enter the details of TV show's - title,duration without any space between, empty prompt quits the program: ");
            String details = scanner.nextLine();

            if (details.isEmpty()) {
                break;
            }

            String[] parts = details.split(",");
            String title = parts[0];
            int duration = Integer.parseInt(parts[1]);

            shows.add(new TelevisionProgram(title, duration));
        }

        System.out.println();
        System.out.println("Shows in total: " + shows.size());
        System.out.println("List of shows: ");

        System.out.println("Add your preferred max duration: ");
        int durationLimit = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram show : shows) {
            if (show.getDuration() < durationLimit) {
                System.out.println(show);
            }
        }
    }
}
