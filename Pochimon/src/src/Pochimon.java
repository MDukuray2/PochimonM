package src;

import java.util.ArrayList;
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
 	
 
	 public void evolve(Pochimon pochimon) {
	
	 	if (this.level >= 10) {
	 		System.out.println(this.name + " is evolving");
	
	 		if (this.species.equals("PochimonBasic")) {
	 			this.species = "PochimonEvolved";
	 			this.hp += 10;
	 			this.attack += 5;
	 			this.defense += 3;
	
	 			System.out.println(this.name + " has evolved into " + this.species);
	 		}
	 		else{
	 			System.out.println(this.name + " cannot evolve.");
	 		}
	 	}
	 	else{
	 		System.out.println(this.name + " needs to be at level 10 to evolve.");
	 	}
	 }
	 public void heal(int amount) {
			if(amount <= 0) {
		 		System.out.println("Invalid healing");
		 	}
	
		 	if (this.hp == this.hpMax) {
		 		System.out.println("Hp are full");	
		 	}
	
		 	this.hp = Math.min(this.hp + amount, this.hpMax);	
	 }
	 public void takeDamage(int amount) {
		    if (amount <= 0 || this.hp == 0) {
		        return;
		    }
		    this.hp = Math.max(0, this.hp - amount);
		}

		public double calculateEffectivenessMultiplier(int movementIndex, ArrayList<String> enemyTypes) {
		    String moveType = this.movements[movementIndex];
		    double multiplier = 1.0;

		    if (moveType.equals("Fire") && enemyTypes.contains("Grass")) {
		        multiplier = 2.0;
		    } else if (moveType.equals("Fire") && enemyTypes.contains("Water")) {
		        multiplier = 0.5;
		    }

		    return multiplier;
		}

		private int calculateDamage(Pochimon enemy, int movementIndex) {
		    String moveType = this.movements[movementIndex];
		    int attackStat = (moveType.equals("Fire") || moveType.equals("Water")) ? this.spAttack : this.attack;
		    int defenseStat = (moveType.equals("Fire") || moveType.equals("Water")) ? enemy.spDefense : enemy.defense;

		    double effectiveness = calculateEffectivenessMultiplier(movementIndex, new ArrayList<>(List.of(enemy.type)));
		    double stab = (this.type[0].equals(moveType)) ? 1.5 : 1.0;

		    int power = 50;
		    int level = this.level;

		    int damage = (int) (((2 * level / 5 + 2) * power * attackStat / defenseStat) * effectiveness * stab);
		    return damage;
		}

		public void attackFoe(Pochimon enemy, Move move) {
		    int movementIndex = 0;
		    int damage = calculateDamage(enemy, movementIndex);
		    
		    enemy.takeDamage(damage);
		    
		    if (enemy.hp == 0) {
		        System.out.println(enemy.getName() + " has been defeated!");
		    }
		}

	 

 





}
