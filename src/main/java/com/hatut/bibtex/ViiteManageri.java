package com.hatut.bibtex;

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
    
    public String tallennaViitteet() {
        try {
            FileHandler.writeFile(viitteet, "viitteet");
            return "Tiedoston tallennus onnistui";
        }
        catch (Exception e) {
            return "Tiedoston tallennus epäonnistui";
        }
    }
    
    public String lataaViitteet() {
        try {
            viitteet = FileHandler.readFile("viitteet");
            return "Tiedoston lataus onnistui";
        }
        catch (Exception e) {
            viitteet = new ArrayList<>();
            return "Tiedoston lataus epäonnistui";
        }
    }
}
