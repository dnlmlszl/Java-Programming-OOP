package org.helsinki_uni.hashmaps.abbreviations;

import java.util.HashMap;

public class ProgramMain {
    public static void main(String[] args) {
        Program program = new Program();

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        program.printKeys(hashmap);
        System.out.println("---");

        program.printKeysWhere(hashmap, "i");
        System.out.println("---");

        program.printValuesOfKeysWhere(hashmap, ".e");
        System.out.println("---");
    }
}
