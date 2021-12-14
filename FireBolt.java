import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBolt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBolt extends Actor
{
    GifImage gifImage = new GifImage("FB000.gif");
    /**
     * The magic spell casted by V, consumes the spells casted by the Demon, adds score and damages the demon on certain levels
     */
    public void act()
    {
        // Add your action code here.
        //TODO: MAKE THE FIREBOLT SPAWN AT A SELECT INTERVAL
        setImage(gifImage.getCurrentImage());
        move(5);
        eat(Human.class);
        damage(Camp.class);
        
    }
    public void eat(Class clss)
    {
        Actor actor = (Actor)getOneIntersectingObject(clss);
       MyWorld world = (MyWorld)getWorld();
        if(actor != null) {
            getWorld().removeObject(actor);
            world.addScore(5);
            //getWorld().removeObject(this);
        }
        
    }
    public void damage(Class clss)
    {
    Actor actor = getOneObjectAtOffset(0, 0, clss);
       MyWorld world = (MyWorld)getWorld();
        if(actor != null) {
            world.decreaseHealth(5);
        }
    }
}
