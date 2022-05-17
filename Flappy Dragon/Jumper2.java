import greenfoot.*;
 
public class Jumper2 extends Actor
{
    private int speed = 7;
    private int vSpeed = 0;
    private int acceleration = 1;
    private int jumpStrength = 7;
    int score = saver.score;
 
    public Jumper2()
    {
        score = 0;
    }
 
    public void act() 
    {
        controls();
        checkFall();
        touchPipe();
        touchGround();
    }    
     
    public void controls()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            jump();
        }
        if(Greenfoot.isKeyDown("up"))
        {
            jump();
        }
    }
     
    public void moveLeft()
    {
        setLocation(getX() - speed, getY());
    }
     
    public void moveRight()
    {
        setLocation(getX() + speed, getY());
    }
     
    public void jump()
    {
        vSpeed = -jumpStrength;
        fall();
    }
     
    public void checkFall()
    {
        if(onGround()) {
            vSpeed = 0;
            Greenfoot.delay(50);
        }
        else {
            fall();
        }
    }
     
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset (0, getImage().getHeight() / 2, Ground.class);
        return under != null;
        
    }
     
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
    }
    public void touchPipe()
    {
        if(isTouching(pipe.class) || isTouching(pipe2.class))
        {
            Greenfoot.delay(50);
            over a = new over();
            Greenfoot.setWorld(a);
        }
    }
    public void touchGround()
    {
       if(isTouching(Ground.class))
        {
            Greenfoot.delay(50);
            over a = new over();
            Greenfoot.setWorld(a);
        } 
    }
}
    

