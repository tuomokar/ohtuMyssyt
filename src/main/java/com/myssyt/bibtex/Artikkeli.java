package com.myssyt.bibtex;

public class Artikkeli extends Viite {

    private String journal;
    private String pages;
    private String number;

    public Artikkeli(String bibtexkey, String author, String title, String journal, String year, String number, String pages, String month, String note, String volume) {
        super(bibtexkey, title, author, null, note, null, year, volume, month);
        this.journal = journal;
        this.pages = pages;
        this.number = number;
    }

    public String getJournal() {
        return journal;
    }

    public String getPages() {
        return pages;
    }

    public String getNumber() {
        return number;
    }
    
}
