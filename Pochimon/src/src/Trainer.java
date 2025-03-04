package src;
import java.util.ArrayList;
import java.util.List;

public class Trainer extends ElementAbs {
    private String id;
    private List<Badge> badges;
    private Pochimon[] team;

    // Constructor
    public Trainer(String id, String name, int level, int exp, int expToLevelUp) {
        super(name, level, exp, expToLevelUp);  
        this.id = id;
        this.badges = new ArrayList<>();
        this.team = new Pochimon[6];
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public List<Badge> getBadges() 
    {
        return badges;
    }

    public void addBadge(Badge badge){
    	if(badges.size()==8) {
    		System.out.println("No podem afegir més insignies ");
    	}
    	else {
    		badges.add(badge);
		}
        
    }

    public Pochimon[] getTeam() 
    {
        return team;
    }

    public boolean addPochimon(Pochimon pochimon) 
    {
        for (int i = 0; i < team.length; i++) {
            if (team[i] == null) {
                team[i] = pochimon;
                return true;
            }
        }
        return false;  // Equipo lleno
    }

    public boolean removePochimon(Pochimon pochimon) 
    {
        for (int i = 0; i < team.length; i++) {
            if (team[i] != null && team[i].equals(pochimon)) {
                team[i] = null;
                return true;
            }
        }
        return false;
    }
}
