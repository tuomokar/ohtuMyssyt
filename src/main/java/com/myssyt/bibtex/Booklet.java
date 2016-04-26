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

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the howpublished
     */
    public String getHowpublished() {
        return howpublished;
    }

    /**
     * @param howpublished the howpublished to set
     */
    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
}