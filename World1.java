import mayflower.*;


public class World1 extends World {

    private Cat cat;
    private Dog dog;
    private Jack jack;
    private String[][] tiles;
    
    public World1() 
    {
        tiles = new String[6][8];
        createTiles();
        addRandomObjects();
        addMainCharacter();
        buildWorld();
        setBackground("img/BG/BG.png");
      
//        cat = new Cat();
//        addObject(cat, 100, 100);
        
//        dog = new Dog();
//        addObject(dog, 400,100);
        
//        jack = new Jack();
//        addObject(jack, 100, 450);

//        ng = new Ninja();
//        addObject(ng, 140,500);
    }
    
    public void act()
    {
    }
    
    public void createTiles()
    {
        for (int r = 0; r < tiles.length; r++)
        {
            // fill tiles with empty string
            for (int c = 0; c < tiles[r].length; c++)
            {
                tiles[r][c] = "";
            }
        }
        
        for (int i = 0; i < tiles[0].length; i++)
        {
            tiles[5][i] = "ground";
        }
        
        tiles[4][7] = "jack";
    }
    
    public void buildWorld()
    {
        for (int row = 0; row < tiles.length; row++)
        {
            for (int col = 0; col < tiles[row].length; col++)
            {
                if (tiles[row][col].equals("ground"))
                    addObject(new Block(), col*100, row*100);
                else if (tiles[row][col].equals("yarn"))
                    addObject(new Yarn(), col*100, row*100);
                else if (tiles[row][col].equals("jack"))
                    addObject(new Jack(), col*100, row*100);
                else if (tiles[row][col].equals("dog"))
                    addObject(new Dog(), col*100, row*100);
            }
        }
    }
    
    public void addRandomObjects()
    {
        for (int r = 0; r < tiles.length-1; r++)
        {
            for (int c = 0; c < tiles[r].length-1; c++)
            {
                if ((int) (Math.random() * tiles[r].length) < 3)
                    tiles[r][c] = "yarn";
                if ((int) (Math.random() * (tiles[r].length * 2)) == 1)
                    tiles[r][c] = "dog";
            }
        }
    }
    
    public void addMainCharacter()
    {
        cat = new Cat();
        int row = (int) (Math.random()*tiles.length-1);
        int col = (int) (Math.random()*tiles[0].length);
        tiles[row][col] = "";
        addObject(cat,col * 100,row * 100);
    }
    
}