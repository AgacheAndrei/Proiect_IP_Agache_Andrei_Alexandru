/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import java.awt.Graphics;
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
public class GameStrategyTest {
    
    public GameStrategyTest() {
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
     * Test of ExecutStrategy method, of class GameStrategy.
     */
    @Test
    public void testExecutStrategy() {
        System.out.println("ExecutStrategy");
        Graphics g = null;
        GameStrategy instance = new GameStrategyImpl();
        instance.ExecutStrategy(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GameStrategyImpl implements GameStrategy {

        public void ExecutStrategy(Graphics g) {
        }
    }
    
}
