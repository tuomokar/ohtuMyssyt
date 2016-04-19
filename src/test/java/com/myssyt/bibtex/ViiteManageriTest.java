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
import java.io.*;
/**
 *
 * @author oplindst
 */
public class ViiteManageriTest {
    
    private String journal;
    private String title;
    private String author;
    private String publisher;
    private int year;
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
        journal = "Commun. ACM";
        title = "Novice mistakes: are the folk wisdoms correct?";
        author = "Spohrer, James C. and Soloway, Elliot";
        publisher = "Consortium for Computing Sciences in Colleges";
        year = 2006;
        manageri = new ViiteManageri();
    }
    
    @After
    public void tearDown() {
        File file = new File("viitteet");
        file.delete();
        file = new File("testi.bib");
        file.delete();
    }

    /**
     * Test of lisaaArtikkeli method, of class ViiteManageri.
     */
    @org.junit.Test
    public void artikkelinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaArtikkeli(journal, title, author, publisher, year);
        
        assertEquals("Artikkelin lisääminen onnistui", viesti);
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @org.junit.Test
    public void tiedostonTallennusJaLatausOnnistuu() {
        String viesti = manageri.lisaaArtikkeli(journal, title, author, publisher, year);
        
        viesti = manageri.tallennaViitteet("viitteet");
        assertEquals("Tiedoston tallennus onnistui", viesti);
        
        assertEquals(new File("viitteet").isFile(), true);
        
        viesti = manageri.lataaViitteet("viitteet");
        assertEquals("Tiedoston lataus onnistui", viesti);
        
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @org.junit.Test
    public void tiedostonExporttausOnnistuu() throws FileNotFoundException, IOException {
        manageri.lisaaArtikkeli(journal, title, author, publisher, year);
        
        String viesti = manageri.exportViitteet("testi.bib");
        assertEquals("Tiedoston exporttaus onnistui", viesti);
        
        File file = new File("testi.bib");
        assertEquals(file.isFile(), true);
        
        BufferedReader brTest = new BufferedReader(new FileReader(file));
        assertEquals(brTest.readLine(), "@article{KEY,");
    }
}
