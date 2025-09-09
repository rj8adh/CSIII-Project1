import mayflower.*;

public class NinjaGirl extends AnimatedActor
{
    private String[] imgs;
    private Animation walk;
    public NinjaGirl()
    { 
        imgs = new String[10];
        for (int i = 0; i < 10; i++)
        {
            imgs[i] = "img/ninjagirl/Run__00" + i + ".png";
        }
        walk = new Animation(30000000, imgs);
        walk.setTransparency(58);
        walk.scale(150, 107);
        setAnimation(walk);
    }
    public void act()
    {
        super.act();
    }
}
