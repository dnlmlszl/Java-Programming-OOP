package org.helsinki_uni.hashmaps.bookcatalog;

import java.util.HashMap;
import java.util.Map;

public class Program {
    private HashMap<String, Book> directory;

    public Program() {
        this.directory = new HashMap<>();
    }

    public void printValues(HashMap<String,Book> hashmap) {
        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Map.Entry<String, Book> entry : hashmap.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
