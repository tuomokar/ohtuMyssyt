package com.myssyt.bibtex.domain;

import com.myssyt.bibtex.domain.Inproceedings;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InproceedingsTest {
    
    private Inproceedings instance;
    
    public InproceedingsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Inproceedings("bibtexkey", "author", "title", 
                "booktitle", "year", "editor", "volume", "number", "series", 
                "pages", "address", "month", "organization", "publisher", "note");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAuthor method, of class Inproceedings.
     */
    @Test
    public void testGetAuthor() {
        String expResult = "author";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAuthor method, of class Inproceedings.
     */
    @Test
    public void testSetAuthor() {
        String author = "";
        instance.setAuthor(author);
        assertEquals(author, instance.getAuthor());
    }

    /**
     * Test of getTitle method, of class Inproceedings.
     */
    @Test
    public void testGetTitle() {
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Inproceedings.
     */
    @Test
    public void testSetTitle() {
        String title = "";
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());
    }

    /**
     * Test of getBooktitle method, of class Inproceedings.
     */
    @Test
    public void testGetBooktitle() {
        String expResult = "booktitle";
        String result = instance.getBooktitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBooktitle method, of class Inproceedings.
     */
    @Test
    public void testSetBooktitle() {
        String booktitle = "";
        instance.setBooktitle(booktitle);
        assertEquals(booktitle, instance.getBooktitle());
    }

    /**
     * Test of getYear method, of class Inproceedings.
     */
    @Test
    public void testGetYear() {
        String expResult = "year";
        String result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class Inproceedings.
     */
    @Test
    public void testSetYear() {
        String year = "";
        instance.setYear(year);
        assertEquals(year, instance.getYear());
    }

    /**
     * Test of getEditor method, of class Inproceedings.
     */
    @Test
    public void testGetEditor() {
        String expResult = "editor";
        String result = instance.getEditor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEditor method, of class Inproceedings.
     */
    @Test
    public void testSetEditor() {
        String editor = "";
        instance.setEditor(editor);
        assertEquals(editor, instance.getEditor());
    }

    /**
     * Test of getVolume method, of class Inproceedings.
     */
    @Test
    public void testGetVolume() {
        String expResult = "volume";
        String result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVolume method, of class Inproceedings.
     */
    @Test
    public void testSetVolume() {
        String volume = "";
        instance.setVolume(volume);
        assertEquals(volume, instance.getVolume());
    }

    /**
     * Test of getNumber method, of class Inproceedings.
     */
    @Test
    public void testGetNumber() {
        String expResult = "number";
        String result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Inproceedings.
     */
    @Test
    public void testSetNumber() {
        String number = "";
        instance.setNumber(number);
        assertEquals(number, instance.getNumber());
    }

    /**
     * Test of getSeries method, of class Inproceedings.
     */
    @Test
    public void testGetSeries() {
        String expResult = "series";
        String result = instance.getSeries();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSeries method, of class Inproceedings.
     */
    @Test
    public void testSetSeries() {
        String series = "";
        instance.setSeries(series);
        assertEquals(series, instance.getSeries());
    }

    /**
     * Test of getPages method, of class Inproceedings.
     */
    @Test
    public void testGetPages() {
        String expResult = "pages";
        String result = instance.getPages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPages method, of class Inproceedings.
     */
    @Test
    public void testSetPages() {
        String pages = "";
        instance.setPages(pages);
        assertEquals(pages, instance.getPages());
    }

    /**
     * Test of getAddress method, of class Inproceedings.
     */
    @Test
    public void testGetAddress() {
        String expResult = "address";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Inproceedings.
     */
    @Test
    public void testSetAddress() {
        String address = "";
        instance.setAddress(address);
        assertEquals(address, instance.getAddress());
    }

    /**
     * Test of getMonth method, of class Inproceedings.
     */
    @Test
    public void testGetMonth() {
        String expResult = "month";
        String result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMonth method, of class Inproceedings.
     */
    @Test
    public void testSetMonth() {
        String month = "";
        instance.setMonth(month);
        assertEquals(month, instance.getMonth());
    }

    /**
     * Test of getOrganization method, of class Inproceedings.
     */
    @Test
    public void testGetOrganization() {
        String expResult = "organization";
        String result = instance.getOrganization();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrganization method, of class Inproceedings.
     */
    @Test
    public void testSetOrganization() {
        String organization = "";
        instance.setOrganization(organization);
        assertEquals(organization, instance.getOrganization());
    }

    /**
     * Test of getPublisher method, of class Inproceedings.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        String expResult = "publisher";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPublisher method, of class Inproceedings.
     */
    @Test
    public void testSetPublisher() {
        String publisher = "";
        instance.setPublisher(publisher);
        assertEquals(publisher, instance.getPublisher());
    }

    /**
     * Test of getNote method, of class Inproceedings.
     */
    @Test
    public void testGetNote() {
        String expResult = "note";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Inproceedings.
     */
    @Test
    public void testSetNote() {
        String note = "";
        instance.setNote(note);
        assertEquals(note, instance.getNote());
    }
    
}
