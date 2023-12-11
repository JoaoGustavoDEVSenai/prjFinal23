import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obigMeteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obigMeteor extends Actor
{
    int lifes = 3;
    public boolean check = true;
    /**
     * Act - do whatever the obigMeteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        death();
        fall();
        hit();
        edge();
    }
    public void hit(){
        Actor a = getOneIntersectingObject(oLazer.class);
        if(a != null){
            getWorld().removeObject(a);
            lifes--;
        } 
        if(lifes == 0){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(10);
        
            //Counter2 counter2 = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            //counter2.add(10);
            
            getWorld().removeObject(this);
            check = false;
        }
    }
    public void fall(){
        this.setLocation(this.getX(), this.getY()+2);
    }
    public void edge(){
        if(check){
            if(isAtEdge()){
                getWorld().removeObject(this);
            }
        }
    }
    public void death(){
        Actor a = getOneIntersectingObject(oPlayer.class);
        if(a != null){
            getWorld().removeObject(a);
            bLose world = new bLose();
            Greenfoot.setWorld(world);
        }
    }
}
