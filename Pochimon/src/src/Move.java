package src;

public class Move extends ElementAbs {
    private int id;
    private String nameMove;
    private int powerPoints;
    private int maxPowerPoints;
    private Type type;

    
    public Move(int id, String name, int level, int exp, int expToLevelUp) {
        super(name, level, exp, expToLevelUp);
        this.id = id;
    }
    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNameMove() 
    {
        return nameMove;
    }

    public void setNameMove(String nameMove) 
    {
        this.nameMove = nameMove;
    }

    public int getPowerPoints() 
    {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) 
    {
        this.powerPoints = powerPoints;
    }

    public int getMaxPowerPoints() 
    {
        return maxPowerPoints;
    }

    public void setMaxPowerPoints(int maxPowerPoints) 
    {
        this.maxPowerPoints = maxPowerPoints;
    }

    public void useMove() 
    {
        if (powerPoints > 0) 
        {
            powerPoints--;
        } 
        else 
        {
            System.out.println("No power points left for this move.");
        }
    }
}
