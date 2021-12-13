import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LOSE02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSE02 extends World
{
    private int count;
    private String[] log = 
    {
        "Drya: Woa, be careful there!",
        "Drya: I'll rollback time for you...",
        "Drya: Just try not to get hit, OK?",
        "V: Yea... I'll try not to..."
    };
    /**
     * Constructor for objects of class LOSE02.
     * 
     */
    public LOSE02()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 725, 1); 
        prepare();
        Greenfoot.start();
        showDialogue();
     
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        V v = new V();
        addObject(v,105,558);
        Drya drya = new Drya();
        addObject(drya,806,551);

        DialogueLose02 dialogue = new DialogueLose02();
        addObject(dialogue,1,0);
    }

    public void addDialogue(int press)
    {
        
        count = count + press;
        
        showDialogue();
        
    }
    private void showDialogue()
    {       
            try {showText(log[count], 450, 300);}
            catch(Exception e){Greenfoot.setWorld(new MyWorld());}
    }
}
