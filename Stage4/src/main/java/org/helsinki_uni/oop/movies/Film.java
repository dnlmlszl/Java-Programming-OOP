package org.helsinki_uni.oop.movies;

public class Film {
    private String name;
    private int ageRating;

    public Film(String title, int rating) {
        this.name = title;
        this.ageRating = rating;
    }

    public String getName() {
        return name;
    }

    public int getAgeRating() {
        return ageRating;
    }
}
