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
public class BoardTest {
    
    public BoardTest() {
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
     * Test of getBoard method, of class Board.
     */

    /**
     * Test of getScore method, of class Board.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Board instance = new Board();
        instance.score.value=20;
        int expResult = 20;
        int result = instance.getScore();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHighTile method, of class Board.
     */
    @Test
    public void testGetHighTile() {
        System.out.println("getHighTile");
        Board instance = new Board();
        int expResult = 0;
        int result = instance.getHighTile();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of print method, of class Board.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        Board instance = new Board();
        instance.print();
        
    }

    /**
     * Test of toString method, of class Board.
     */


    /**
     * Test of spawn method, of class Board.
     */
    @Test
    public void testSpawn() {
        System.out.println("spawn");
        Board instance = new Board();
        instance.spawn();
        
    }

    /**
     * Test of blackOut method, of class Board.
     */
    @Test
    public void testBlackOut() {
        System.out.println("blackOut");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.blackOut();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of gameOver method, of class Board.
     */
    @Test
    public void testGameOver() {
        System.out.println("gameOver");
        Board instance = new Board();
        boolean expResult = false;
        boolean result = instance.gameOver();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of up method, of class Board.
     */
    @Test
    public void testUp() {
        System.out.println("up");
        Board instance = new Board();
        instance.up();
        
    }

    /**
     * Test of down method, of class Board.
     */
    @Test
    public void testDown() {
        System.out.println("down");
        Board instance = new Board();
        instance.down();
        
    }

    /**
     * Test of left method, of class Board.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        Board instance = new Board();
        instance.left();
        
    }

    /**
     * Test of right method, of class Board.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        Board instance = new Board();
        instance.right();
        
    }
    
}
