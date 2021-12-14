import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RUN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RUN extends ScrollWorld
{

    /**
     * Constructor for objects of class RUN.
     * 
     */
    public RUN()
    {
        super(900, 760, 1, 9000, 1080);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ground ground = new Ground();
        addObject(ground,267,759);
        Ground ground2 = new Ground();
        addObject(ground2,1192,758);
        Ground ground3 = new Ground();
        addObject(ground3,2119,757);
        Ground ground4 = new Ground();
        addObject(ground4,3046,756);
        Ground ground5 = new Ground();
        addObject(ground5,3973,759);
        Ground ground6 = new Ground();
        addObject(ground6,4898,758);
        Ground ground7 = new Ground();
        addObject(ground7,5825,757);
        Ground ground8 = new Ground();
        addObject(ground8,6753,756);
        ground8.setLocation(6717,760);
        Ground ground9 = new Ground();
        addObject(ground9,7649,759);
        Ground ground10 = new Ground();
        addObject(ground10,8573,762);
        ground10.setLocation(8720,772);

        Bigmo bigmo = new Bigmo();
        addObject(bigmo,333,465);
        RunCamp copyOfCamp = new RunCamp();
        addObject(copyOfCamp,828,77);

        Player02 player02 = new Player02();
        addObject(player02,422,693);

        SpellBook02 spellBook02 = new SpellBook02();
        addObject(spellBook02,2,8);

        Door02 door02 = new Door02();
        addObject(door02,8500,660);
        RunCamp copyOfCamp2 = new RunCamp();
        addObject(copyOfCamp2,223,77);

        Hitbox hitbox = new Hitbox();
        addObject(hitbox,114,700);

        RunCamp runCamp3 = new RunCamp();
        addObject(runCamp3,807,553);
        FallOff fallOff = new FallOff();
        addObject(fallOff,8129,759);
        FallOff fallOff2 = new FallOff();
        addObject(fallOff2,8177,758);
        FallOff fallOff3 = new FallOff();
        addObject(fallOff3,8206,757);
    }
}
