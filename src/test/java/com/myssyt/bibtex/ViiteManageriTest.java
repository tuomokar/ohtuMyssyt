package com.myssyt.bibtex;

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
        File file = new File("viitteet");
        file.delete();
        file = new File("testi.bib");
        file.delete();
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
    
    @Test
    public void tiedostonTallennusJaLatausOnnistuu() {
        manageri.lisaaArtikkeli(bibtexkey, author, title, journal, year, null, null, null, null, null);
        
        String viesti = manageri.tallennaViitteet("viitteet");
        assertEquals("Tiedoston tallennus onnistui", viesti);
        
        assertEquals(new File("viitteet").isFile(), true);
        
        viesti = manageri.lataaViitteet("viitteet");
        assertEquals("Tiedoston lataus onnistui", viesti);
        
        assertEquals("Novice mistakes: are the folk wisdoms correct?", manageri.getViitteet().get(0).getTitle());
    }
    
    @Test
    public void tiedostonExporttausOnnistuu() throws FileNotFoundException, IOException {
        manageri.lisaaArtikkeli(bibtexkey, author, title, journal, year, null, null, null, null, null);
        
        String viesti = manageri.exportViitteet("testi.bib");
        assertEquals("Tiedoston exporttaus onnistui", viesti);
        
        File file = new File("testi.bib");
        assertEquals(file.isFile(), true);
        
        BufferedReader brTest = new BufferedReader(new FileReader(file));
        assertEquals(brTest.readLine(), "@article{test,");
    }
}
