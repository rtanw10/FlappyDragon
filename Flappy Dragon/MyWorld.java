import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,223,483);
        play.setLocation(219,483);
        shop shop = new shop();
        addObject(shop,602,482);
        shop.setLocation(593,503);
        Jumper jumper = new Jumper();
        addObject(jumper,400,218);
        jumper.setLocation(384,209);
        jumper.setLocation(387,300);
        jumper.setLocation(383,211);
    }
}
