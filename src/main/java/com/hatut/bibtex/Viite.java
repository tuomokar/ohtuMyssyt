package com.hatut.bibtex;

public class Viite {

    private String title;
    private String author;
    private String publisher;
    private int year;

    public Viite(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }
    
    public String getTitle() {
        return this.title;
    }
}
