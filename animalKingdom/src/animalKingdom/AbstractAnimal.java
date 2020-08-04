package animalKingdom;


abstract class AbstractAnimal {
    private static int maxId = 0;

    protected int id;

    public AbstractAnimal(){    
        maxId++;
        id = maxId;
    }

    int getId(){
        return id;
    }

    abstract String getName();
    abstract int getYear();
    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();

}