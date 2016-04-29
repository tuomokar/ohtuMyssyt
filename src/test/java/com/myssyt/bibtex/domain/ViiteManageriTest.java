package com.myssyt.bibtex.domain;

import com.myssyt.bibtex.ViiteManageri;
import com.myssyt.bibtex.domain.Artikkeli;
import com.myssyt.bibtex.domain.Incollection;
import com.myssyt.bibtex.domain.Booklet;
import com.myssyt.bibtex.domain.Inproceedings;
import com.myssyt.bibtex.domain.Kirja;
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
        String viesti = manageri.lisaaArtikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        assertEquals("Artikkelin lisääminen onnistui", viesti);
        assertEquals("title", 
                ((Artikkeli) manageri.getViitteet().get(0)).getTitle());
    }
    
    @Test
    public void kirjanLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaKirja("bibtexkey", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        
        assertEquals("Kirjan lisääminen onnistui", viesti);
        assertEquals("title", 
                ((Kirja) manageri.getViitteet().get(0)).getTitle());
    }
    
    @Test
    public void inproceedingsinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaInproceedings("bibtexkey", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        
        assertEquals("Inproceedingsin lisääminen onnistui", viesti);
        assertEquals("title", 
                ((Inproceedings) manageri.getViitteet().get(0)).getTitle());
    }
    
    @Test
    public void incollectioninLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaIncollection("bibtexkey", "author", 
                "title", "booktitle", "publisher", "year", "editor", "volume", "number", 
                "series", "type", "chapter", "pages", "address",
                "edition", "month", "note");
        
        assertEquals("Incollectionin lisääminen onnistui", viesti);
        assertEquals("chapter", 
                ((Incollection) manageri.getViitteet().get(0)).getChapter());
    }
    
    @Test
    public void bookletinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manageri.lisaaBooklet("bibtexKey", "title", "author",
                "howpublished", "address", "month", "year", "note");
        
        assertEquals("Bookletin lisääminen onnistui", viesti);
        assertEquals("note", 
                ((Booklet) manageri.getViitteet().get(0)).getNote());
    }
    
    @Test
    public void tiedostonTallennusJaLatausOnnistuu() {
        manageri.lisaaArtikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        String viesti = manageri.tallennaViitteet("viitteet");
        assertEquals("Tiedoston tallennus onnistui", viesti);
        
        assertEquals(new File("viitteet").isFile(), true);
        
        viesti = manageri.lataaViitteet("viitteet");
        assertEquals("Tiedoston lataus onnistui", viesti);
        
        assertEquals("title",
                ((Artikkeli) manageri.getViitteet().get(0)).getTitle());
    }
    
    @Test
    public void tiedostonExporttausOnnistuu() throws FileNotFoundException,
            IOException {
        manageri.lisaaArtikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        String viesti = manageri.exportViitteet("testi.bib");
        assertEquals("Tiedoston exporttaus onnistui", viesti);
        
        File file = new File("testi.bib");
        assertEquals(file.isFile(), true);
        
        BufferedReader brTest = new BufferedReader(new FileReader(file));
        assertEquals(brTest.readLine(), "@article{bibtexkey,");
    }
    
    @Test
    public void ViitteenPoistoOnnistuu() {
        manageri.lisaaArtikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        manageri.poistaViite(0);
        assertEquals(0,manageri.getViitteet().size());
    }
    
    @Test
    public void ArtikkelinMuokkausOnnistuu() {
        manageri.lisaaArtikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        manageri.muokkaaArtikkeli(0,"muokattu", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        assertEquals("muokattu",manageri.getViitteet().get(0).getBibtexKey());
    }
    
    @Test
    public void KirjanMuokkausOnnistuu() {
        manageri.lisaaKirja("bibtexkey", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        manageri.muokkaaBook(0, "muokattu", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        assertEquals("muokattu",manageri.getViitteet().get(0).getBibtexKey());
    }
    
    @Test
    public void InProceedingsMuokkausOnnistuu() {
        manageri.lisaaInproceedings("bibtexkey", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        manageri.muokkaaInProceedings(0,"muokattu", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        assertEquals("muokattu",manageri.getViitteet().get(0).getBibtexKey());
    }
}
