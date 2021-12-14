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
     * Use this to cast your spells!
     * Fireballs has a random percent chance of spawning on top of this actor once the spacebar is pressed
     * It also orbits the player by following the mouse!
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
    /*spawnTimer = (fireRate()-1);
    if (spawnTimer == 0) // at each timer reset
    {
    FireBolt firebolt = new FireBolt();    

    getWorld().addObject(firebolt, getX(), getY());
    firebolt.setRotation(getRotation());
    }*/
    
    if(Greenfoot.getRandomNumber(100) < 30){
    Greenfoot.playSound("laserShoot2.wav");

    FireBolt firebolt = new FireBolt();    

    getWorld().addObject(firebolt, this.getX(), this.getY());
    firebolt.setRotation(this.getRotation());
    }
    //Greenfoot.playSound("sfx-magic13.mp3");
    }
    public void attack()
    {
    
    if (Greenfoot.isKeyDown("space"))
    {
    checkForSpawning();
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