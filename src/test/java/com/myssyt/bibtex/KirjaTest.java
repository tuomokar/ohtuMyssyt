package com.myssyt.bibtex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KirjaTest {
    
    private Kirja kirja;
    
    public KirjaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        kirja = new Kirja("bibtexkey", "author", "title", "publisher", 
                "year", "volume", "series", "address", "edition", "month", 
                "note", "isbn");
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSeries method, of class Kirja.
     */
    @Test
    public void testGetSeries() {
        String expResult = "series";
        String result = kirja.getSeries();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEdition method, of class Kirja.
     */
    @Test
    public void testGetEdition() {
        String expResult = "edition";
        String result = kirja.getEdition();
        assertEquals(expResult, result);
    }

    /**
     * Test of getIsbn method, of class Kirja.
     */
    @Test
    public void testGetIsbn() {
        String expResult = "isbn";
        String result = kirja.getIsbn();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeries method, of class Kirja.
     */
    @Test
    public void testSetSeries() {
        String series = "1";
        kirja.setSeries(series);
        assertEquals(series, kirja.getSeries());
    }

    /**
     * Test of setEdition method, of class Kirja.
     */
    @Test
    public void testSetEdition() {
        String edition = "2";
        kirja.setEdition(edition);
        assertEquals(edition, kirja.getEdition());
    }

    /**
     * Test of setIsbn method, of class Kirja.
     */
    @Test
    public void testSetIsbn() {
        String isbn = "3";
        kirja.setIsbn(isbn);
        assertEquals(isbn, kirja.getIsbn());
    }
    
}
