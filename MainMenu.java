import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {
        super(1228, 717, 1);
        Greenfoot.start();    
        prepare();
    }

    public void act()
    {

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Play_Button play_Button = new Play_Button();
        addObject(play_Button,582,418);
        Help_Button help_Button = new Help_Button();
        addObject(help_Button,150,421);
        Credits_Button credits_Button = new Credits_Button();
        addObject(credits_Button,988,415);
    }
}
