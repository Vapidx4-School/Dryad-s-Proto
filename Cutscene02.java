import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cutscene02 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cutscene02 extends World
{
    private int count;
    private String[] log = 
    {
        "Drya: Congrats on getting out of their safely...",
        "Drya: It was tough wasn't it?",
        "V: Yea, it sure was",
        "Drya: Now, lets escape that beast charging right at you!",
        "V: WHAT BEAST!?!",
        "Drya: JUST RUUUUUUUN!!!"
    };
    /**
     * Constructor for objects of class Cutscene02.
     * 
     */
    public Cutscene02()
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

        Dialogue02 dialogue = new Dialogue02();
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
