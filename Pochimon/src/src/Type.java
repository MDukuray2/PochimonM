package src;
import java.util.ArrayList;
import java.util.List;

public class Type {
    private TypeEnum type;
    private List<TypeEnum> effectiveAgainst;
    private List<TypeEnum> weakAgainst;

    // Constructor
    public Type(TypeEnum type) {
        this.type = type;
        this.effectiveAgainst = new ArrayList<>();
        this.weakAgainst = new ArrayList<>();
    }

    public TypeEnum getType() 
    {
        return type;
    }

    public void setType(TypeEnum type) 
    {
        this.type = type;
    }

    public List<TypeEnum> getEffectiveAgainst() 
    {
        return effectiveAgainst;
    }

    public void setEffectiveAgainst(List<TypeEnum> effectiveAgainst) 
    {
        this.effectiveAgainst = effectiveAgainst;
    }

    public List<TypeEnum> getWeakAgainst() 
    {
        return weakAgainst;
    }

    public void setWeakAgainst(List<TypeEnum> weakAgainst) 
    {
        this.weakAgainst = weakAgainst;
    }

    public void addEffectiveAgainst(TypeEnum type) 
    {
        effectiveAgainst.add(type);
    }

    public void addWeakAgainst(TypeEnum type) 
    {
        weakAgainst.add(type);
    }
}
