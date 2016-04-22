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

/**
 *
 * @author omena
 */
public class ArtikkeliTest {
    
    Artikkeli instance;
    
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
        instance = new Artikkeli("bibtexkey", "author", "title", 
              "journal", "year", "volume", "number", "pages", "month", "note");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAuthor method, of class Artikkeli.
     */
    @Test
    public void testGetAuthor() {
        String expResult = "author";
        String result = instance.getAuthor();
        assertEquals(expResult, result);

    }

    /**
     * Test of setAuthor method, of class Artikkeli.
     */
    @Test
    public void testSetAuthor() {
        String author = "abc";
        instance.setAuthor(author);
        assertEquals(author, instance.getAuthor());
    }

    /**
     * Test of getTitle method, of class Artikkeli.
     */
    @Test
    public void testGetTitle() {
        String expResult = "title";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Artikkeli.
     */
    @Test
    public void testSetTitle() {
        String title = "abc";
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());
    }

    /**
     * Test of getJournal method, of class Artikkeli.
     */
    @Test
    public void testGetJournal() {
        String expResult = "journal";
        String result = instance.getJournal();
        assertEquals(expResult, result);
    }

    /**
     * Test of setJournal method, of class Artikkeli.
     */
    @Test
    public void testSetJournal() {
        String journal = "abc";
        instance.setJournal(journal);
        assertEquals(journal, instance.getJournal());
    }

    /**
     * Test of getYear method, of class Artikkeli.
     */
    @Test
    public void testGetYear() {
        String expResult = "year";
        String result = instance.getYear();
        assertEquals(expResult, result);
    }

    /**
     * Test of setYear method, of class Artikkeli.
     */
    @Test
    public void testSetYear() {
        String year = "abc";
        instance.setYear(year);
        assertEquals(year, instance.getYear());
    }

    /**
     * Test of getVolume method, of class Artikkeli.
     */
    @Test
    public void testGetVolume() {
        String expResult = "volume";
        String result = instance.getVolume();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVolume method, of class Artikkeli.
     */
    @Test
    public void testSetVolume() {
        String volume = "abc";
        instance.setVolume(volume);
        assertEquals(volume, instance.getVolume());
    }

    /**
     * Test of getNumber method, of class Artikkeli.
     */
    @Test
    public void testGetNumber() {
        String expResult = "number";
        String result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Artikkeli.
     */
    @Test
    public void testSetNumber() {
        String number = "abc";
        instance.setNumber(number);
        assertEquals(number, instance.getNumber());
    }

    /**
     * Test of getPages method, of class Artikkeli.
     */
    @Test
    public void testGetPages() {
        String expResult = "pages";
        String result = instance.getPages();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPages method, of class Artikkeli.
     */
    @Test
    public void testSetPages() {
        String pages = "pages";
        instance.setPages(pages);
        assertEquals(pages, instance.getPages());
    }

    /**
     * Test of getMonth method, of class Artikkeli.
     */
    @Test
    public void testGetMonth() {
        String expResult = "month";
        String result = instance.getMonth();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMonth method, of class Artikkeli.
     */
    @Test
    public void testSetMonth() {
        String month = "abc";
        instance.setMonth(month);
        assertEquals(month, instance.getMonth());
    }

    /**
     * Test of getNote method, of class Artikkeli.
     */
    @Test
    public void testGetNote() {
        String expResult = "note";
        String result = instance.getNote();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNote method, of class Artikkeli.
     */
    @Test
    public void testSetNote() {
        String note = "abc";
        instance.setNote(note);
        assertEquals(note, instance.getNote());
    }
    
}
