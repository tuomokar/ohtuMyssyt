/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myssyt.bibtex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KirjaTest {
    
    protected Kirja kirja;
    
    public KirjaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    // String bibtexkey, String author, String title, String publisher, String year, 
    // String volume, String series, String address, String edition, String month, String note, String isbn
    @Before
    public void setUp() {
        kirja = new Kirja(
                "bibtexKey-name",
                "author-name", 
                "title-name",
                "publisher-name",
                "year-name", 
                "volume-name", 
                "series-name", 
                "address-name", 
                "edition-name", 
                "month-name", 
                "note-name",
                "isbn-name");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSeries method, of class Kirja.
     */
    @Test
    public void testGetSeries() {
        assertEquals(kirja.getSeries(), "series-name");
    }
}
