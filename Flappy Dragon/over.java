import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class over here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class over extends World
{

    /**
     * Constructor for objects of class over.
     * 
     */
    int score = saver.score;
    public over()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 650, 1); 
        addObject(new play(),394,477);
        showText("Score: " + score, 413, 231);
    }
}
