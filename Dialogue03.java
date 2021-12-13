import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue03 extends Actor
{
    /**
     * Act - do whatever the Dialogue03 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
