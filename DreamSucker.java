import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DreamSucker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DreamSucker extends Actor
{
    GifImage gif = new GifImage("DreamSucker.gif");
    /**
     * Act - do whatever the DreamSucker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(gif.getCurrentImage());
        Cabin world = (Cabin)getWorld();
        if(isTouching(Leaf.class)){
        setLocation(Greenfoot.getRandomNumber(885), Greenfoot.getRandomNumber(775));
        world.addScore(5);
        }
    }
}
