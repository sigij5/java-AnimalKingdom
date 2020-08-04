package animalKingdom;

public class FishFromAnimal extends AbstractAnimal{
    // private String name;
    // private int year;

    public FishFromAnimal(String name, int year){
        super(name, year);
    }

    // @Override
    // public String getName(){
    //     return name;
    // }

    // @Override
    // public int getYear(){
    //     return year;
    // }

    @Override
    public String getMove(){
        return "swim";
    }

    @Override
    public String getBreath(){
        return "gills";
    }

    @Override
    String getReproduce(){
        return "eggs";
    }
}