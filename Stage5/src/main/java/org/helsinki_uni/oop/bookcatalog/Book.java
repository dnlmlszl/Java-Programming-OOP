package org.helsinki_uni.oop.bookcatalog;

public class Book {
    private String author;
    private String title;
    private int pages;

    public Book(String author, int pages, String title) {
        this.author = author;
        this.pages = pages;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + pages + " pages";
    }
}
