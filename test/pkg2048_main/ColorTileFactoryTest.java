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
public class ColorTileFactoryTest {
    
    public ColorTileFactoryTest() {
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
     * Test of createColor method, of class ColorTileFactory.
     */
    @Test
    public void testCreateColor() {
        System.out.println("createColor");
        int x = 64;
        ColorTileFactory instance = new ColorTileFactory();
        BuildColor expResult = instance.createColor(x);
        BuildColor result = instance.createColor(x);
        assertEquals(expResult, result);
       
    }
    
}
