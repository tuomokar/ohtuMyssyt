package com.myssyt.bibtex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author topi
 */
public class ArtikkeliTest {
    
    protected Artikkeli artikkeli;
    
    public ArtikkeliTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        String journal = "Commun. ACM";
        String title = "Novice mistakes: are the folk wisdoms correct?";
        String author = "Spohrer, James C. and Soloway, Elliot";
        String year = "2006";
        artikkeli = new Artikkeli(null, author, title, journal, year, null, null, null, null, null);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getJournal method, of class Artikkeli.
     */
    @Test
    public void testGetJournal() {
        assertEquals(artikkeli.getJournal(), "Commun. ACM");
    }
    
}
