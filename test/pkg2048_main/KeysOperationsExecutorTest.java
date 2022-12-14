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
import  pkg2048_main.Game;
import pkg2048_main.Game.LeftButton;

/**
 *
 * @author ioio
 */
public class KeysOperationsExecutorTest {
    
    public KeysOperationsExecutorTest() {
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
     * Test of executeOperation method, of class KeysOperationsExecutor.
     */
    @Test
    public void testExecuteOperation() {
        System.out.println("executeOperation");
        KeysOperations keysOperation;
        Game game = new Game();
        keysOperation =  game.new LeftButton(); 
        KeysOperationsExecutor instance = new KeysOperationsExecutor();
        instance.executeOperation(keysOperation);
        
    }
    
}
