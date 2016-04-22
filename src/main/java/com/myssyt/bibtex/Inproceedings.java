package com.myssyt.bibtex;

public class Inproceedings extends Viite {
    /*
        An article in a conference proceedings. 
        Required fields: 
            author, title, booktitle, year. 
        Optional fields: 
            editor, volume or number, series, pages, address, month, organization, publisher, note.
    */
    
    private String author;
    private String title; 
    private String booktitle;
    private String year; 
    
    private String editor; 
    private String volume; 
    private String number; 
    private String series; 
    private String pages; 
    private String address; 
    private String month; 
    private String organization; 
    private String publisher; 
    private String note;


    public Inproceedings(String bibtexkey, String author, String title, 
            String booktitle, String year, String editor, String volume, 
            String number, String series, String pages, String address, 
            String month, String organization, String publisher,
            String note) {
        super(bibtexkey);

        this.author = author;
        this.title = title; 
        this.booktitle = booktitle;
        this.year = year; 

        this.editor = editor; 
        this.volume = volume; 
        this.number = number; 
        this.series = series; 
        this.pages = pages; 
        this.address = address; 
        this.month = month; 
        this.organization = organization; 
        this.publisher = publisher; 
        this.note = note;
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
     * @return the booktitle
     */
    public String getBooktitle() {
        return booktitle;
    }

    /**
     * @param booktitle the booktitle to set
     */
    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
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
     * @return the editor
     */
    public String getEditor() {
        return editor;
    }

    /**
     * @param editor the editor to set
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * @return the volume
     */
    public String getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series the series to set
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * @return the pages
     */
    public String getPages() {
        return pages;
    }

    /**
     * @param pages the pages to set
     */
    public void setPages(String pages) {
        this.pages = pages;
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
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
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