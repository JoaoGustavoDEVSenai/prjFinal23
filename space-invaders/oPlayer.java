import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oPlayer extends Actor
{
    int speed = 6;
    int sTimer = 0;
    int lifes = 2;
    int lifesEnemy = 5;
    int points = 0;
    GreenfootSound shot = new GreenfootSound("shot2.mp3"); 
    /**
     * Act - do whatever the oPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        atk();
        death();
    }
    public void move(){
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() -speed,this.getY());
        }
        else if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() +speed,this.getY());
        }
    }
    public void atk(){
        if(Greenfoot.isKeyDown("space") && sTimer == 0){
            getWorld().addObject(new oLazer(), getX() +0, getY() -50);
            sTimer++;
            shot.play();
        }else{
            if((!Greenfoot.isKeyDown("space"))){
                sTimer = 0;
            }
        }
    }
    public void death(){
        Actor a = getOneIntersectingObject(oMeteor.class);
        Actor b = getOneIntersectingObject(oEnemyLazer.class);
        if(a != null){
            lifes--;
            getWorld().removeObject(a);
        } else if(lifes == 0){
            getWorld().removeObject(this);
            bLose world = new bLose();
            Greenfoot.setWorld(world);
        }
        
        else if(b != null){
            lifesEnemy--;
            getWorld().removeObject(b);
        } else if(lifesEnemy == 0){
            getWorld().removeObject(this);
            bLoseDialogo world = new bLoseDialogo();
            Greenfoot.setWorld(world);
        }
    }
}