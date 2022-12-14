/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ioio
 */
public class ScoreTest {
    
    public ScoreTest() {
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
     * Test of getInstance method, of class Score.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        int value = 0;
        Score expResult = null;
        Score result = Score.getInstance(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class Score.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        int expResult = 0;
        int result = Score.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class Score.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Score.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetScore method, of class Score.
     */
    @Test
    public void testResetScore() {
        System.out.println("resetScore");
        Score.resetScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
