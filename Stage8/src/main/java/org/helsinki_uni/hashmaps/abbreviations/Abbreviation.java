package org.helsinki_uni.hashmaps.abbreviations;

public class Abbreviation {
    private String abbreviation;
    private String explanation;

    public Abbreviation(String word, String abbreviation) {
        this.abbreviation = word;
        this.explanation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return abbreviation + ": "+ explanation;
    }
}
