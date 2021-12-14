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
    private static final int MOVE_AMOUNT = 5;
 
    private int vSpeed = 0;
    private int accel = 1;
    private int jumpHeight = -4;
    private int jumpCounter;
    private int frame = 1;
    private boolean jumping;
    private Actor weapon;
    GifImage gifImage = new GifImage("bluewizard.gif");

    /**
     * Its you!
     * Allows the player to move left, right and jump on certain levels.
     * Also they fall, because of gravity
     */
    public void act()
    {
        // Add your action code here.
       
        movement();
        checkFalling();
        jumping = false;
        setImage(gifImage.getCurrentImage());
       // interact();
        
        
    }
     
     public void moveLeft()
    {
       // setLocation(getX()-3, getY());
        // move the camera backwards:
        getWorld().moveCamera(-MOVE_AMOUNT);
    }
     public void moveRight()
    {
       // setLocation(getX()+3, getY());
      
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
        if(isAtEdge()){setGlobalLocation(getGlobalX(), getGlobalY());}        
        
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