package com.myssyt.bibtex;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class BibtexExporter {
    
    public static void exportBibtex(ArrayList<Viite> lista, String filename) throws FileNotFoundException {
        
        StringBuilder builder = new StringBuilder();
        
        for(Viite viite : lista) {
            if (viite.getClass().equals(Artikkeli.class))
                exportArtikkeli((Artikkeli)viite, builder);
            else if (viite.getClass().equals(Kirja.class))
                exportKirja((Kirja)viite, builder);
            else if (viite.getClass().equals(Inproceedings.class))
                exportInproceedings((Inproceedings)viite, builder);
            
            builder.append("\n\n");
        }
        
        try( PrintWriter out = new PrintWriter(filename)) {
            out.println(builder);
        }
    }
    
    private static boolean isSet(String field) {
        return !(field == null || field.trim().equals(""));
    }
    
    /*
        An article from a journal or magazine. 
            Required fields: 
                author, title, journal, year. 
            Optional fields: 
                volume, number, pages, month, note.
    */
    private static void exportArtikkeli(Artikkeli article, StringBuilder builder) {
        builder.append("@article{" + article.getBibtexKey() + ",\n");
        if (isSet(article.getAuthor())) builder.append("author = {" + article.getAuthor() + "},\n");
        if (isSet(article.getTitle())) builder.append("title = {" + article.getTitle() + "},\n");
        if (isSet(article.getJournal())) builder.append("journal = {" + article.getJournal() + "},\n");
        if (isSet(article.getYear())) builder.append("year = {" + article.getYear() + "},\n");
        if (isSet(article.getVolume())) builder.append("volume = {" + article.getVolume() + "},\n");
        if (isSet(article.getNumber())) builder.append("number = {" + article.getNumber() + "},\n");
        if (isSet(article.getPages())) builder.append("pages = {" + article.getPages() + "},\n");
        if (isSet(article.getMonth())) builder.append("month = {" + article.getMonth() + "},\n");
        if (isSet(article.getNote())) builder.append("note = {" + article.getNote() + "},\n");
        builder.append("}");
    }
    
    /*
        A book with an explicit publisher. 
            Required fields: 
                author or editor, title, publisher, year. 
            Optional fields: 
                volume or number, series, address, edition, month, note.
    */
    private static void exportKirja(Kirja book, StringBuilder builder) {
        builder.append("@book{" + book.getBibtexKey() + ",\n");
        if (isSet(book.getAuthor())) builder.append("author = {" + book.getAuthor() + "},\n");
        if (isSet(book.getEditor())) builder.append("editor = {" + book.getEditor() + "},\n");
        if (isSet(book.getTitle())) builder.append("title = {" + book.getTitle() + "},\n");
        if (isSet(book.getPublisher())) builder.append("publisher = {" + book.getPublisher() + "},\n");
        if (isSet(book.getYear())) builder.append("year = {" + book.getYear() + "},\n");
        if (isSet(book.getVolume())) builder.append("volume = {" + book.getVolume() + "},\n");
        if (isSet(book.getNumber())) builder.append("number = {" + book.getNumber() + "},\n");
        if (isSet(book.getSeries())) builder.append("series = {" + book.getSeries() + "},\n");
        if (isSet(book.getAddress())) builder.append("address = {" + book.getAddress() + "},\n");
        if (isSet(book.getEdition())) builder.append("edition = {" + book.getEdition() + "},\n");
        if (isSet(book.getMonth())) builder.append("month = {" + book.getMonth() + "},\n");
        if (isSet(book.getNote())) builder.append("note = {" + book.getNote() + "},\n");
        builder.append("}");
    }
    
     /*
        An article in a conference proceedings. 
        Required fields: 
            author, title, booktitle, year. 
        Optional fields: 
            editor, volume or number, series, pages, address, month, organization, publisher, note.
    */
    private static void exportInproceedings(Inproceedings inproceedings, StringBuilder builder) {
        builder.append("@inproceedings{" + inproceedings.getBibtexKey() + ",\n");
        if(isSet(inproceedings.getAuthor())) builder.append("author = {" + inproceedings.getAuthor() + "},\n");
        if(isSet(inproceedings.getTitle())) builder.append("title = {" + inproceedings.getTitle() + "},\n");
        if(isSet(inproceedings.getBooktitle())) builder.append("booktitle = {" + inproceedings.getBooktitle() + "},\n");
        if(isSet(inproceedings.getYear())) builder.append("year = {" + inproceedings.getYear() + "},\n");
        if(isSet(inproceedings.getEditor())) builder.append("editor = {" + inproceedings.getEditor() + "},\n");
        if(isSet(inproceedings.getVolume())) builder.append("volume = {" + inproceedings.getVolume() + "},\n");
        if(isSet(inproceedings.getNumber())) builder.append("year = {" + inproceedings.getNumber() + "},\n");
        if(isSet(inproceedings.getSeries())) builder.append("series = {" + inproceedings.getSeries() + "},\n");
        if(isSet(inproceedings.getPages())) builder.append("pages = {" + inproceedings.getPages() + "},\n");
        if(isSet(inproceedings.getAddress())) builder.append("address = {" + inproceedings.getAddress() + "},\n");
        if(isSet(inproceedings.getMonth())) builder.append("month = {" + inproceedings.getMonth() + "},\n");
        if(isSet(inproceedings.getOrganization())) builder.append("organization = {" + inproceedings.getOrganization() + "},\n");
        if(isSet(inproceedings.getPublisher())) builder.append("publisher = {" + inproceedings.getPublisher() + "},\n");
        if(isSet(inproceedings.getNote())) builder.append("note = {" + inproceedings.getNote() + "},\n");
        builder.append("}");
    }
}

