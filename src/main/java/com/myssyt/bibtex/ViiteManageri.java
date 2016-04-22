package com.myssyt.bibtex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oplindst
 */
import java.util.ArrayList;

public class ViiteManageri {
    
    private ArrayList<Viite> viitteet;
    
    public ViiteManageri() {
        viitteet = new ArrayList<>();
    }
    
    public ArrayList<Viite> getViitteet() {
        return viitteet;
    }
    
    public String lisaaArtikkeli(String bibtexkey, String author, String title, 
            String journal, String year, String volume, String number, 
            String pages, String month, String note) {
        
            Artikkeli artikkeli = new Artikkeli(bibtexkey, author, title, 
                    journal, year, volume, number, pages, month, note);
        
        viitteet.add(artikkeli);
        
        return "Artikkelin lisääminen onnistui";
    }
    
    public String lisaaKirja(String bibtexkey, String author, String editor, 
            String title, String publisher, String year, String volume, 
            String number, String series, String address, String edition, 
            String month, String note) {
        
        Kirja kirja = new Kirja(bibtexkey, author, editor, title, publisher, 
                year, volume, number, series, address, edition, month, note);
            
        viitteet.add(kirja);
        
        return "Kirjan lisääminen onnistui";
    }
    
    public String lisaaInproceedings(String bibtexkey, String author, String title, 
            String booktitle, String year, String editor, String volume, 
            String number, String series, String pages, String address, 
            String month, String organization, String publisher,
            String note) {
        
        Inproceedings inproceedings = new Inproceedings(bibtexkey, author,
            title, booktitle, year, editor, volume, number, series, pages,
            address, month, organization, publisher, note);
        
        viitteet.add(inproceedings);
        
        return "Inproceedingsin lisääminen onnistui";
    }
    
    public String tallennaViitteet(String nimi) {
        try {
            FileHandler.writeFile(viitteet, nimi);
            return "Tiedoston tallennus onnistui";
        }
        catch (Exception e) {
            return "Tiedoston tallennus epäonnistui";
        }
    }
    
    public String lataaViitteet(String nimi) {
        try {
            viitteet = FileHandler.readFile(nimi);
            return "Tiedoston lataus onnistui";
        }
        catch (Exception e) {
            viitteet = new ArrayList<>();
            return "Tiedoston lataus epäonnistui";
        }
    }
    
    public String exportViitteet(String nimi) {
        try {
            BibtexExporter.exportBibtex(viitteet, nimi);
            return "Tiedoston exporttaus onnistui";
        }
        catch (Exception e) {
            return "Tiedoston exporttaus epäonnistui";
        }
    }
}
