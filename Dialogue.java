import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue extends Button
{
    /**
     * Proceeds to the next scene or menu
     */
    public void act()
    {
        // Add your action code here.
    Intro world = (Intro)getWorld();
    if(Greenfoot.mouseClicked(null)){
    world.addDialogue(1);
    }
    
    }
}
