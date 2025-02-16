package org.helsinki_uni.hashmaps.bookcatalog;

import java.util.HashMap;

public class ProgramMain {

    public static void main(String[] args) {
        Program program = new Program();
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        program.printValues(hashmap);
        System.out.println("---");
        program.printValueIfNameContains(hashmap, "prejud");
    }
}
