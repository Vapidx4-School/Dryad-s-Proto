import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpellBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellBook extends ScrollActor
{
    /**
     * Act - do whatever the SpellBook wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int angle;
    private float spawnTimer;
    //private int simulationSpeed = getWorld().getSimulationSpeed();
    
    
    public void act()
    {
        // Add your action code here.
        orbit();
        attack();
    }
    private long fireRate() // call from act method
    {
    
    /*
     
    FireBolt firebolt = new FireBolt();    

    getWorld().addObject(firebolt, getX(), getY());
    firebolt.setRotation(getRotation());
    */
    int simulationSpeed = getWorld().getSimulationSpeed();
    
    long fps = fps();
    long useTime = 40;
    long fireRate = fps/useTime; 
    
    getWorld().showText("Fire Rate: " + fireRate, 120, 290);
    
    return fireRate;
    }
    private void checkForSpawning() // call from act method
    {
    spawnTimer = (getWorld().getElapsedMilliseconds()%100);
    if (spawnTimer == 0) // at each timer reset
    {
    FireBolt firebolt = new FireBolt();    

    getWorld().addObject(firebolt, getX(), getY());
    firebolt.setRotation(getRotation());
    }
    }
    public void attack()
    {
    fireRate();
    checkForSpawning();
    /*if (Greenfoot.isKeyDown("t"))
    {
    checkForSpawning();
    }
    */
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