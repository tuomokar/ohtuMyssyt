package com.myssyt.bibtex;

public class Inproceedings extends Viite {
    
    private String booktitle;
    private String editor;
    private String pages;
    private String organization;

    public Inproceedings(String bibtexkey, String author, String title, String booktitle, String year, String editor, String pages, String organization, String publisher, String address, String month, String note) {
        super(bibtexkey, title, author, publisher, note, address, year, null, month);
        this.booktitle = booktitle;
        this.editor = editor;
        this.pages = pages;
        this.organization = organization;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getEditor() {
        return editor;
    }

    public String getPages() {
        return pages;
    }

    public String getOrganization() {
        return organization;
    }
    
}