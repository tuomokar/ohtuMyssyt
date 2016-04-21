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
    
    public String getSeries() {
        return series;
    }

    public String getEdition() {
        return edition;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}