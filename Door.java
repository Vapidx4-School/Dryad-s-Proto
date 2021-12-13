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
     * Act - do whatever the Door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    GreenfootImage image = getImage();
    image.scale(100, 150);
    setImage(image);
    
    if(isTouching(Player01.class)){
        Greenfoot.setWorld(new Cutscene01());
        }
    }
}
