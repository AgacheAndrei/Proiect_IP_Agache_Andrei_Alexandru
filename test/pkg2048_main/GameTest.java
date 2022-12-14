/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
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
public class GameTest {
    
    public GameTest() {
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
     * Test of keyPressed method, of class Game.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        Game instance = new Game();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class Game.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        Game instance = new Game();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class Game.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        Game instance = new Game();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Game
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Game instance = new Game();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawTiles method, of class Game.
     */
    @Test
    public void testDrawTiles() {
        System.out.println("drawTiles");
        Graphics g = null;
        Tile tile = null;
        int x = 0;
        int y = 0;
        Game instance = new Game();
        instance.drawTiles(g, tile, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Game.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Game.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
