import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits_Button extends Button

{
    /**
     * Proceeds to the next scene or menu
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new CREDITS());
        
        }
    }
}
