package com.myssyt.bibtex.domain;

/**
 * An article from a journal or magazine. 
 * 
 * Required fields: author, title, journal, year.
 * 
 * Optional fields: volume, number, pages, month, note.
 */
public class Article extends Reference {

    public Article(String bibtexkey, String author, String title, 
            String journal, String year, String volume, String number, 
            String pages, String month, String note) {
        
        super(bibtexkey);
        
        super.setAuthor(author);
        super.setTitle(title);
        super.setJournal(journal);
        super.setYear(year);
        super.setJournal(journal);
        super.setYear(year);
        super.setVolume(volume);
        super.setNumber(number);
        super.setPages(pages);
        super.setMonth(month);
        super.setNote(note);
    }

}
