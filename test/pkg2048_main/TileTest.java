/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import java.awt.Color;
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
public class TileTest {
    
    public TileTest() {
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
     * Test of getValue method, of class Tile.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Tile instance = new Tile();
        int expResult = 0;
        int result = instance.getValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of setValue method, of class Tile.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        int value = 0;
        Tile instance = new Tile();
        instance.setValue(value);
        
    }

    /**
     * Test of toString method, of class Tile.
     */


    /**
     * Test of setColor method, of class Tile.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Tile instance = new Tile();
        instance.setColor();
       
    }

    /**
     * Test of getColor method, of class Tile.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Tile instance = new Tile();
        Color expResult = null;
        Color result = instance.getColor();
        assertEquals(expResult, result);
        
       
    }
    
}
