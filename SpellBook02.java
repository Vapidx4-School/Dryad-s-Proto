import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpellBook02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellBook02 extends Player02
{
    /**
     * Act - do whatever the SpellBook02 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int angle;
    private float spawnTimer;
    private Actor Player02;
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
    
    if(Greenfoot.getRandomNumber(100) < 30){
    Greenfoot.playSound("laserShoot2.wav");
    Leaf01 leaf = new Leaf01();    

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
    
    Actor player = getWorld().getObjects(Player02.class).get(0);
    setLocation(player.getX(), player.getY());
    move(radius);
    }
    
}
