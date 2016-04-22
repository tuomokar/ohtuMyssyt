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
public class ViiteTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBibtexKey method, of class Viite.
     */
    @Test
    public void testGetBibtexKey() {
        Viite instance = new Viite("abc");
        String expResult = "abc";
        String result = instance.getBibtexKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBibtexKey method, of class Viite.
     */
    @Test
    public void testSetBibtexKey() {
        Viite instance = new Viite("abc");
        String bibtexKey = "123";
        instance.setBibtexKey(bibtexKey);
        assertEquals(bibtexKey, instance.getBibtexKey());
    }
    
}
