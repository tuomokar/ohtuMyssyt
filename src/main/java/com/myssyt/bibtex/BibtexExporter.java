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
    
    private static void exportArtikkeli(Artikkeli article, StringBuilder builder) {
        builder.append("@article{" + article.getBibtexKey() + ",\n");
        builder.append("author = {" + article.getAuthor() + "},\n");
        builder.append("title = {" + article.getTitle() + "},\n");
        builder.append("journal = {" + article.getJournal() + "},\n");
        builder.append("year = {" + article.getYear() + "},\n");
        builder.append("number = {" + article.getNumber() + "},\n");
        builder.append("pages = {" + article.getPages() + "},\n");
        builder.append("month = {" + article.getMonth() + "},\n");
        builder.append("note = {" + article.getNote() + "},\n");
        builder.append("volume = {" + article.getVolume() + "},\n");
        builder.append("}");
    }
    
    private static void exportKirja(Kirja book, StringBuilder builder) {
        builder.append("@book{" + book.getBibtexKey() + ",\n");
        builder.append("author = {" + book.getAuthor() + "},\n");
        builder.append("title = {" + book.getTitle() + "},\n");
        builder.append("publisher = {" + book.getPublisher() + "},\n");
        builder.append("year = {" + book.getYear() + "},\n");
        builder.append("volume = {" + book.getVolume() + "},\n");
        builder.append("series = {" + book.getSeries() + "},\n");
        builder.append("address = {" + book.getAddress() + "},\n");
        builder.append("month = {" + book.getMonth() + "},\n");
        builder.append("note = {" + book.getNote() + "},\n");
        builder.append("ISBN = {" + book.getIsbn() + "},\n");
        builder.append("}");
    }
    
    private static void exportInproceedings(Inproceedings inproceedings, StringBuilder builder) {
        builder.append("@inproceedings{" + inproceedings.getBibtexKey() + ",\n");
        builder.append("author = {" + inproceedings.getAuthor() + "},\n");
        builder.append("title = {" + inproceedings.getTitle() + "},\n");
        builder.append("booktitle = {" + inproceedings.getBooktitle() + "},\n");
        builder.append("year = {" + inproceedings.getYear() + "},\n");
        builder.append("editor = {" + inproceedings.getEditor() + "},\n");
        builder.append("pages = {" + inproceedings.getPages() + "},\n");
        builder.append("organization = {" + inproceedings.getOrganization() + "},\n");
        builder.append("publisher = {" + inproceedings.getPublisher() + "},\n");
        builder.append("address = {" + inproceedings.getAddress() + "},\n");
        builder.append("month = {" + inproceedings.getMonth() + "},\n");
        builder.append("note = {" + inproceedings.getNote() + "},\n");
        builder.append("}");
    }
}

