package com.myssyt.bibtex;

public class Incollection extends Viite {

    private String author;
    private String title;
    private String booktitle;
    private String publisher;
    private String year;

    private String editor;
    private String volume;
    private String number;
    private String series;
    private String type;
    private String chapter;
    private String pages;
    private String address;
    private String edition;
    private String month;
    private String note;

    public Incollection(String bibtexkey, String author, String title, String booktitle,
            String publisher, String year, String editor, String volume, String number,
            String series, String type, String chapter, String pages, String address,
            String edition, String month, String note) {

        super(bibtexkey);

        this.author = author;
        this.title = title;
        this.booktitle = booktitle;
        this.publisher = publisher;
        this.year = year;

        this.editor = editor;
        this.volume = volume;
        this.number = number;
        this.series = series;
        this.type = type;
        this.chapter = chapter;
        this.pages = pages;
        this.address = address;
        this.edition = edition;
        this.month = month;
        this.note = note;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
