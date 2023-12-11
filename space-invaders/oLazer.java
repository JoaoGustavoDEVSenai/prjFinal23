import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oLazer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oLazer extends Actor
{
    GifImage myGif = new GifImage("lazer.gif");
    int points = 0;
    /**
     * Act - do whatever the oLazer wants to do. This method is called whenever
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
            setLocation(x+01, y-10);
    }
    public void edge(){
        Actor a = getOneIntersectingObject(oMeteor.class);
        if(isAtEdge()){
            getWorld().removeObject(this);
        }else if(a != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(5);
            
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        }
    }
}

