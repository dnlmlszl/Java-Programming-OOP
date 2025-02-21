package org.helsinki_uni.objectsinalist.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private List<Book> books;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.books = new ArrayList<>();
    }

    public void start() {
        System.out.println("Book Catalog System");

        while (true) {
            System.out.println("Title - empty prompt will quit the program: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) { break; }

            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));

        }

        System.out.println("What information will be printed?");

        String command = scanner.nextLine().toLowerCase();

        if (!command.equals("everything") && !command.equals("title") &&
                !command.equals("pages") && !command.equals("year")) {
            System.out.println("Unknown command. Please enter 'everything', 'title', 'pages', or 'year'.");
            return;
        }

        for (Book book : books) {

            switch (command) {
                case "everything" -> System.out.println(book);
                case "title" -> System.out.println(book.getTitle());
                case "pages" -> System.out.println(book.getPages());
                case "year" -> System.out.println(book.getPublicationYear());
            }
        }
    }
}
