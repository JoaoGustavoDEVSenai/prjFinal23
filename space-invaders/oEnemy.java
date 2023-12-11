import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oEnemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oEnemy extends Actor
{
    int move = 6;
    int life = 20;
    /**
     * Act - do whatever the oEnemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int random = Greenfoot.getRandomNumber(200);
        if(random <= 5){
            getWorld().addObject(new oEnemyLazer(), getX(), getY());
        }
        
        
        setLocation(getX() + move, getY());
        if(getX() > 750 || (getX() < 50)){
            move = move * -1; 
        }
        
        
        int x = Greenfoot.getRandomNumber(800);
        int y = Greenfoot.getRandomNumber(50);
        int w = Greenfoot.getRandomNumber(550);
        int z = Greenfoot.getRandomNumber(1);
        if(getWorld().getObjects(oMeteor.class).size() < 5){ 
        getWorld().addObject(new oMeteor(), x, y);
        } else if(getWorld().getObjects(obigMeteor.class).size() < 2){ 
        getWorld().addObject(new obigMeteor(), w, z);
        }
        
       
       Actor b = getOneIntersectingObject(oLazer.class);
       if(b != null){
            life--;
            getWorld().removeObject(b);
        } else if(life == 0){
            getWorld().removeObject(this);
            bWinDialogo world = new bWinDialogo();
            Greenfoot.setWorld(world);
        }
    }
}
