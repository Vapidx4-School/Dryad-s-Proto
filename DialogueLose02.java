import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DialogueLose02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DialogueLose02 extends Actor
{
    /**
     * Act - do whatever the DialogueLose02 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    LOSE02 world = (LOSE02)getWorld();
    if(Greenfoot.mouseClicked(null)){
    world.addDialogue(1);
    }
    
    }
}
