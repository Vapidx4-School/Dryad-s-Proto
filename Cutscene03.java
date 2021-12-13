import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cutscene03 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cutscene03 extends World
{
    private int count;
    private String[] log = 
    {
        "Drya: Congrats on reaching the end of the game!",
        "Drya: Hopefully, there'll be plenty of improvements in the future...",
        "Drya: This is goodbye for now",
        "By: Brandon, Sebastian and Ramanan",
        "Original assets by Brandon and Wendy",
        "MIT License - Copyright (c) 2021 Vapidx4",
        "Vanier College"
    };
    /**
     * Constructor for objects of class Cutscene03.
     * 
     */
    public Cutscene03()
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

        Dialogue03 dialogue = new Dialogue03();
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
            catch(Exception e){Greenfoot.setWorld(new MainMenu());}
    }
}
