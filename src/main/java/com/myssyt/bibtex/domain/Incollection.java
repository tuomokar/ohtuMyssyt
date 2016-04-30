package com.myssyt.bibtex.domain;

/**
 * A part of a book having its own title.
 * 
 * Required fields: author, title, booktitle, publisher, year.
 * 
 * Optional fields: editor, volume or number, series, type, chapter, pages,
 * address, edition, month, note.
 */
public class Incollection extends Reference {

    public Incollection(String bibtexkey, String author, String title, String booktitle,
            String publisher, String year, String editor, String volume, String number,
            String series, String type, String chapter, String pages, String address,
            String edition, String month, String note) {

        super(bibtexkey);
        
        super.setAuthor(author);
        super.setTitle(title);
        super.setBooktitle(booktitle);
        super.setPublisher(publisher);
        super.setYear(year);
        
        super.setEditor(editor);
        super.setVolume(volume);
        super.setNumber(number);
        super.setSeries(series);
        super.setType(type);
        super.setChapter(chapter);
        super.setPages(pages);
        super.setAddress(address);
        super.setEdition(edition);
        super.setMonth(month);
        super.setNote(note);

    }

}
