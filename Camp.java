import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Camp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Camp extends Animal
{
    private int millis = (int)(System.currentTimeMillis()%1000);
    private int spawnTimer;
    GifImage gifImage = new GifImage("evil_wizard_idle.gif");
    /**
     * Act - do whatever the Camp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        checkForSpawning();
        setImage(gifImage.getCurrentImage());

    }
    private void checkForSpawning() // call from act method
    {
    
    spawnTimer = (spawnTimer+1)%60; // 600 = repeat every 10 seconds (about) 60 = 1 second
    getWorld().showText("Timer: " + spawnTimer/30, 60, 380);
    if (spawnTimer == 0) // at each timer reset
    {
        Human human = new Human();
        getWorld().addObject(human, getX(), getY());
    }
   
    /*
     millis = millis+1;
    getWorld().showText("Timer: " + millis, 60, 380);
    */
   
   
    }
}   
