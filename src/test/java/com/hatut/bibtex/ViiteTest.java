/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hatut.bibtex;

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
        String title = "Novice mistakes: are the folk wisdoms correct?";
        String author = "Spohrer, James C. and Soloway, Elliot";
        String publisher = "Consortium for Computing Sciences in Colleges";
        int year = 2006;
        viite = new Viite(title, author, publisher, year);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTitle method, of class Viite.
     */
    @Test
    public void testGetTitle() {
        assertEquals(viite.getTitle(), "Novice mistakes: are the folk wisdoms correct?");
    }
    
    /**
     * Test of getAuthor method, of class Viite.
     */
    @Test
    public void testGetAuthor() {
        assertEquals(viite.getAuthor(), "Spohrer, James C. and Soloway, Elliot");
    }
    
    /**
     * Test of getPublisher method, of class Viite.
     */
    @Test
    public void testGetPublisher() {
        assertEquals(viite.getPublisher(), "Consortium for Computing Sciences in Colleges");
    }
    
    /**
     * Test of getYear method, of class Viite.
     */
    @Test
    public void testGetYear() {
        assertEquals(viite.getYear(), 2006);
    }
    
}
