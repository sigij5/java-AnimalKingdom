package animalKingdom;


public class MammalsFromAnimal extends AbstractAnimal{
    // public String class;

    public MammalsFromAnimal(String name, int year){
        super(name, year);
        // class = "mammal"
    }

    // @Override
    // public String getName(){
    //     return name;
    // }

    // @Override
    // public int getYear(){
    //     return year;
    // }

    // public String getClass(){
    //     return class;
    // }

    @Override
    public String getMove(){
        return "walk";
    }

    @Override
    public String getBreath(){
        return "lungs";
    }

    @Override
    String getReproduce(){
        return "live births";
    }

}