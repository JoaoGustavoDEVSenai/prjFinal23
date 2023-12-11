import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bWinDialogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bWinDialogo extends World
{
    int wait = 100;
    /**
     * Constructor for objects of class bWinDialogo.
     * 
     */
    public bWinDialogo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }
    public void act(){
        if(wait > 0){
            wait--;
        }
        if(wait == 0 && Greenfoot.isKeyDown("Enter")){
            bWin world = new bWin();
            Greenfoot.setWorld(world);
        }
    }
}
