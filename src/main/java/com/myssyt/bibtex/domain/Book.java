package com.myssyt.bibtex.domain;

/**
 * A book with an explicit publisher.
 * 
 * Required fields: author or editor, title, publisher, year.
 * 
 * Optional fields: volume or number, series, address, edition, month, note.
 */
public class Book extends Reference {
   
    public Book(String bibtexkey, String author, String editor, String title, 
            String publisher, String year, String volume, String number, 
            String series, String address, String edition, String month,
            String note) {
        
        super(bibtexkey);
        
        super.setAuthor(author);
        super.setEditor(editor);
        super.setTitle(title);
        super.setPublisher(publisher);
        super.setYear(year);
        
        super.setVolume(volume);
        super.setNumber(number);
        super.setSeries(series);
        super.setAddress(address);
        super.setEdition(edition);
        super.setMonth(month);
        super.setNote(note);

    }

}