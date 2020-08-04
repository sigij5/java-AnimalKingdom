package animalKingdom;


public class MammalsFromAnimal extends AbstractAnimal{
    private String name;
    private int year;

    public MammalsFromAnimal(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public int getYear(){
        return year;
    }

    @Override
    public String getMove(){
        return "walk";
    }

    @Override
    public String getBreath(){
        return "lungs";
    }

    @Override @Override
    String getReproduce(){
        return "live births";
    }

}