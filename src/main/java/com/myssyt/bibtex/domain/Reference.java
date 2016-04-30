package com.myssyt.bibtex.domain;

import java.io.Serializable;

/**
 * A superclass for all types of Bibtex references. All the fields are contained
 * in this class, and the subclasses set the fields as appropriate for each
 * type of reference.
 */
public class Reference implements Serializable {

    private String bibtexKey;
    private boolean exportable;
    
    private String author;
    private String editor;
    private String title;
    private String publisher;
    private String year;
    
    private String volume;
    private String number;
    private String series;
    private String address;
    private String edition;
    
    private String month;
    private String note;   
    private String journal;
    private String pages;
    private String howpublished;
    
    private String booktitle;
    private String type;
    private String chapter;
    private String organization; 


    public Reference(String bibtexKey) {
        this.bibtexKey = bibtexKey;
        exportable = true;
    }

    public String getBibtexKey() {
        return bibtexKey;
    }

    public void setBibtexKey(String bibtexKey) {
        this.bibtexKey = bibtexKey;
    }
    
    public boolean getExportable() {
        return exportable;
    }

    public void setExportable(boolean exportable) {
        this.exportable = exportable;
    }

    public boolean isExportable() {
        return exportable;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getYear() {
        return year;
    }

    public String getVolume() {
        return volume;
    }

    public String getNumber() {
        return number;
    }

    public String getSeries() {
        return series;
    }

    public String getAddress() {
        return address;
    }

    public String getEdition() {
        return edition;
    }

    public String getMonth() {
        return month;
    }

    public String getNote() {
        return note;
    }

    public String getJournal() {
        return journal;
    }

    public String getPages() {
        return pages;
    }

    public String getHowpublished() {
        return howpublished;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getType() {
        return type;
    }

    public String getChapter() {
        return chapter;
    }

    public String getOrganization() {
        return organization;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
    
    
}
