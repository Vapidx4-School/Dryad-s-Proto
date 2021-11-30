import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpellBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellBook extends Player
{
    /**
     * Act - do whatever the SpellBook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int angle;
    public void act()
    {
        // Add your action code here.
        orbit();
        attack();
    }
    public void attack()
    {
    if (Greenfoot.isKeyDown("t"))
    {
    getWorld().addObject(new FireBolt(), getX() + 20, getY());
    }
    }
    public void orbit()
    {
    int radius = 40;
    
    MouseInfo m = Greenfoot.getMouseInfo();
    if (m != null)
    {
    turnTowards(m.getX(), m.getY());
    }
    
    Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
    setLocation(player.getX(), player.getY());
    move(radius);
    }
}