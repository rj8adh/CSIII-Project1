import mayflower.*;
public class Animation
{
    private int fRate;
    private String[] fNames;
    private MayflowerImage[] frames;
    private int currentFrame;
    
    public Animation(int frameRate, String[] filenames)
    {
        fRate = frameRate;
        fNames = filenames;
        currentFrame = 0;
        frames = new MayflowerImage[filenames.length];
        for (int i = 0; i < filenames.length; i++)
        {
            frames[i] = new MayflowerImage(filenames[i]);
            System.out.println("POPULATING IMAGE:" + filenames[i]);
        }
        
    }
    
    public int getFrameRate()
    {
        return fRate;
    }
    
    public MayflowerImage getNextFrame()
    {
        MayflowerImage currFrame = frames[currentFrame % frames.length];
        currentFrame++;
        return currFrame;
    }
    
    public void setTransparency(int percent)
    {
        for (int i = 0; i < frames.length; i++)
        {
            frames[i].setTransparency(percent);
        }
        System.out.println("SET TRANSPARENCY");
    }
    
    public void scale(int x, int y)
    {
        for (int i = 0; i < frames.length; i++)
        {
            frames[i].scale(x, y);
        }
        System.out.println("SET TRANSPARENCY");
    }
}
