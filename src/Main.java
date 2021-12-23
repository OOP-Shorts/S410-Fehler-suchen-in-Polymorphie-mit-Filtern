public class Main {

    private static final Animal[] ANIMAL_LIST = {
            new Dog("Rex", 5, "German Shepherd"),
            new Cat("Fluffy", 2, true),
            new Cat("Miezi", 13, false),
            new Cat("Moritz", 4, false),
            new Dog("Fiffy", 9, "Border Collie"),
            new Cat("Simba", 3, false),
            new Cat("Pete", 14, true),
            new Dog("Molly", 11, "Dalmatian")
    };

    public static void main(String[] args) {
        Cat[] shortFurCats =  removeDogsAndLongFurCatsFromList(ANIMAL_LIST);
        System.out.println(shortFurCats.length);
    }


    private static Cat[] removeDogsAndLongFurCatsFromList(Animal[] animals) {
        int numShortFurCats = 0;
        Cat[] shortFurCats = new Cat[];
        for (Animal animal : animals) {
            if (!animal.isHasLongFur()) {
                shortFurCats[numShortFurCats] = animal;
                numShortFurCats++;
            }
        }
        return shortFurCats;
    }
}