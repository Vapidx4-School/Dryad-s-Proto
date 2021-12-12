import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class END here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class END extends ScrollWorld
{

    /**
     * Constructor for objects of class END.
     * 
     */
    public END()
    {
        super(900, 716, 1, 1920, 716);
        showText("YOU WIN", 500, 500);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Greenfoot.start();
        Ground ground = new Ground();
        addObject(ground,451,683);
        addCameraFollower(new Player(), 0, 0);
        SpellBook spellBook = new SpellBook();
        addObject(spellBook,4,7);
        removeObject(spellBook);
        Ground ground2 = new Ground();
        addObject(ground2,771,683);
        Ground ground3 = new Ground();
        addObject(ground3,695,683);
        Ground ground4 = new Ground();
        addObject(ground4,833,682);
    }
}
