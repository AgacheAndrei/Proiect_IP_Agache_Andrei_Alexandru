/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@FunctionalInterface
interface GameStrategy
{
	 void ExecutStrategy(Graphics g);
}

//command pattern
@FunctionalInterface
interface KeysOperations
{
	void execute();
}

class KeysOperationsExecutor
{
	private final List<KeysOperations> keysOperations = new ArrayList<>();
	public void executeOperation(KeysOperations keysOperation)
	{
		keysOperations.add(keysOperation);
		keysOperation.execute();
	}
}
public class Game extends JPanel implements KeyListener
{
    static Board game = new Board();
     
    static Game newGame = new Game();

    static JFrame frame = new JFrame( "2048" );

    static Color green;

    String gameBoard = game.toString();
    
    
    class BlackOutStrategy implements GameStrategy
    {
    	@Override
    	 public void ExecutStrategy(Graphics g)
    	 {
    		game = new Board(); game.spawn(); game.spawn(); frame.repaint();
			game.score.resetScore();
    	 }
    }
    
    class NormalGameFlowStrategy implements GameStrategy
    {
    	@Override
   	 public void ExecutStrategy(Graphics g)
   	 {
    		g.setColor( Color.gray );
            g.fillRect( 140, 50, 250, 250 );
            for ( int i = 0; i < 4; i++ )
            {
                for ( int j = 0; j < 4; j++ )
                {
                    drawTiles( g, game.board[i][j], j * 60 + 150, i * 60 + 60 );
                }
            }
   	 }
    }
    
    class GameOverStrategy implements GameStrategy
    {
    	@Override
      	 public void ExecutStrategy(Graphics g)
      	 {
    		g.setColor( Color.gray );
            g.fillRect( 140, 50, 250, 250 );
            for ( int i = 0; i < 4; i++ )
            {
                for ( int j = 0; j < 4; j++ )
                {
                    g.setColor( Color.RED );
                    g.fillRoundRect( j * 60 + 150, i * 60 + 60, 50, 50, 5, 5 );
                    g.setColor( Color.black );
                    g.drawString( "GAME", j * 60 + 160, i * 60 + 75 );
                    g.drawString( "OVER", j * 60 + 160, i * 60 + 95 );
                    
                }
            }
      	 }
    }
    
    static class Context{
    	static private GameStrategy strategy_here;
    	public static void setStrategy(GameStrategy strategy)
    	{
    		 strategy_here = strategy;
    	}
    	public static void executeStrategy(Graphics g)
    	{
    		strategy_here.ExecutStrategy(g);
    	}
    }
    
   //facade
    static class SetupGame
    {
    	public static void setUpGameGUI()
    	{
    		frame.addKeyListener( newGame );
            frame.getContentPane().add( newGame );
            frame.setSize( 600, 400 );
            frame.setVisible( true );
            frame.setResizable( false );
    	}
    	public static void updateFrameData(Graphics g){
    		 Graphics2D g2 = (Graphics2D)g;
    	        g2.drawString( "2048", 250, 20 );
    	        g2.drawString( "Score: " + game.getScore(),
    	            200 - 4 * String.valueOf( game.getScore() ).length(),
    	            40 );
    	        g2.drawString( "Highest Tile: " + game.getHighTile(),
    	            280 - 4 * String.valueOf( game.getHighTile() ).length(),
    	            40 );
    	        g2.drawString( "Press 'Enter' to Start", 210, 315 );
    	        g2.drawString( "Use 'wasd' or Arrow Keys to move", 180, 335 );
    	}
    }
    
    KeysOperationsExecutor keysOpEX = new KeysOperationsExecutor();
    class ResetButton implements KeysOperations
    {	
    	@Override
        public void execute() {
    		game = new Board();
            frame.repaint();
            game.score.resetScore();
        }
    	
    }
    class StartButton implements KeysOperations
    {	
    	@Override
        public void execute() {
    		 game = new Board();
             game.spawn();
             game.spawn();
             frame.repaint();
             game.score.resetScore();
        }
    	
    }
    class UpButton implements KeysOperations
    {
    	@Override
        public void execute() {
    		 game.up();
             game.spawn();
             gameBoard = game.toString();
             frame.repaint();
        }
    }
    class DownButton implements KeysOperations
    {
    	@Override
        public void execute() {
    		 game.down();
             game.spawn();
             gameBoard = game.toString();
             frame.repaint();
        }
    }
    class LeftButton implements KeysOperations
    {
    	@Override
        public void execute() {
    		 game.left();
             game.spawn();
             gameBoard = game.toString();
             frame.repaint();
        }
    }
    class RightButton implements KeysOperations
    {
    	@Override
        public void execute() {
    		 game.right();
             game.spawn();
             gameBoard = game.toString();
             frame.repaint();
        }
    }
    


    /**
     * 
     * sets up the GUI with appropriate sizes and adds a Key Listener
     */
//    public static void setUpGUI()
//    {
//        frame.addKeyListener( newGame );
//        frame.getContentPane().add( newGame );
//        frame.setSize( 600, 400 );
//        frame.setVisible( true );
//        frame.setResizable( false );
//    }


    /**
     * Checks to see whether wasd or arrow keys are pressed and performs the
     * appropriate actions - updates the JFrame with every move
     * 
     * @param e
     *            KeyEvent to check
     */
    @Override
    public void keyPressed( KeyEvent e )
    {
        if ( e.getKeyChar() == 'w' || e.getKeyCode() == KeyEvent.VK_UP )
        {
//            game.up();
//            game.spawn();
//            gameBoard = game.toString();
//            frame.repaint();
        	keysOpEX.executeOperation(new UpButton());
        }
        else if ( e.getKeyChar() == 's' || e.getKeyCode() == KeyEvent.VK_DOWN )
        {
//            game.down();
//            game.spawn();
//            gameBoard = game.toString();
//            frame.repaint();
        	keysOpEX.executeOperation(new DownButton());
        }
        else if ( e.getKeyChar() == 'a' || e.getKeyCode() == KeyEvent.VK_LEFT )
        {
//            game.left();
//            game.spawn();
//            gameBoard = game.toString();
//            frame.repaint();
        	keysOpEX.executeOperation(new LeftButton());
        }
        else if ( e.getKeyChar() == 'd' || e.getKeyCode() == KeyEvent.VK_RIGHT )
        {
//            game.right();
//            game.spawn();
//            gameBoard = game.toString();
//            frame.repaint();
        	keysOpEX.executeOperation(new RightButton());
        }
        else if ( e.getKeyCode() == KeyEvent.VK_ENTER )
        {
//            game = new Board();
//            game.spawn();
//            game.spawn();
//            frame.repaint();
//            game.score.resetScore();
        	 keysOpEX.executeOperation(new StartButton());
        }
        else if ( e.getKeyCode() == KeyEvent.VK_V )
        {
//            game = new Board();
//            frame.repaint();
//            game.score.resetScore();
        	  keysOpEX.executeOperation(new ResetButton());
        }
        
        
    }


    @Override
    public void keyReleased( KeyEvent e )
    {
        // Not Used

    }


    @Override
    public void keyTyped( KeyEvent e )
    {
        // Not Used

    }


    /**
     * Paints the GUI with a series of strings, the board, the tiles and ensures
     * they are repainted when the game is over
     * 
     * @param g
     *            Graphics parameter
     */
    public void paint( Graphics g )
    {
        super.paint( g );
        Graphics2D g2 = (Graphics2D)g;
//        g2.drawString( "2048", 250, 20 );
//        g2.drawString( "Score: " + game.getScore(),
//            200 - 4 * String.valueOf( game.getScore() ).length(),
//            40 );
//        g2.drawString( "Highest Tile: " + game.getHighTile(),
//            280 - 4 * String.valueOf( game.getHighTile() ).length(),
//            40 );
//        g2.drawString( "Press 'Enter' to Start", 210, 315 );
//        g2.drawString( "Use 'wasd' or Arrow Keys to move", 180, 335 );
        
        //facade usage
        SetupGame.updateFrameData(g2);
        if ( game.gameOver() )
        {
//            g2.setColor( Color.gray );
//            g2.fillRect( 140, 50, 250, 250 );
//            for ( int i = 0; i < 4; i++ )
//            {
//                for ( int j = 0; j < 4; j++ )
//                {
//                    g2.setColor( Color.RED );
//                    g2.fillRoundRect( j * 60 + 150, i * 60 + 60, 50, 50, 5, 5 );
//                    g2.setColor( Color.black );
//                    g.drawString( "GAME", j * 60 + 160, i * 60 + 75 );
//                    g.drawString( "OVER", j * 60 + 160, i * 60 + 95 );
//                    
//                }
//            }
        	System.out.print("a intrat go");
        	Context.setStrategy(new GameOverStrategy());
        	Context.executeStrategy(g2);
        	
        }
        
        if ( game.blackOut() )
        {
			/*
			 * g2.drawString( "The game will restart in" + TimeUnit.SECONDS, 200, 355 ); try
			 * {
			 * 
			 * TimeUnit.SECONDS.sleep(20);
			 * 
			 * } catch (InterruptedException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
        	//g2.drawString( "Press 'V' to restart", 200, 355 );
			
//			game = new Board(); game.spawn(); game.spawn(); frame.repaint();
//			game.score.resetScore();
        	Context.setStrategy(new BlackOutStrategy());
        	Context.executeStrategy(g2);
        	System.out.print("a intrat bo");
        	
 
        }
//        g2.setColor( Color.gray );
//        g2.fillRect( 140, 50, 250, 250 );
//        for ( int i = 0; i < 4; i++ )
//        {
//            for ( int j = 0; j < 4; j++ )
//            {
//                drawTiles( g, game.board[i][j], j * 60 + 150, i * 60 + 60 );
//            }
//        }
        
        Context.setStrategy(new NormalGameFlowStrategy());
        Context.executeStrategy(g2);
        
    }


    /**
     * 
     * draws an individual tile - called from the paint method
     * 
     * @param g
     *            Graphics parameter
     * @param tile
     *            Tile to draw
     * @param x
     *            X coordinate to draw at
     * @param y
     *            Y coordinate to draw at
     */
    public void drawTiles( Graphics g, Tile tile, int x, int y )
    {
        int tileValue = tile.getValue();
        int length = String.valueOf( tileValue ).length();
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor( Color.lightGray );
        g2.fillRoundRect( x, y, 50, 50, 5, 5 );
        g2.setColor( Color.black );
        if ( tileValue > 0 )
        {
            g2.setColor( tile.getColor() );
            g2.fillRoundRect( x, y, 50, 50, 5, 5 );
            g2.setColor( Color.black );
            g.drawString( "" + tileValue, x + 25 - 3 * length, y + 25 );
        }
    }


    /**
     * 
     * Main method - sets up the GUI and in turn starts the whole game
     * 
     * @param args
     *            default parameter
     */
    public static void main( String[] args )
    {
    	//facede usage
    	SetupGame.setUpGameGUI();
    }

}