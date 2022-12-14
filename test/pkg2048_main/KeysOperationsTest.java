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
public class KeysOperationsTest {
    
    public KeysOperationsTest() {
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
     * Test of execute method, of class KeysOperations.
     */
    @Test
    public void testExecute() {
        System.out.println("execute");
        Game game= new Game();
        KeysOperations instance = game.new RightButton();
        instance.execute();
        
    }

    public class KeysOperationsImpl implements KeysOperations {

        public void execute() {
        }
    }
    
}
