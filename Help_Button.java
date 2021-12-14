import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help_Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help_Button extends Button

{
    /**
     * Proceeds to the next scene or menu
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new HELP());
        }
    }
}
