package src;

import java.util.List;
import java.util.Random;

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

public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getHpMax() {
		return hpMax;
	}


	public void setHpMax(int hpMax) {
		this.hpMax = hpMax;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getSpAttack() {
		return spAttack;
	}


	public void setSpAttack(int spAttack) {
		this.spAttack = spAttack;
	}


	public int getSpDefense() {
		return spDefense;
	}


	public void setSpDefense(int spDefense) {
		this.spDefense = spDefense;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getExpEvol() {
		return expEvol;
	}


	public void setExpEvol(int expEvol) {
		this.expEvol = expEvol;
	}


@Override
    public boolean tryToCatch(Trainer trainer) 
    {
    	
        System.out.println("Attempting to catch " + getName());
        Random random=new Random();
        int num=random.nextInt(100)+1;
        
        double rate = getCaptureRate(trainer);
        boolean result=true;
        if(num<=rate) {
        	result= true;
        }
        else {
        	result= false;
        }
        return result;
        
        
    }

 @Override 
    public double getCaptureRate(Trainer trainer){
    	int trainerLevel= trainer.getLevel();
    	List<Badge> trainerNumberOfBadges =trainer.getBadges();
    	
    	double taxa=(trainerLevel * 1.5) + (trainerNumberOfBadges.size() * 5);
    	
    	if(taxa>99){
    		taxa=99;
    	}
    	else if (taxa<1) {
			taxa=1;
		}
    	return taxa;
    	
    }
 	
 
 	public void heal(int amount) {
 		
 		
 		
 		if(amount>0||hp!=hpMax) {
 			if((amount+hp)>hpMax) {
 	 			
 	 		}
 		}
 	}



}
