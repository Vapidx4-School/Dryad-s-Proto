import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private int count;
    private String[] log = 
    {
        "V: Why... am I here?", 
        "Drya: Our forest is under attack...", 
        "Drya: I'm starting to lose my power...",
        "Drya: So I'm summoning you to help defend our lands...",
        "Drya: You'll be placed inside a cabin and you'll have to shoot down some targets",
        "Drya: You won't be able to jump tho...",
        "Drya: Just try your best to take down all of the targets...",
        "Drya: Then you'll be allowed to leave",
        "V: Wait, this is too much to take in all at once!",
        "V: I don't have any special powers or anything...",
        "Drya: Don't worry, I'll grant you a new body that you can control...",
        "Drya: You'll be able to cast spells and fly as you please",
        "Drya: However, the cabin is a no fly zone haha",
        "Drya: I wish you the best of luck!",
        "V: WAIT I DONT THINK I CAN DO THIS!!!",
        "Drya: See you soooon"
    };
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
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

        Dialogue dialogue = new Dialogue();
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
            catch(Exception e){Greenfoot.setWorld(new Cabin());}
    }
}
