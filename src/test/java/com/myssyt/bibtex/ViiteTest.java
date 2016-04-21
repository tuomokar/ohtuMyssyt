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
public class ViiteTest {
    
    protected Viite viite;
    
    public ViiteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        viite = new Viite(
                "bibtexKey-name",
                "title-name",
                "author-name", 
                "publisher-name", 
                "note-name", 
                "address-name", 
                "year-name", 
                "volume-name", 
                "month-name");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPublisher method, of class Viite.
     */
    @Test
    public void testGetBibtexKey() {
        assertEquals(viite.getBibtexKey(), "bibtexKey-name");
    }
}
