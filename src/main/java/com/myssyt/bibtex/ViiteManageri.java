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
    
    public String lisaaArtikkeli(String bibtexkey, String author, String title, String journal, String year, String number, String pages, String month, String note, String volume) {
        Artikkeli artikkeli = new Artikkeli(bibtexkey, author, title, journal, year, number, pages, month, note, volume);
        
        viitteet.add(artikkeli);
        
        return "Artikkelin lisääminen onnistui";
    }
    
    public String lisaaKirja(String bibtexkey, String author, String title, String publisher, String year, String volume, String series, String address, String edition, String month, String note, String isbn) {
        Kirja kirja = new Kirja(bibtexkey, author, title, publisher, year, volume, series, address, edition, month, note, isbn);
        
        viitteet.add(kirja);
        
        return "Kirjan lisääminen onnistui";
    }
    
    public String lisaaInproceedings(String bibtexkey, String author, String title, String booktitle, String year, String editor, String pages, String organization, String publisher, String address, String month, String note) {
        Inproceedings inproceedings = new Inproceedings(bibtexkey, author, title, booktitle, year, editor, pages, organization, publisher, address, month, note);
        
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
