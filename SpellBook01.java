import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpellBook01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellBook01 extends Player01
{
    /**
     * Use this to cast your spells!
     * Fireballs has a random percent chance of spawning on top of this actor once the spacebar is pressed
     * It also orbits the player by following the mouse!
     */
    private int angle;
    private float spawnTimer;
    private Actor Player01;
    //private int simulationSpeed = getWorld().getSimulationSpeed();
    
    
    public void act()
    {
        // Add your action code here.
        orbit();
        attack();
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
    
    if(Greenfoot.getRandomNumber(100) < 10){
    Greenfoot.playSound("laserShoot2.wav");
    Leaf leaf = new Leaf();    

    getWorld().addObject(leaf, this.getX(), this.getY());
    leaf.setRotation(this.getRotation());
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
    
    Actor player = getWorld().getObjects(Player01.class).get(0);
    setLocation(player.getX(), player.getY());
    move(radius);
    }
    
}
