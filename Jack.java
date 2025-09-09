import mayflower.*;

public class Jack extends AnimatedActor
{
    private String[] imgs;
    private Animation walk;
    public Jack()
    { 
        imgs = new String[7];
        for (int i = 1; i < 8; i++)
        {
            imgs[i-1] = "img/jack/Walk (" + i + ").png";
        }
        walk = new Animation(30000000, imgs);
        walk.setTransparency(70);
        walk.scale(100, 100);
        setAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
