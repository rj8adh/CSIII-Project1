import mayflower.*;

public class Dog extends AnimatedActor
{
    private String[] imgs;
    private Animation walk;
    public Dog()
    { 
        imgs = new String[10];
        for (int i = 1; i < 11; i++)
        {
            imgs[i-1] = "img/dog/Walk (" + i + ").png";
        }
        walk = new Animation(30000000, imgs);
        walk.setTransparency(20);
        walk.scale(100, 100);
        setAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
