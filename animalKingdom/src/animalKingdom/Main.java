package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main{
    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester){
        List<AbstractAnimal> tempList = new ArrayList<>();

        for (AbstractAnimal a : animals){
            if (tester.test(a)){
                tempList.add(a);
            }
        }
        return tempList;
    }
    public static void main(String[] args){
        System.out.println("Welcome to the Animal Kingdom");

        MammalsFromAnimal panda = new MammalsFromAnimal("Panda", 1869);
        MammalsFromAnimal zebra = new MammalsFromAnimal("Zebra", 1778);
        MammalsFromAnimal koala = new MammalsFromAnimal("Koala", 1816);
        MammalsFromAnimal sloth = new MammalsFromAnimal("Sloth", 1804);
        MammalsFromAnimal armadillo = new MammalsFromAnimal("Armadillo", 1758);
        MammalsFromAnimal raccoon = new MammalsFromAnimal("Raccoon", 1758);
        MammalsFromAnimal bigfoot = new MammalsFromAnimal("Bigfoot", 2021);

        BirdsFromAnimal pigeon = new BirdsFromAnimal("Pigeon", 1837);
        BirdsFromAnimal peacock = new BirdsFromAnimal("Peacock", 1821);
        BirdsFromAnimal toucan = new BirdsFromAnimal("Toucan", 1758);
        BirdsFromAnimal parrot = new BirdsFromAnimal("Parrot", 1824);
        BirdsFromAnimal swan = new BirdsFromAnimal("Swan", 1758);

        FishFromAnimal salmon = new FishFromAnimal("Salmon", 1758);
        FishFromAnimal catfish = new FishFromAnimal("Catfish", 1817);
        FishFromAnimal perch = new FishFromAnimal("Perch", 1758);

        List<AbstractAnimal> myList = new ArrayList<>();
        myList.add(panda);
        myList.add(zebra);
        myList.add(koala);
        myList.add(sloth);
        myList.add(armadillo);
        myList.add(raccoon);
        myList.add(bigfoot);
        myList.add(pigeon);
        myList.add(peacock);
        myList.add(toucan);
        myList.add(parrot);
        myList.add(swan);
        myList.add(salmon);
        myList.add(catfish);
        myList.add(perch);

        System.out.println("\n *** MVP ***");


        System.out.println("\n*** List all the animals in descending order by year named ***");
        myList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        System.out.println(myList);


        System.out.println("\n*** List all the animals alphabetically ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(myList);

        System.out.println("\n*** List all the animals order by how they move ***");
        myList.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        System.out.println(myList);

        System.out.println("\n*** List all the animals that breath with lungs ***");
        List<AbstractAnimal> filteredList1 = filterAnimal(myList, a -> a.getBreath() == "lungs");
        filteredList1.forEach((a) -> System.out.println(a.getInfo()));

        System.out.println("\n*** List all the animals that breath with lungs and were named in 1758 ***");
        List<AbstractAnimal> filteredList2 = filterAnimal(filteredList1, a -> a.getYear() == 1758);
        filteredList2.forEach((a) -> System.out.println(a.getInfo()));
        
        System.out.println("\n*** List all the animals that lay eggs and breath with lungs ***");
        List<AbstractAnimal> filteredList3 = filterAnimal(filteredList1, a -> a.getReproduce() == "eggs");
        filteredList3.forEach((a) -> System.out.println(a.getInfo()));

        System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
        List<AbstractAnimal> filteredList4 = filterAnimal(myList, a -> a.getYear() == 1758);
        filteredList4.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        filteredList4.forEach((a) -> System.out.println(a.getInfo()));
    }
}