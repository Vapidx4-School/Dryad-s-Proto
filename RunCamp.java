import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CopyOfCamp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RunCamp extends Animal
{
    private int millis = (int)(System.currentTimeMillis()%1000);
    private int spawnTimer;
    private int xOffset, yOffset;
    int step = 1;
    int spawnAmount = 3;
    private Orb[] humans;
    private static final int MOVE_AMOUNT = 5;
    
    GifImage gifImage = new GifImage("evil_wizard_idle.gif");
    /**
     * Act - do whatever the CopyOfCamp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        //checkForSpawning();
        setImage(gifImage.getCurrentImage());
        phaseOne();

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
    private void phaseOne()
    {
    //step one: Hover over player
    //spawn();
    chase();
    if(Greenfoot.getRandomNumber(100) < 10){
    Greenfoot.playSound("laserShoot.wav");
    spawn();
    }
    /*switch (step){
    case 1:
    chase();
    if(Greenfoot.getRandomNumber(100) < 1){
    step = 2;
    }
    case 2:
    spawn();
    if(Greenfoot.getRandomNumber(100) < 50){
    step = 1;
    }
    //rush();
    }**/
    //step two: Charge at player
    }
    private void phaseOne(int freq)
    {
    //step one: Hover over player
    //spawn();
    chase();
    if(Greenfoot.getRandomNumber(100) < freq){
    spawn();
    }
    /*switch (step){
    case 1:
    chase();
    if(Greenfoot.getRandomNumber(100) < 1){
    step = 2;
    }
    case 2:
    spawn();
    if(Greenfoot.getRandomNumber(100) < 50){
    step = 1;
    }
    //rush();
    }**/
    //step two: Charge at player
    }
    public void chase()
    {
    
    setLocation(getX()+MOVE_AMOUNT, getY());
        
    
    
    }
    public void chase(int speed)
    {
    
    setLocation(getX()+speed, getY());
        
    
    
    }
    public void spawn()
    {
    humans= new Orb[spawnAmount];  
    RUN world = (RUN)getWorld();
    int i = 0;
        while (i < spawnAmount) {
            
            Orb orb = new Orb();  
            world.addObject(orb, getX(), getY());  
            humans[i] = orb;
            i++;
            break;
        }
        
    }
    public void rush()
    {
    Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
    
    turnTowards(player.getX(), player.getY()-200);
    move(5);
    }
    
}   
