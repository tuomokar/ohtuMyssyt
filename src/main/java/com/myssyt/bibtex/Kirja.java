package com.myssyt.bibtex;

public class Kirja extends Viite {

    private String series;
    private String edition;
    private String isbn;
    
    public Kirja(String bibtexkey, String author, String title, String publisher, String year, String volume, String series, String address, String edition, String month, String note, String isbn) {
        super(bibtexkey, title, author, publisher, note, address, year, volume, month);
        this.series = series;
        this.edition = edition;
        this.isbn = isbn;
    }
    
}