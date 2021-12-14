import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends Actor
{
    /**
     * Proceeds to the next level
     */
    public void act()
    {
        // Add your action code here.
    GreenfootImage image = getImage();
    image.scale(100, 150);
    setImage(image);
    
    if(isTouching(Player01.class)){
        Greenfoot.playSound("sfx-magic13.mp3");
        Greenfoot.setWorld(new Cutscene01());
        }
    }
}
