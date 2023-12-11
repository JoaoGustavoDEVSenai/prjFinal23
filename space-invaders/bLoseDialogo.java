import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bLoseDialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bLoseDialogo extends World
{
    int wait = 100;
    /**
     * Constructor for objects of class bLoseDialogo.
     * 
     */
    public bLoseDialogo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
        if(wait > 0){
            wait--;
        }
        if(wait == 0 && Greenfoot.isKeyDown("Enter")){
            bLose world = new bLose();
            Greenfoot.setWorld(world);
        }
    }
}
