import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends ScrollActor
{
  //  private final int gravity = 20;
    private static final int MOVE_AMOUNT = 10;
    private GreenfootImage run1;
    private GreenfootImage run2;
    private GreenfootImage run3;
    private GreenfootImage run4;
    private GreenfootImage run5;
    private GreenfootImage run6;
    private GreenfootImage run7;
    private GreenfootImage run8;
    private int vSpeed = 0;
    private int accel = 1;
    private int jumpHeight = -4;
    private int jumpCounter;
    private int frame = 1;
    private boolean jumping;

    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage("cRun01.png");
        movement();
        checkFalling();
        jumping = false;
        //interact();
    }
     public void rRunAnimation()
    {
    // code for the animation
    // running right
         getWorld().showText("animate", 400, 400);

        if (frame == 1)
        {
            setImage("cRun01       .png");
        }
        else if(frame == 2)
        {
            setImage("cRun02       .png");
        }
        else if(frame == 3)
        {
            setImage("cRun03       .png");
        }
        else if(frame == 4)
        {
            setImage("cRun04       .png");
        }
        else if(frame == 5)
        {
            setImage("cRun05       .png");
        }
        else if(frame == 6)
        {
            setImage("cRun06       .png");
        }
        else if(frame == 7)
        {
            setImage("cRun07       .png");
        }
        else if(frame == 8)
        {
            setImage("cRun08");
            frame = 0;
            return;
        }
        frame ++;
    }
     public void moveLeft()
    {
        setLocation(getX()-1, getY());
        // move the camera backwards:
        getWorld().moveCamera(-MOVE_AMOUNT);
    }
     public void moveRight()
    {
        setLocation(getX()+1, getY());
        //rRunAnimation();
        getWorld().moveCamera(+MOVE_AMOUNT);
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
        fall();
    }
    public void movement()
    {
        
        if (Greenfoot.isKeyDown("a")) {moveLeft();}
        if (Greenfoot.isKeyDown("d")) {moveRight();}
        

        if (Greenfoot.isKeyDown("w")){jump();}
        MouseInfo m = Greenfoot.getMouseInfo();
        if (Greenfoot.isKeyDown("down")) {
            // move the camera backwards:
            getWorld().moveCamera(-MOVE_AMOUNT);
        }
        if (Greenfoot.isKeyDown("up")) {
            // move the camera forwards:
            getWorld().moveCamera(MOVE_AMOUNT);
        }
        
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
        getWorld().showText("Defeat the humans", 300, 300);
        Camp camp = new Camp();
        getWorld().addObject(camp,518,212);
        }
        }
    }
    
    }