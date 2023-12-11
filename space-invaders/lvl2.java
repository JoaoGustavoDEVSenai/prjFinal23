import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lvl2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lvl2 extends World
{
    /**
     * Constructor for objects of class lvl2.
     * 
     */
    public lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        oPlayer oPlayer = new oPlayer();
        addObject(oPlayer,402,536);
        oEnemy oEnemy = new oEnemy();
        addObject(oEnemy,392,52);
        oPlayer.setLocation(379,557);
        oPlayer.setLocation(379,556);
        oPlayer.setLocation(392,553);
        oPlayer.setLocation(396,520);
        oEnemy.setLocation(400,79);
        oPlayer.setLocation(384,552);
        oPlayer.setLocation(385,538);
        Counter counter = new Counter();
        addObject(counter,733,28);
        counter.setLocation(736,26);
        removeObject(counter);
        Counter counter2 = new Counter();
        addObject(counter2,724,48);
    }
}
