import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cabin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cabin extends World
{
    private int score;

    /**
     * Constructor for objects of class Cabin.
     * 
     */
    public Cabin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 785, 1); 
        prepare();
        Greenfoot.start();
        showScore();
        showText("Reach a score of 100 to proceed", 200, 25);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player01 player01 = new Player01();
        addObject(player01,394,470);
        Floor floor = new Floor();
        addObject(floor,85,780);
        Floor floor2 = new Floor();
        addObject(floor2,832,780);
        SpellBook01 spellBook01 = new SpellBook01();
        addObject(spellBook01,1,1);
        DreamSucker dreamSucker = new DreamSucker();
        addObject(dreamSucker,250,249);
    }

    /**
     * Show our current score on screen.
     */
    private void showScore()
    {
        showText("Score: " + score, 800, 25);
    }
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if(score == 100){
            Door door = new Door();
            addObject(door, 850, 660);
        
        }
    }
}
