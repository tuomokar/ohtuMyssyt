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
        builder.append("@article{KEY,\n");
        builder.append("author = {" + article.getAuthor() + "},\n");
        builder.append("title = {" + article.getTitle() + "},\n");
        builder.append("journal = {" + article.getJournal() + "},\n");
        builder.append("year = {" + article.getYear() + "},\n");
        builder.append("publisher = {" + article.getPublisher() + "},\n");
        builder.append("}");
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Viite> lista = new ArrayList<>();
        lista.add(new Artikkeli("das", "das", "das", "das", 9999));
        lista.add(new Artikkeli("asd", "asd", "asd", "asd", 500));
        exportBibtex(lista, "testi.txt");
    }
}

