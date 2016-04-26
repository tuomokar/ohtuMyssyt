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
    
    public String lisaaBooklet(String bibtexKey, String title, String author, String howpublished, String address, String month, 
            String year, String note) {
        
        Booklet booklet = new Booklet(bibtexKey, title, author, howpublished, address, month, 
            year, note);
        
        viitteet.add(booklet);
        
        return "Bookletin lisääminen onnistui";
    }
    
    public String lisaaIncollection(String bibtexkey, String author, String title, String booktitle,
            String publisher, String year, String editor, String volume, String number,
            String series, String type, String chapter, String pages, String address,
            String edition, String month, String note) {
        
        Incollection incollection = new Incollection(bibtexkey, author, title, booktitle, publisher, 
                year, editor, volume, number, series, type, chapter, pages, address, edition, month, note);
                        
        viitteet.add(incollection);
        
        return "Incollectionin lisääminen onnistui";
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
    
    public String poistaViite(int index) {
        viitteet.remove(index);
        return "Viitteen poistaminen onnistui";
    }
    
    public void muokkaaArtikkeli(int index, String bibtexkey,String author,
            String title,String journal,String year,String volume,String number,
            String pages,String month,String note) {
        
        Viite viite = getViitteet().get(index);
        Artikkeli artikkeli = (Artikkeli) viite;
        artikkeli.setBibtexKey(bibtexkey);
                
        artikkeli.setAuthor(author);
        artikkeli.setTitle(title);
        artikkeli.setJournal(journal);
        artikkeli.setYear(year);

        // vapaavalintaiset
        artikkeli.setVolume(volume);
        artikkeli.setNumber(number);
        artikkeli.setPages(pages);
        artikkeli.setMonth(month);
        artikkeli.setNote(note);
    }
    
    public void muokkaaBook(int index, String bibtexkey,String author,
            String title,String editor,String year,String volume,String number,
            String publisher,String month,String note,String series,
            String address, String edition) {
        
        Viite viite = getViitteet().get(index);
        Kirja kirja = (Kirja) viite;
        
        kirja.setBibtexKey(bibtexkey);
                
        // author or editor
        kirja.setAuthor(author);
        kirja.setEditor(editor);
        kirja.setTitle(title);
        kirja.setPublisher(publisher);
        kirja.setYear(year);

        // vapaavalintaiset + volume or number
        kirja.setVolume(volume);
        kirja.setNumber(number);
        kirja.setSeries(series);
        kirja.setAddress(address);
        kirja.setEdition(edition);
        kirja.setMonth(month);
        kirja.setNote(note);
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
