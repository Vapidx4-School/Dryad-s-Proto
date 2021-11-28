import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ken here.
 * 
 * @author Jacob Schwartz
 * @version 1.0
 */
public class Ken extends Support
{
private GreenfootImage punching1;
private GreenfootImage punching2;
private GreenfootImage kicking1;
private GreenfootImage kicking2;
private boolean isPunching;
private boolean isKicking;
private boolean isWalking;
private int punchTimer;
private int kickTimer;
private int walkTimer;
private int walkTimer2;
private int sTimer;
private int lifeSpawn;
public Ken()
{
    punching1 = new GreenfootImage("KenPunching1.png");
    kicking1 = new GreenfootImage("KenKicking1.png");
    kicking2 = new GreenfootImage("KenKicking2.png");
    isPunching = false;
    isKicking = false;
    isWalking = false;
    punchTimer = 0;
    kickTimer = 0;
    walkTimer = 0;
    walkTimer2 = 0;
    sTimer = 0;
    lifeSpawn = 0;
}
    /**
     * Act - do whatever the Ken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     * lifeSpawn creates a lifeBar above the player's head
     */
    public void act() 
    {
        checkKeyPress();
        if (lifeSpawn < 1)
            getWorld().addObject(new lifeBar2(), getX(), 85);
        lifeSpawn++;
    } 
/**
 * Checks if key is pressed to walk, punch, or kick
 * If special attack key is held for x frames, the character will execute a projectile attack
 * Left and Right keys are arrows for Ryu, "a" and "d" for Ken
 * Kick and Punch keys are "n" and "m" for Ryu, "f" and "g" for Ken
 * Special Attack moves are "k" for Ryu, "t" for Ken
 * One successive line of code after each if statement in greenfoot counts in the method. I did it to make the code less tedious.
 */
public void checkKeyPress()
    {
    if (Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("g") && 
    !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("s") && 
    !Greenfoot.isKeyDown("t") && !contact(Ryu.class) )
    {
            moveBackwards();
        walkTimer ++;

            if(walkTimer == 0)
                setImage("KenWalking1.png");
            if(walkTimer == 6)
                setImage("KenWalking1.png");
            if(walkTimer == 11)
                setImage("KenWalking3.png");
            if(walkTimer == 16)
                setImage("KenWalking2.png");
            if(walkTimer == 21)
            {
                setImage("KenWalking2.png");
                walkTimer = 0;
            }
    }
    else
    {
        if(!Greenfoot.isKeyDown("a") && !Greenfoot.isKeyDown("d") && 
        !Greenfoot.isKeyDown("g") && !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("t"))
        {
        setImage("KenWalking1.png");
        }
        }
    if (Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("g") 
    && !Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("s")  
    && !Greenfoot.isKeyDown("t") )
    {
        move();
         walkTimer2 ++;

            if(walkTimer2 == 0)
                setImage("KenWalking2.png");
            if(walkTimer2 == 6)
                setImage("KenWalking3.png");
            if(walkTimer2 == 11)
                setImage("KenWalking4.png");
            if(walkTimer2 == 16)
                setImage("KenWalking5.png");
            if(walkTimer2 == 21)
            {
                setImage("KenWalking6.png");
                walkTimer2 = 0;
            }
    }
    if (!isPunching && Greenfoot.isKeyDown("g") && !Greenfoot.isKeyDown("t"))
    {
            setImage(punching1);
            punchTimer++;
            isPunching = true;
        }
    if (isPunching && !Greenfoot.isKeyDown("g"))
        {
            setImage("KenWalking1.png");
            isPunching = false;
            punchTimer = punchTimer - 7;
        }
    if (!isKicking && Greenfoot.isKeyDown("f") && !Greenfoot.isKeyDown("t"))
    {
            setImage(kicking1);
            kickTimer++;
        }  
    if (!isKicking && getImage() == kicking1 && Greenfoot.isKeyDown("f") && kickTimer == 9)
        {
            setImage(kicking2);
            isKicking = true;
        }
    if (isKicking && !Greenfoot.isKeyDown("f"))
        {
            setImage("KenWalking1.png");
            isKicking = false;
            kickTimer = kickTimer - 9;
        }
    if (Greenfoot.isKeyDown("s") && !Greenfoot.isKeyDown("t"))
    {
        setImage("KenBlocking.png");
    }
    if (Greenfoot.isKeyDown("t"))
    {
         sTimer ++;

            if(sTimer == 0)
                setImage("KenHadoukan1.png");
            if(sTimer == 6)
                setImage("KenHadoukan1.png");
            if(sTimer == 11)
                setImage("KenHadoukan2.png");
            if(sTimer == 16)
                setImage("KenHadoukan2.png");
            if(sTimer == 21)
                setImage("KenHadoukan2.png");
            if(sTimer == 26)
                {
                    setImage("KenHadoukan3.png");
                    getWorld().addObject(new Hadoukan(), getX() - 20, getY());
                }
            if(sTimer == 56)
                setImage("KenHadoukan3.png");
    }
    else {
            if (!Greenfoot.isKeyDown("t")){
                sTimer = 0;
            }
    }
    if(contact(Hadouken.class) && !Greenfoot.isKeyDown("s"))
    {
            getWorld().addObject (new p1wins(), 310, 100);
            Greenfoot.stop();
    }
    if(Greenfoot.isKeyDown("1"))
            Greenfoot.setWorld(new World1());
    if(Greenfoot.isKeyDown("2"))
            Greenfoot.setWorld(new World2());
    if(Greenfoot.isKeyDown("3"))
            Greenfoot.setWorld(new World3());
    if (Greenfoot.isKeyDown("p") && Greenfoot.isKeyDown("u"))
    {
        for(int awesome = 0; awesome < 100; awesome++)
            {
                getWorld().addObject(new AwesomeCrab(), Greenfoot.getRandomNumber(620), Greenfoot.getRandomNumber(200));
                getWorld().addObject(new p2wins(), Greenfoot.getRandomNumber(620), Greenfoot.getRandomNumber(200));
            }
    }
    }   
    }
