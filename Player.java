import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
        interact();
    }
    public void movement(){
    if(Greenfoot.isKeyDown("right")) setLocation(getX()+3, getY());
    if(Greenfoot.isKeyDown("left")) setLocation(getX()-3, getY());
    if(Greenfoot.isKeyDown("down")) setLocation(getX(), getY()+3);
    if(Greenfoot.isKeyDown("up")) setLocation(getX(), getY()-3);
    }
    public void interact(){
    if (Greenfoot.mouseClicked(null)){
    Actor actor = Greenfoot.getMouseInfo().getActor();
    if (actor != null)
    {
        if (actor instanceof Dryad)
        getWorld().showText("Defeat the humans", 300, 300);
        Camp camp = new Camp();
        getWorld().addObject(camp,518,212);
    }
    }
    }
    
}
