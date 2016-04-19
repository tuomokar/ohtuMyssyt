package com.myssyt.bibtex;

import java.io.Serializable;

public class Viite implements Serializable {

    private String bibtexKey;
    private String title;
    private String author;
    private String publisher;
    private String note;
    private String address;
    private String year;
    private String volume;
    private String month;
    

    public Viite(String bibtexKey, String title, String author, String publisher, String note, String address, String year, String volume, String month) {
        this.bibtexKey = bibtexKey;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.note = note;
        this.address = address;
        this.year = year;
        this.month = month;
    }

    public String getBibtexKey() {
        return bibtexKey;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getPublisher() {
        return this.publisher;
    }
    
    public String getNote() {
        return note;
    }

    public String getAddress() {
        return address;
    }
    
    public String getYear() {
        return this.year;
    }

    public String getVolume() {
        return volume;
    }

    public String getMonth() {
        return month;
    }
}
