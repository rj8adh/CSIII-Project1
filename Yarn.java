import mayflower.*;
public class Yarn extends Actor
{
    public void act() 
    {
        if (isTouching(Cat.class))
        {
            // execute if Yarn is touching Cat obj
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            c.increaseScore(1);
            System.out.println("SCORE: " + c.getScore());
            
            World w = getWorld(); //get this actors world
            w.removeObject(this); //remove this from the world
        }
    }
    
    public Yarn()
    {
        setImage("img/yarn.png");
    }
}
