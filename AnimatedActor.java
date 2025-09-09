import mayflower.*;

public class AnimatedActor extends Actor
{
    private Animation animation;
    private Timer animationTimer;
    private MayflowerImage currFrame;
    private int fRate;
    
    public AnimatedActor()
    {
        animationTimer = new Timer(30000000);
    }
    
    public void  setAnimation(Animation a)
    {
        animation = a;
    }
    
    public void setFramerate(int frameRate)
    {
        fRate = frameRate;
    }
    
    public void act()
    {
        if (animation != null)
        {
            if (animationTimer.isDone())
            {
                animationTimer.reset();
                currFrame = animation.getNextFrame();
                setImage(currFrame);
    
            }            
        }
    }
}
