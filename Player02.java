import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player02 extends Actor
{
   private static final int MOVE_AMOUNT = 5;
 
    private int vSpeed = 0;
    private int accel = 1;
    private int jumpHeight = -4;
    private int jumpCounter;
    private int frame = 1;
    private boolean jumping;
    private Actor weapon;
    GifImage gif = new GifImage("biggerBlueWizard.gif");

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
       
        movement();
        checkFalling();
        jumping = false;
        
        if(isTouching(Door02.class)){
        Greenfoot.setWorld(new Cutscene03());
        }
        
        
        
        
        
        
        setImage(gif.getCurrentImage());
       // interact();
        
        
    }
     
     public void moveLeft()
    {
       setLocation(getX()-3, getY());  
    }
     public void moveRight()
    {
       setLocation(getX()+3, getY());
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + accel;
    }
    public void jump()
    {
        vSpeed = jumpHeight;
        jumpCounter = 1;
        //fall();
    }
    public void movement()
    {
        
        if (Greenfoot.isKeyDown("a")) {moveLeft();}
        if (Greenfoot.isKeyDown("d")) {moveRight();}
        if (Greenfoot.isKeyDown("w")){jump();}
        MouseInfo m = Greenfoot.getMouseInfo();
        
        if(isAtEdge()){setLocation(getX(), getY());}        
        
    }
    boolean onGround()
    {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Ground.class);
        return under != null;
    }
    public void checkFalling()
    {
        if (onGround() == false)
        {
        fall();
        jumping = false;
        }
    }
    public void interact()
    {
        if (Greenfoot.mouseClicked(null)){
        Actor actor = Greenfoot.getMouseInfo().getActor();
        if (actor != null)
        {
        if (actor instanceof Dryad)
        getWorld().showText("", 300, 300);
        Camp camp = new Camp();
        getWorld().addObject(camp,518,212);
        }
        }
    }
    
}
