package com.myssyt.bibtex.domain;

import com.myssyt.bibtex.domain.Reference;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReferenceTest {
    
    public ReferenceTest() {
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
        Reference instance = new Reference("abc");
        String expResult = "abc";
        String result = instance.getBibtexKey();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBibtexKey method, of class Viite.
     */
    @Test
    public void testSetBibtexKey() {
        Reference instance = new Reference("abc");
        String bibtexKey = "123";
        instance.setBibtexKey(bibtexKey);
        assertEquals(bibtexKey, instance.getBibtexKey());
    }
    
}
