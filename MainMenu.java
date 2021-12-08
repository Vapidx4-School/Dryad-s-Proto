import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends ScrollWorld
{
    
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
    super(900, 716, 1, 1920, 716);
    Greenfoot.start();    
    }
    
    public void act()
    {
        showText("Move with WASD", 700, 500);
        showText("Shoot with T", 700, 400);
        showText("Press the ORB to spawn the boss", 725, 300);
        showText("Avoid the humans flying towards you and shoot down the boss", 500, 100);
        if(Greenfoot.mouseClicked(null))
        {
                    Greenfoot.setWorld(new MyWorld());
        }
    }
    
    
}
