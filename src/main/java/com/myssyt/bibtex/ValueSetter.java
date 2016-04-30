package com.myssyt.bibtex;

import com.myssyt.bibtex.domain.Article;
import com.myssyt.bibtex.domain.Book;
import com.myssyt.bibtex.domain.Inproceedings;

/**
 * Offers static methods to set values for a given type of reference
 */
public class ValueSetter {

    public static void setValuesForBook(Book book, String bibtexkey, String author,
            String title, String editor, String year, String volume, String number,
            String publisher, String month, String note, String series,
            String address, String edition) {

        book.setBibtexKey(bibtexkey);

        // author or editor
        book.setAuthor(author);
        book.setEditor(editor);
        book.setTitle(title);
        book.setPublisher(publisher);
        book.setYear(year);

        // optional ones + volume or number
        book.setVolume(volume);
        book.setNumber(number);
        book.setSeries(series);
        book.setAddress(address);
        book.setEdition(edition);
        book.setMonth(month);
        book.setNote(note);
    }

    public static void setValuesForInproceedings(Inproceedings inproceedings,
            String bibtexkey, String author, String title, String booktitle,
            String year, String editor, String volume, String number, String series,
            String pages, String address, String month, String organization,
            String publisher, String note) {

        inproceedings.setBibtexKey(bibtexkey);

        inproceedings.setAuthor(author);
        inproceedings.setTitle(title);
        inproceedings.setBooktitle(booktitle);
        inproceedings.setYear(year);

        // optional ones + volume or number
        inproceedings.setEditor(editor);
        inproceedings.setVolume(volume);
        inproceedings.setNumber(number);
        inproceedings.setSeries(series);
        inproceedings.setPages(pages);
        inproceedings.setAddress(address);
        inproceedings.setMonth(month);
        inproceedings.setOrganization(organization);
        inproceedings.setPublisher(publisher);
        inproceedings.setNote(note);

    }
    
    public static void setValuesForArticle(Article article, String bibtexkey,
            String author, String title, String journal, String year, String volume, 
            String number, String pages, String month, String note) {
        

        article.setBibtexKey(bibtexkey);
                
        article.setAuthor(author);
        article.setTitle(title);
        article.setJournal(journal);
        article.setYear(year);

        // optional ones
        article.setVolume(volume);
        article.setNumber(number);
        article.setPages(pages);
        article.setMonth(month);
        article.setNote(note);
    }

}
