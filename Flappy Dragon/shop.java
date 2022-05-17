import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shop extends Actor
{
    /**
     * Act - do whatever the shop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
       {
           shopping a = new shopping();
           Greenfoot.setWorld(a);
       }
    }    
}
