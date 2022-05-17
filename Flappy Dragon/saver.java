import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class saver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class saver extends Actor
{
    /**
     * Act - do whatever the saver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
    public saver(){
        score = 0;
    }
    public void act() 
    {
        getWorld().showText("Score: " + score, 60, 15); 
        if (isTouching(pipe.class) && isTouching(pipe2.class)) {
            removeTouching(pipe.class);
            removeTouching(pipe2.class);
            int y = (Greenfoot.getRandomNumber(131)+1);
            int x = (Greenfoot.getRandomNumber(649)+446);
            getWorld().addObject(new pipe(), 748, x);
            getWorld().addObject(new pipe2(), 748, y);
            score = score + 1;
        }
    }        
}
