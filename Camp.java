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
    private int xOffset, yOffset;
    int step = 1;
    int spawnAmount = 3;
    private Human[] humans;
    
    GifImage gifImage = new GifImage("evil_wizard_idle.gif");
    /**
     * Act - do whatever the Camp wants to do. This method is called whenever
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
    if(Greenfoot.getRandomNumber(100) < 20){
    spawn();
    }
    /**switch (step){
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
    
    Actor player = (Actor)getWorld().getObjects(Player.class).get(0);
    //turnTowards(player.getX(), player.getY()-200);
    /*if(getX() != player.getX() && getY() != player.getY() ){
        if(Greenfoot.getRandomNumber(100)<10){
        turnTowards(player.getX(), player.getY()-400);
        turn(45);
        move(5);
        
        }
        else{
        turnTowards(player.getX(), player.getY()-400);
        }
    }
    else{
        setRotation(0);
        }*/
        move(5);
        if(Greenfoot.getRandomNumber(100)<10){
        turnTowards(player.getX(), player.getY()-400);
        turn(45);
        }
        
    
    
    }
    public void spawn()
    {
    humans= new Human[spawnAmount];  
    MyWorld world = (MyWorld)getWorld();
    int i = 0;
        while (i < spawnAmount) {
            
            Human human = new Human();  
            world.addObject(human, getX(), getY());  
            humans[i] = human;
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
