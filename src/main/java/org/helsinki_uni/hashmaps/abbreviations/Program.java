package org.helsinki_uni.hashmaps.abbreviations;

import java.util.HashMap;
import java.util.Map;

public class Program {
    HashMap<String, Abbreviation> abbreviations;

    public Program() {
        this.abbreviations = new HashMap<>();
    }

    public void printKeys(HashMap<String,String> hashmap) {
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }


    public void printKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public void printValuesOfKeysWhere(HashMap<String, String> hashmap, String s) {
        for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            if (entry.getKey().contains(s)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
