package com.myssyt.bibtex;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author oplindst
 */
public class ViiteManageriTest {
    
    private String bibtexkey;
    private String journal;
    private String title;
    private String author;
    private String publisher;
    private String year;
    private String booktitle;
    private ViiteManageri manageri;
    
    public ViiteManageriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        bibtexkey = "test";
        journal = "Commun. ACM";
        title = "Novice mistakes: are the folk wisdoms correct?";
        author = "Spohrer, James C. and Soloway, Elliot";
        publisher = "Consortium for Computing Sciences in Colleges";
        year = "2006";
        booktitle = "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education";
        manageri = new ViiteManageri();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lisaaArtikkeli method, of class ViiteManageri.
     */
    @Test
    public void artikkelinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaArtikkeli(bibtexkey, author, title, journal, year, null, null, null, null, null);
        
        assertEquals("Artikkelin lisääminen onnistui", viesti);
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @Test
    public void kirjanLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaKirja(bibtexkey, author, title, publisher, year, null, null, null, null, null, null, null);
        
        assertEquals("Kirjan lisääminen onnistui", viesti);
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @Test
    public void inproceedingsinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaInproceedings(bibtexkey, author, title, booktitle, year, null, null, null, null, null, null, null);
        
        assertEquals("Inproceedingsin lisääminen onnistui", viesti);
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @org.junit.Test
    public void tiedostonTallennusJaLatausOnnistuu() {
        String viesti = manageri.lisaaArtikkeli(null, author, title, journal, year, null, null, null, null, null);
        
        viesti = manageri.tallennaViitteet();
        assertEquals("Tiedoston tallennus onnistui", viesti);
        
        viesti = manageri.lataaViitteet();
        assertEquals("Tiedoston lataus onnistui", viesti);
        
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
}
