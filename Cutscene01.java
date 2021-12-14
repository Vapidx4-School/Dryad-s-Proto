import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cutscene01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cutscene01 extends World
{
    private int count;
    private String[] log = 
    {
        "Left click to proceed dialogue...",
        "Drya: Congrats, it seems like youre getting the hang of things!",
        "V: I told you that I wasn't ready!!!",
        "Drya: Oh well, but you still manage to pass the test",
        "Drya: Now lets put your skills to the test!",
        "V: Ughhh",
        "Drya: Atleast you'll be able to fly and move more freely now!",
        "Drya: Now lets wreck that evil Camp Demon out there!",
        "Drya: Just try not to get hit... One shot and you're out!",
        "Left: A   Right: D    Fly: W    Shoot: Space",
        "Remember that you wont be able to fly in the first level..."};
    /**
     * Constructor for objects of class Cutscene01.
     * 
     */
    public Cutscene01()
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

        Dialogue01 dialogue = new Dialogue01();
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
