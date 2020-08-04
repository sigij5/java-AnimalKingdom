package animalKingdom;


abstract class AbstractAnimal {
    private static int maxId = -1;

    protected int id;
    protected String name;
    protected int year;

    public AbstractAnimal(String name, int year){    
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    int getId(){
        return id;
    }

    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();

    String getName(){
        return name;
    }

    int getYear(){
        return year;
    }

    public String toString(){
        return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + year + "}\n";
    }

    public String getInfo(){
        return name + " " + getReproduce() + " " + getMove() + " " + getBreath() + " " + getYear();
    }
}