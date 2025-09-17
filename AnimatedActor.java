import mayflower.*;

public class AnimatedActor extends Actor
{
    // private Animation animation1;
    private Animation[] anims;
    private Timer animationTimer;
    private MayflowerImage currFrame;
    private int fRate;
    
    public AnimatedActor()
    {
        anims = new Animation[7];
        animationTimer = new Timer(30000000);
    }
    
    public void  setAnimation(Animation a)
    {
        anims[0] = a;
    }
    /*
    public void  setAnimation(Animation a,Animation b, Animation c, Animation d, Animation e)
    {
        anims[0] = a;
        anims[1] = b;
        anims[2] = c;
        anims[3] = d;
        anims[4] = e;
    }
    
    public void  setAnimation(Animation a,Animation b, Animation c, Animation d, Animation e, Animation f, Animation g, Animation h)
    {
        anims[0] = a;
        anims[1] = b;
        anims[2] = c;
        anims[3] = d;
        anims[4] = e;
        anims[5] = f;
        anims[6] = g;
        anims[7] = h;
    }
    */
    public void setFramerate(int frameRate)
    {
        fRate = frameRate;
    }
    
    public void act()
    {
        if (anims[0] != null)
        {
            if (animationTimer.isDone())
            {
                animationTimer.reset();
                currFrame = anims[0].getNextFrame();
                setImage(currFrame);
    
            }            
        }
    }
}
