package com.myssyt.bibtex.domain;

/**
 * A work that is printed and bound, but without a named publisher or sponsoring
 * institution.
 * 
 * Required fields: title.
 * 
 * Optional fields: author, howpublished, address, month, year, note key.
 */
public class Booklet extends Reference {
    
    public Booklet(String bibtexKey, String title, String author, 
            String howpublished, String address, String month, 
            String year, String note) {
        
        super(bibtexKey);
        
        super.setTitle(title);
        super.setAuthor(author);
        super.setHowpublished(howpublished);
        super.setAddress(address);
        super.setMonth(month);
        super.setYear(year);
        super.setNote(note);
        
    }
}