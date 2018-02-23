import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenu extends World
{
    private GreenfootImage startBackground = new GreenfootImage("BAttleSHip.jpg");
    /**
     * StartMenu is the constructor for objects of type StartMenu
     * 
     * @param There are no parameters
     * @return an object of type StartMenu
     */
    public StartMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 720, 1);
        
        startBackground.scale( getWidth(), getHeight() );
        setBackground( startBackground );
        
        addObject( new StartButton(), getWidth()/2, getHeight() - 100 );
    }
}
