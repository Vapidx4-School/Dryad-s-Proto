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
     * Tutorial monster that you have to shoot down
     * It teleports randomly once hit
     */
    public void act()
    {
        // Add your action code here.
        setImage(gif.getCurrentImage());
        Cabin world = (Cabin)getWorld();
        
        if(isTouching(Leaf.class)){
        Greenfoot.playSound("pickupCoin.wav");

        setLocation(Greenfoot.getRandomNumber(885), Greenfoot.getRandomNumber(775));
        world.addScore(5);
        }
    }
}
