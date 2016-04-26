package com.myssyt.bibtex;

public class Booklet extends Viite {
    /*
        A work that is printed and bound, but without a named publisher or sponsoring institution.

        Required fields: title

        Optional fields: author, howpublished, address, month, year, note, key
    */

    private String title;
    private String author;
    private String howpublished;
    private String address;
    private String month;
    private String year; 
    private String note;
    private String bibtexKey;
    
    public Booklet(String bibtexKey, String title, String author, String howpublished, String address, String month, String year, String note) {
        
        super(bibtexKey);
        
        this.title = title;
        this.author = author;
        this.howpublished = howpublished;
        this.address = address;
        this.month = month;
        this.year = year; 
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getHowpublished() {
        return howpublished;
    }

    public String getAddress() {
        return address;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getNote() {
        return note;
    }
    
}