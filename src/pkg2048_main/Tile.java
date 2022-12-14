/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2048_main;

import java.awt.Color;


/**
 * 
 * Represents an individual tile in the game. Has an integer value and a color
 * value - both of which change as they are combined
 *
 *

 */
//Factory design
@FunctionalInterface
interface BuildColor{
	Color build(int x);
}
class ColorSmallTile implements BuildColor
{
	
	Color newcolor;
	@Override
	public Color build(int x)
	{
		if ( x == 2 )
        {
			newcolor = new Color( 238, 228, 218 );
        }
        else if ( x == 4 )
        {
        	newcolor =  new Color( 237, 224, 200 );
        }
        else if ( x == 8 )
        {
        	newcolor = new Color( 242, 177, 121 );
        }
        else if ( x == 16 )
        {
        	newcolor = new Color( 245, 149, 99 );
        }
        else if ( x == 32 )
        {
        	newcolor = new Color( 246, 124, 95 );
        }
		return newcolor;
		
	}
}
class ColorMediumTile implements BuildColor
{
	
	Color newcolor;
	@Override
	public Color build(int x)
	{
		if ( x == 64 )
        {
            newcolor =new Color( 246, 94, 59 );
        }
        else if ( x == 128 )
        {
        	newcolor = new Color( 237, 207, 114 );
        }
        else if ( x == 256 )
        {
        	newcolor = new Color( 237, 204, 97 );
        }
        else if ( x == 512 )
        {
        	newcolor = new Color( 237, 200, 80 );
        }
		return newcolor;
		
	}
}
class ColorBigTile implements BuildColor
{
	
	Color newcolor;
	@Override
	public Color build(int x)
	{
		if ( x == 1024 )
        {
			newcolor =new Color( 237, 197, 63 );
        }
        else
        {
        	newcolor = new Color( 237, 194, 46 );
        }
		return newcolor;
		
	}
}
class ColorTileFactory
{
	public BuildColor createColor(int x)
	{
		if(x<=32)
			return new ColorSmallTile();
		if(x>32 && x<=512)
			return new ColorMediumTile();
		if(x>512)
			return new ColorBigTile();
		return null;
	}
}
public class Tile
{
    int value;

    Color tileColor;
    ColorTileFactory colorFact = new ColorTileFactory();


    /**
     * Constructs a basic tile with a value of 0
     */
    public Tile()
    {
        value = 0;
    }


    /**
     * Constructs a tile with a value of number
     * 
     * @param number
     *            number to set value to
     */
    public Tile( int number )
    {
        value = number;
    }


    /**
     * 
     * Gets the tile's value
     * 
     * @return value
     */
    public int getValue()
    {
        return value;
    }


    /**
     * 
     * Sets the tile's value - used when adding two tiles together
     * 
     * @param value
     *            value to set the tile to
     */
    public void setValue( int value )
    {
        this.value = value;
    }


    /**
     * Represents the tile as a String - used in the GUI
     */
    public String toString()
    {
        return "" + value;
    }


    /**
     * 
     * Sets the tile's color based on its value
     */
    public void setColor()
    {
//        if ( this.getValue() == 2 )
//        {
//            tileColor = new Color( 238, 228, 218 );
//        }
//        else if ( this.getValue() == 4 )
//        {
//            tileColor = new Color( 237, 224, 200 );
//        }
//        else if ( this.getValue() == 8 )
//        {
//            tileColor = new Color( 242, 177, 121 );
//        }
//        else if ( this.getValue() == 16 )
//        {
//            tileColor = new Color( 245, 149, 99 );
//        }
//        else if ( this.getValue() == 32 )
//        {
//            tileColor = new Color( 246, 124, 95 );
//        }
    	
//    	else if ( this.getValue() == 64 )
//        {
//            tileColor = new Color( 246, 94, 59 );
//        }
//        else if ( this.getValue() == 128 )
//        {
//            tileColor = new Color( 237, 207, 114 );
//        }
//        else if ( this.getValue() == 256 )
//        {
//            tileColor = new Color( 237, 204, 97 );
//        }
//        else if ( this.getValue() == 512 )
//        {
//            tileColor = new Color( 237, 200, 80 );
//        }
//        else if ( this.getValue() == 1024 )
//        {
//            tileColor = new Color( 237, 197, 63 );
//        }
//        else
//        {
//            tileColor = new Color( 237, 194, 46 );
//        }
    	
    	//factory
    	BuildColor color =colorFact.createColor(this.getValue());
    	tileColor= color.build(this.getValue());
    	
    }


    /**
     * 
     * Gets the color based on setColor()
     * 
     * @return tileColor
     */
    public Color getColor()
    {
        this.setColor();
        return tileColor;
    }

}
