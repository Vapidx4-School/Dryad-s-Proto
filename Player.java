import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private final int gravity = 20;
    private int velocity;
    private int jumpCounter;

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movement();
        interact();
        velocity = 1;
    }
    public void movement(){
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX()-3, getY());
        }
        
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX()+3, getY());
        }
        
        
        if (Greenfoot.isKeyDown("w") && getY() > getWorld().getHeight() - 30)
        {
            jump();
        }
        if (Greenfoot.isKeyDown("w") && getY() > getWorld().getHeight() - 30)
        {
            jumpCounter++;
        }
        fall();
    }
     public void fall()
    {
        setLocation(getX(), getY() + velocity);
        if (getY() > getWorld().getHeight() - 30) {
            velocity = 0;
        }
        else {
            velocity = velocity + gravity;
        }
    }

  
    public void jump()
    {
        velocity = -28;
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
