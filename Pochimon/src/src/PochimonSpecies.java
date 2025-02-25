package src;
import java.util.ArrayList;
import java.util.List;

public class PochimonSpecies {
    private String speciesName;
    private List<Type> basicType;

    public PochimonSpecies(String speciesName) {
        this.speciesName = speciesName;
        this.basicType = new ArrayList<>();
    }

    public String getSpeciesName() 
    {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) 
    {
        this.speciesName = speciesName;
    }

    public List<Type> getBasicType() 
    {
        return basicType;
    }

    public void setBasicType(List<Type> basicType) 
    {
        this.basicType = basicType;
    }

    public void addType(Type type) 
    {
        basicType.add(type);
    }
}
