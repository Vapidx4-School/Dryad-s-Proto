import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallOff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallOff extends ScrollActor
{
    /**
     * Act - do whatever the FallOff wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        consume(Player02.class);
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
