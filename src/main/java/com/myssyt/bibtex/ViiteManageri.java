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
    
    public String lisaaArtikkeli(String journal, String title, String author, String publisher, int year) {
        Artikkeli artikkeli = new Artikkeli(journal, title, author, publisher, year);
        
        viitteet.add(artikkeli);
        
        return "Artikkelin lisääminen onnistui";
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
