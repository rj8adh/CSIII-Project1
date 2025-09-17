import mayflower.*;
public class Zombie extends AnimatedActor
{
    private int type;
    private int health;
    private int damage;
    private String[] aImgs;
    private String[] dImgs;
    private String[] wImgs;
    private String[] hImgs;
    private Animation walk;
    private Animation dead;
    private Animation hurt;
    private Animation attack;
    public Zombie(int typer, int healthr, int damager)
    {
        type = typer;
        health = healthr;
        damage = damager;
        if(type == 1){
            for(int i = 0; i<5; i++)
            {
                aImgs[i] = "img/Zombie_1/Attack/Attack00" + i + ".png";
            }
            for(int i = 0; i<5; i++)
            {
                dImgs[i] = "img/Zombie_1/Dead/Dead00" + i + ".png";
            }
            for(int i = 0; i<4; i++)
            {
                hImgs[i] = "img/Zombie_1/Hurt/tile00" + i + ".png";
            }
            for(int i = 0; i<10; i++)
            {
                wImgs[i] = "img/Zombie_1/Walk/tile00" + i + ".png";
            }
        }
        else if(type == 2){
            for(int i = 0; i<5; i++)
            {
                aImgs[i] = "img/Zombie_2/Attack/Attack00" + i + ".png";
            }
            for(int i = 0; i<5; i++)
            {
                dImgs[i] = "img/Zombie_2/Dead/Dead00" + i + ".png";
            }
            for(int i = 0; i<4; i++)
            {
                hImgs[i] = "img/Zombie_2/Hurt/tile00" + i + ".png";
            }
            for(int i = 0; i<10; i++)
            {
                wImgs[i] = "img/Zombie_2/Walk/tile00" + i + ".png";
            }
        }
        walk = new Animation(30000000, wImgs);
        hurt = new Animation(30000000, hImgs);
        attack = new Animation(30000000, aImgs);
        dead = new Animation(30000000, dImgs);
        setAnimation(walk);
    }
    
    public void onAttack()
    {
        setAnimation(attack);
        //add a timer to reset the 
    }
    
    public void act()
    {
        super.act();
    }

}
