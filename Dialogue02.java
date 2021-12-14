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
     * Proceeds to the next scene or menu
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
