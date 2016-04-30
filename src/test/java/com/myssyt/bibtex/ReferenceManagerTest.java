package com.myssyt.bibtex;

import com.myssyt.bibtex.domain.Book;
import com.myssyt.bibtex.domain.Booklet;
import com.myssyt.bibtex.domain.Incollection;
import com.myssyt.bibtex.domain.Article;
import com.myssyt.bibtex.domain.Inproceedings;
import com.myssyt.bibtex.domain.Manual;
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
public class ReferenceManagerTest {
    
    private ReferenceManager manager;
    
    public ReferenceManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        manager = new ReferenceManager();
    }
    
    @After
    public void tearDown() {
        File file = new File("references");
        file.delete();
        file = new File("testing.bib");
        file.delete();
    }

    /**
     * Test of lisaaArtikkeli method, of class ViiteManageri.
     */
    @Test
    public void artikkelinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manager.addArticle("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        assertEquals("Adding article succeeded", viesti);
        assertEquals("title", 
                ((Article) manager.getReferences().get(0)).getTitle());
    }
    
    @Test
    public void kirjanLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manager.addBook("bibtexkey", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        
        assertEquals("Adding book succeeded", viesti);
        assertEquals("title", 
                ((Book) manager.getReferences().get(0)).getTitle());
    }
    
    @Test
    public void inproceedingsinLisaysOnnistuuHyvillaArvoilla() {
        String message = manager.addInproceedings("bibtexkey", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        
        assertEquals("Adding inproceedings succeeded", message);
        assertEquals("title", 
                ((Inproceedings) manager.getReferences().get(0)).getTitle());
    }
    
    @Test
    public void incollectioninLisaysOnnistuuHyvillaArvoilla() {
        String message = manager.addIncollection("bibtexkey", "author", 
                "title", "booktitle", "publisher", "year", "editor", "volume", "number", 
                "series", "type", "chapter", "pages", "address",
                "edition", "month", "note");
        
        assertEquals("Adding incollection succeeded", message);
        assertEquals("chapter", 
                ((Incollection) manager.getReferences().get(0)).getChapter());
    }
    
    @Test
    public void bookletinLisaysOnnistuuHyvillaArvoilla() {
        String message = manager.addBooklet("bibtexKey", "title", "author",
                "howpublished", "address", "month", "year", "note");
        
        assertEquals("Adding booklet succeeded", message);
        assertEquals("note", 
                ((Booklet) manager.getReferences().get(0)).getNote());
    }
    
    @Test
    public void manualinLisaysOnnistuuHyvillaArvoilla() {
        String viesti = manager.addManual("bibtexKey","title","author", 
            "organization","address","edition","month", 
            "year","note");
        
        assertEquals("Adding manual succeeded", viesti);
        assertEquals("organization", 
                ((Manual) manager.getReferences().get(0)).getOrganization());
    }
    
    @Test
    public void tiedostonTallennusJaLatausOnnistuu() {
        manager.addArticle("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        String message = manager.saveReferences("references");
        assertEquals("Saving file succeeded", message);
        
        assertEquals(new File("references").isFile(), true);
        
        message = manager.loadReferences("references");
        assertEquals("Loading file succeeded", message);
        
        assertEquals("title",
                ((Article) manager.getReferences().get(0)).getTitle());
    }
    
    @Test
    public void tiedostonExporttausOnnistuu() throws FileNotFoundException,
            IOException {
        manager.addArticle("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        
        String viesti = manager.exportReferences("testing.bib");
        assertEquals("Exporting file succeeded", viesti);
        
        File file = new File("testing.bib");
        assertEquals(file.isFile(), true);
        
        BufferedReader brTest = new BufferedReader(new FileReader(file));
        assertEquals(brTest.readLine(), "@article{bibtexkey,");
    }
    
    @Test
    public void ViitteenPoistoOnnistuu() {
        manager.addArticle("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        manager.removeReference(0);
        assertEquals(0,manager.getReferences().size());
    }
    
    @Test
    public void ArtikkelinMuokkausOnnistuu() {
        manager.addArticle("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        manager.editArticle(0,"muokattu", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
        assertEquals("muokattu",manager.getReferences().get(0).getBibtexKey());
    }
    
    @Test
    public void KirjanMuokkausOnnistuu() {
        manager.addBook("bibtexkey", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        manager.editBook(0, "muokattu", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
        assertEquals("muokattu",manager.getReferences().get(0).getBibtexKey());
    }
    
    @Test
    public void InProceedingsMuokkausOnnistuu() {
        manager.addInproceedings("bibtexkey", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        manager.editInproceedings(0,"muokattu", "author", 
                "title", "booktitle", "year", "editor", "volume", "number", 
                "series", "pages", "address", "month", "organization",
                "publisher", "note");
        assertEquals("muokattu",manager.getReferences().get(0).getBibtexKey());
    }
}
