import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FireBolt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FireBolt extends SpellBook
{
    /**
     * Act - do whatever the FireBolt wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        //TODO: MAKE THE FIREBOLT SPAWN AT A SELECT INTERVAL
        move(5);
        eat(Human.class);
        damage(Camp.class);
        
    }
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
       MyWorld world = (MyWorld)getWorld();
        if(actor != null) {
            getWorld().removeObject(actor);
            world.addScore(5);
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
