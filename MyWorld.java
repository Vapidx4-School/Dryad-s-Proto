import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends ScrollWorld
{
    public Player player = new Player();    
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 900, 1, 1920, 1080); 
        
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,439,758);
        Ground ground2 = new Ground();
        addObject(ground2,1366,758);
        /*SpellBook spellbook = new SpellBook();
        addObject(spellbook , player.getX(), player.getY());
         */

        addCameraFollower(new Player(), 0, 0);

        SpellBook spellBook = new SpellBook();
        addObject(spellBook,0,0);

        spellBook.setLocation(3,3);
        Time time = new Time();
        addObject(time,3,3);
        Dryad dryad = new Dryad();
        addObject(dryad,530,534);
    }
}
