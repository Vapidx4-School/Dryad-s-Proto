import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue02 extends Button
{
    /**
     * Act - do whatever the Dialogue02 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    Cutscene02 world = (Cutscene02)getWorld();
    if(Greenfoot.mouseClicked(null)){
    world.addDialogue(1);
    }
    
    }
}
