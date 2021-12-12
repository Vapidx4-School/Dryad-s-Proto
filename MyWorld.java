import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends ScrollWorld
{
    public Player player = new Player();  
    private int score;
    private int hp;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 785, 1, 1920, 1080); 
        score = 0;
        hp = 2000;
        showScore();
        showHealth();
        Greenfoot.playSound("yes.mp3");
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,439,758);
        Ground ground2 = new Ground();
        addObject(ground2,1366,758);
        /*SpellBook spellbook = new SpellBook();
        addObject(spellbook , player.getX(), player.getY());
         */

        addCameraFollower(new Player(), 0, 0);

        SpellBook spellBook = new SpellBook();
        addObject(spellBook,0,0);

        spellBook.setLocation(3,3);
        Time time = new Time();
        addObject(time,3,3);
        Dryad dryad = new Dryad();
        addObject(dryad,530,534);
    }
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        
    }
    public void decreaseHealth(int health)
    {
        hp = hp - health;
        showHealth();
        if (hp == 0) {
            Greenfoot.playSound("sfx-magic13.mp3");
            Greenfoot.setWorld(new END());
            Greenfoot.stop();
        }
    }

    /**
     * Show our current score on screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 800, 25);
    }
    private void showHealth()
    {
        showText("Health: " + hp, 120, 25);
    }
}
