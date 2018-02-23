import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;


/**
 * Write a description of class PlayerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerWorld extends World
{

    /**
     * PlayerWorld is the Constructor for objects of class PlayerWorld.
     * 
     * @param There are no parameters
     * @return An object of type PlayerWorld
     */
    public PlayerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 720, 1); 
        
        drawLines();
    }
    
    private void drawLines()
    {
        getBackground().setColor( Color.BLACK );
        
        for( int i = 72; i < getWidth(); i += 72 )
        {
            getBackground().drawLine(i, 0, i, getHeight() );
            getBackground().drawLine(0, i, getWidth(), i);
              
        }
        
    
    
    }
}
