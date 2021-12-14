import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue03 extends Button
{
    /**
     * Proceeds to the next scene or menu
     */
    public void act()
    {
        // Add your action code here.
    Cutscene03 world = (Cutscene03)getWorld();
    if(Greenfoot.mouseClicked(null)){
    world.addDialogue(1);
    }
    
    }
}
