import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bigmo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bigmo extends ScrollActor
{
    GifImage gifImage = new GifImage("bigmo.gif");
    private static final int MOVE_AMOUNT = 5;
    private int vSpeed = 0;
    private int accel = 1;
    private int jumpHeight = -4;
    private int jumpCounter;
    private int frame = 1;
    private boolean jumping;
    /**
     * Act - do whatever the Bigmo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(gifImage.getCurrentImage());
        moveRight();
        consume(Player02.class);
    }
    public void fall()
    {
        setLocation(getX(), getY() + vSpeed);
        vSpeed = vSpeed + accel;
    }
    public void moveRight()
    {
       // setLocation(getX()+3, getY());
      
        //rRunAnimation();
        checkFalling();
        jumping = false;
        setLocation(getX()+MOVE_AMOUNT, getY());
        getWorld().moveCamera(+MOVE_AMOUNT);
        

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
    public void consume(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            Greenfoot.setWorld(new LOSE02());
        }
    }
}
