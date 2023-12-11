import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oMeteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oMeteor extends Actor
{
    /**
     * Act - do whatever the oMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
        edge();
    }
    public void fall(){
        this.setLocation(this.getX(), this.getY()+2);
    }
    public void edge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
