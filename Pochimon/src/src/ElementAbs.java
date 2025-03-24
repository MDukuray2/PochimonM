package src;
public abstract class ElementAbs {
    protected String name;
    protected int level;
    private int exp;
    private int expToLevelUp;

    // Constructor
    public ElementAbs(String name, int level, int exp, int expToLevelUp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
        this.expToLevelUp = expToLevelUp;
    }


    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getLevel() 
    {
        return level;
    }

    public void setLevel(int level) 
    {
        this.level = level;
    }

    public int getExp() 
    {
        return exp;
    }

    public void setExp(int exp) 
    {
        this.exp = exp;
    }

    public int getExpToLevelUp() 
    {
        return expToLevelUp;
    }

    public void setExpToLevelUp(int expToLevelUp) 
    {
        this.expToLevelUp = expToLevelUp;
    }
}
