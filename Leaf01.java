import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leaf01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaf01 extends SpellBook02
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
        eat(Orb.class);
        if(isAtEdge()){getWorld().removeObject(this);}
        
    }
    public void eat(Class clss)
    {
        Actor actor = (Actor)getOneIntersectingObject(clss);
        RUN world = (RUN)getWorld();
        if(actor != null) {
            getWorld().removeObject(actor);
            
            //getWorld().removeObject(this);
        }
        
    }
    
}
