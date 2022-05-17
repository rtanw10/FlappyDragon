import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game extends World
{

    /**
     * Constructor for objects of class game.
     * 
     */
    public game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1);
        addObject(new Jumper2(), 82, 276);
        addObject(new Ground(), 400, 620);
        addObject(new pipe(), 746, 446);
        addObject(new pipe2(), 746, 1);
        addObject(new saver(), 1, 329);

    }
}
