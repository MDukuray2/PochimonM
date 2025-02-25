package src;
public class Pochimon extends ElementAbs implements ICatchable {
    private int id;
    private String species;
    private String description;
    private boolean isShiny;
    private boolean isWild;
    private String[] type;
    private String[] movements;
    private int hp, hpMax, attack, defense, spAttack, spDefense, speed, expEvol;

    public Pochimon(int id, String name, int level, int exp, int expToLevelUp) {
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

    public String getSpecies() 
    {
        return species;
    }

    public void setSpecies(String species) 
    {
        this.species = species;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public boolean isShiny() 
    {
        return isShiny;
    }

    public void setShiny(boolean isShiny) 
    {
        this.isShiny = isShiny;
    }

    public boolean isWild() 
    {
        return isWild;
    }

    public void setWild(boolean isWild) 
    {
        this.isWild = isWild;
    }

    public String[] getType() 
    {
        return type;
    }

    public void setType(String[] type) 
    {
        this.type = type;
    }

    public String[] getMovements() 
    {
        return movements;
    }

    public void setMovements(String[] movements) 
    {
        this.movements = movements;
    }

    @Override
    public void tryToCatch() 
    {
        System.out.println("Attempting to catch " + getName());
    }

    @Override
    public double getCaptureRate() 
    {
        return isWild ? 0.5 : 0.1;
    }
}
