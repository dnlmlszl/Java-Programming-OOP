package org.helsinki_uni.hashmaps.abbreviations;

import java.util.HashMap;

public class Abbreviations {
    HashMap<String, Abbreviation> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        abbreviations.put(abbreviation.toLowerCase(), new Abbreviation(abbreviation, explanation));
    }

    public boolean hasAbbreviation(String abbreviation) {
        return abbreviations.containsKey(abbreviation.toLowerCase());
    }

    public String findExplanationFor(String abbreviation) {
        abbreviation = abbreviation.toLowerCase();

        if (abbreviations.containsKey(abbreviation)) {
            return abbreviations.get(abbreviation).getExplanation();
        }

        return "Explanation nit found";
    }
}
