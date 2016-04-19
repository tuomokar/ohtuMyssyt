package com.myssyt.bibtex;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;

public class BibtexExporter {
    
    public static void exportBibtex(ArrayList<Viite> lista, String filename) throws FileNotFoundException {
        
        StringBuilder builder = new StringBuilder();
        
        for(Viite viite : lista) {
            if (viite.getClass().equals(Artikkeli.class))
                exportArticle((Artikkeli)viite, builder);
            
            builder.append("\n\n");
        }
        
        try( PrintWriter out = new PrintWriter(filename)) {
            out.println(builder);
        }
    }
    
    private static void exportArticle(Artikkeli article, StringBuilder builder) {
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
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Viite> lista = new ArrayList<>();
        lista.add(new Artikkeli("key", "author", "title", "journal", "year", "number", "pages", "month", "note", "volume"));
        lista.add(new Artikkeli("key2", "author2", "title2", "journal2", "year2", "number2", "pages2", "month2", "note2", "volume2"));
        exportBibtex(lista, "testi.txt");
    }
}

