package com.myssyt.bibtex.domain;

/**
 * An article in conference proceedings.
 * 
 * Required fields: author, title, booktitle, year.
 * 
 * Optional fields: editor, volume or number, series, pages, address, month,
 * organization, publisher, note.
 */
public class Inproceedings extends Reference {
    /*
        An article in a conference proceedings. 
        Required fields: 
            author, title, booktitle, year. 
        Optional fields: 
            editor, volume or number, series, pages, address, month, organization, publisher, note.
    */



    public Inproceedings(String bibtexkey, String author, String title, 
            String booktitle, String year, String editor, String volume, 
            String number, String series, String pages, String address, 
            String month, String organization, String publisher,
            String note) {
        
        super(bibtexkey);
        
        super.setAuthor(author);
        super.setTitle(title);
        super.setBooktitle(booktitle);
        super.setYear(year);
        
        super.setEditor(editor);
        super.setVolume(volume);
        super.setNumber(number);
        super.setSeries(series);
        super.setPages(pages);
        super.setAddress(address);
        super.setMonth(month);
        super.setOrganization(organization);
        super.setPublisher(publisher);
        super.setNote(note);

    }

}