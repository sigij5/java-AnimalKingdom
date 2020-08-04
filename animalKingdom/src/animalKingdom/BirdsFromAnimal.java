package animalKingdom;

public class BirdsFromAnimal extends AbstractAnimal{
    // private String name;
    // private int year;

    public BirdsFromAnimal(String name, int year){
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
        return "fly";
    }

    @Override
    public String getBreath(){
        return "lungs";
    }

    @Override
    String getReproduce(){
        return "eggs";
    }

}