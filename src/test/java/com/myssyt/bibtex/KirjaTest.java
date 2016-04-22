package com.myssyt.bibtex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class KirjaTest {
    
    private Kirja instance;
    
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
        instance = new Kirja("bibtexkey", "author", "editor", "title", 
                "publisher", "year", "volume", "number", "series", "address", 
                "edition", "month", "note");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAuthor method, of class Kirja.
     */
    @Test
    public void testGetAuthor() {
        String expResult = "author";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Kirja.
     */
    @Test
    public void testSetAuthor() {
        String author = "abc";
        instance.setAuthor(author);
        assertEquals(author, instance.getAuthor());
    }

    /**
     * Test of getEditor method, of class Kirja.
     */
    @Test
    public void testGetEditor() {
        String expResult = "editor";
        String result = instance.getEditor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEditor method, of class Kirja.
     */
    @Test
    public void testSetEditor() {
        String editor = "abc";
        instance.setEditor(editor);
        assertEquals(editor, instance.getEditor());
    }

    /**
     * Test of getTitle method, of class Kirja.
     */
    @Test
    public void testGetTitle() {
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Kirja.
     */
    @Test
    public void testSetTitle() {
        String title = "abc";
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());
    }

    /**
     * Test of getPublisher method, of class Kirja.
     */
    @Test
    public void testGetPublisher() {
        String expResult = "publisher";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPublisher method, of class Kirja.
     */
    @Test
    public void testSetPublisher() {
        String publisher = "abc";
        instance.setPublisher(publisher);
        assertEquals(publisher, instance.getPublisher());
    }

    /**
     * Test of getYear method, of class Kirja.
     */
    @Test
    public void testGetYear() {
        String expResult = "year";
        String result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class Kirja.
     */
    @Test
    public void testSetYear() {
        String year = "abc";
        instance.setYear(year);
        assertEquals(year, instance.getYear());
    }

    /**
     * Test of getVolume method, of class Kirja.
     */
    @Test
    public void testGetVolume() {
        String expResult = "volume";
        String result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVolume method, of class Kirja.
     */
    @Test
    public void testSetVolume() {
        String volume = "abc";
        instance.setVolume(volume);
        assertEquals(volume, instance.getVolume());
    }

    /**
     * Test of getNumber method, of class Kirja.
     */
    @Test
    public void testGetNumber() {
        String expResult = "number";
        String result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Kirja.
     */
    @Test
    public void testSetNumber() {
        String number = "abc";
        instance.setNumber(number);
        assertEquals(number, instance.getNumber());
    }

    /**
     * Test of getSeries method, of class Kirja.
     */
    @Test
    public void testGetSeries() {
        String expResult = "series";
        String result = instance.getSeries();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeries method, of class Kirja.
     */
    @Test
    public void testSetSeries() {
        String series = "abc";
        instance.setSeries(series);
        assertEquals(series, instance.getSeries());
    }

    /**
     * Test of getAddress method, of class Kirja.
     */
    @Test
    public void testGetAddress() {
        String expResult = "address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Kirja.
     */
    @Test
    public void testSetAddress() {
        String address = "abc";
        instance.setAddress(address);
        assertEquals(address, instance.getAddress());
    }

    /**
     * Test of getEdition method, of class Kirja.
     */
    @Test
    public void testGetEdition() {
        String expResult = "edition";
        String result = instance.getEdition();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEdition method, of class Kirja.
     */
    @Test
    public void testSetEdition() {
        String edition = "abc";
        instance.setEdition(edition);
        assertEquals(edition, instance.getEdition());
    }

    /**
     * Test of getMonth method, of class Kirja.
     */
    @Test
    public void testGetMonth() {
        String expResult = "month";
        String result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMonth method, of class Kirja.
     */
    @Test
    public void testSetMonth() {
        String month = "month";
        instance.setMonth(month);
        assertEquals(month, instance.getMonth());
    }

    /**
     * Test of getNote method, of class Kirja.
     */
    @Test
    public void testGetNote() {
        String expResult = "note";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Kirja.
     */
    @Test
    public void testSetNote() {
        String note = "abc";
        instance.setNote(note);
        assertEquals(note, instance.getNote());
    }
    
}
