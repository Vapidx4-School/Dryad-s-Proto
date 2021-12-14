import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Potato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    /**
     * Weapon of choice casted by the demons
     * Chases player and eliminates them once it touches them
     * Also deletes the fireballs from the world once it touches it
     */
    public void act()
    {
        // Add your action code here.
        chase();
        consume(Player02.class);
        eat(Leaf01.class);
    }
    public void chase()
    {
    move(2);
    Actor player = (Actor)getWorld().getObjects(Player02.class).get(0);
    turnTowards(player.getX(), player.getY());
    }
    public void consume(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
            Greenfoot.setWorld(new LOSE02());
        }
    }
    public void eat(Class clss)
    {
       Actor actor = getOneObjectAtOffset(0, 0, clss);
       RUN world = (RUN)getWorld();
        if(isTouching(Leaf01.class)) {
            getWorld().removeObject(getOneIntersectingObject(Leaf01.class));
            
        }
    }
    }
