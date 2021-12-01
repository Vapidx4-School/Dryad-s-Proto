import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Time here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Time extends ScrollActor
{
    private final long nanoSecondsPerMillisecond = 1000000;
    private final long nanoSecondsPerSecond = 1000000000;
    private final long nanoSecondsPerMinute = 60000000000L;
    private final long nanoSecondsPerHour = 3600000000000L;
    private final int simulationSpeed = greenfoot.core.Simulation.getInstance().getSpeed();
    
    

    private long startTime = 0;
    private boolean running = true;
    /**
     * Act - do whatever the Time wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        getWorld().showText("Millis: " + getElapsedMilliseconds()%10000, 120, 469);
        getWorld().showText("Seconds: " + getElapsedSeconds()%10, 120, 420);
        getWorld().showText("Speed:" + simulationSpeed + "ms/frame", 120, 380);
        getWorld().showText("FPS:" + fps(), 120, 330);
    }
    public long getElapsedMilliseconds() 
    {
        long elapsedTime;

        if (running)
            elapsedTime = (System.nanoTime() - startTime);
        else
            elapsedTime = (startTime);

        return (elapsedTime / nanoSecondsPerMillisecond);
    }
    public long getElapsedSeconds() 
    {
        long elapsedTime;

        if (running)
            elapsedTime = (System.nanoTime() - startTime);
        else
            elapsedTime = (startTime);

        return (elapsedTime / nanoSecondsPerSecond);
    }

}
