import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound music = new GreenfootSound("music.mp3"); 
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void act(){
        music.play();
        int x = Greenfoot.getRandomNumber(800);
        int y = Greenfoot.getRandomNumber(50);
        int w = Greenfoot.getRandomNumber(550);
        int z = Greenfoot.getRandomNumber(1);
        if(getObjects(oMeteor.class).size() < 5){ 
        addObject(new oMeteor(), x, y);
        } else if(getObjects(obigMeteor.class).size() < 2){ 
        addObject(new obigMeteor(), w, z);
        
        counter();
        }
    }
    
        public void counter(){
        Counter counter = (Counter) getObjects(Counter.class).get(0);
        if(counter.getValue() >= 200){
            dialogo world = new dialogo();
            Greenfoot.setWorld(world);
        }
    }
    
    private void prepare()
    {
        oPlayer oPlayer = new oPlayer();
        addObject(oPlayer,412,303);
        oPlayer.setLocation(410,315);
        oPlayer.setLocation(400,306);
        oPlayer.setLocation(395,544);
        oMeteor oMeteor = new oMeteor();
        addObject(oMeteor,645,145);
        obigMeteor obigMeteor = new obigMeteor();
        addObject(obigMeteor,409,83);
        oMeteor oMeteor2 = new oMeteor();
        addObject(oMeteor2,178,272);
        oMeteor oMeteor3 = new oMeteor();
        addObject(oMeteor3,741,258);
        obigMeteor obigMeteor2 = new obigMeteor();
        addObject(obigMeteor2,80,130);
        oMeteor oMeteor4 = new oMeteor();
        addObject(oMeteor4,361,227);
        removeObject(oMeteor3);
        removeObject(oMeteor);
        removeObject(oMeteor4);
        removeObject(oMeteor2);
        removeObject(obigMeteor);
        removeObject(obigMeteor2);
        Counter counter = new Counter();
        addObject(counter,726,36);
        removeObject(counter);
        Counter counter2 = new Counter();
        addObject(counter2,724,37);
    }
}
