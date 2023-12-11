import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oEnemyLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oEnemyLazer extends Actor
{
    /**
     * Act - do whatever the oEnemyLazer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtack();
        edge();
    }
    public void moveAtack(){
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round (getX() - Math.cos(angle));
        int y = (int) Math.round (getY() - Math.sin(angle));  
        setLocation(x-01, y+10);
    }
    public void edge(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
