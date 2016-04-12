package com.hatut.bibtex;

public class Artikkeli extends Viite {

    private String journal;

    public Artikkeli(String journal, String title, String author, String publisher, int year) {
        super(title, author, publisher, year);
        this.journal = journal;
    }
    
    public String getJournal() {
        return this.journal;
    }
}
