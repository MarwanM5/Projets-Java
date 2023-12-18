public class Animal {

    protected enum Type {
        MAMMAL,
        FISH,
        BIRD,
    }

    private String name;
    private int legs;
    private Type type;
    
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal(String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        
        numberOfAnimals++;
        switch (type) {
            case MAMMAL:
                numberOfMammals++;
                break;
            case FISH:
                numberOfFish++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
            default:
                break;
        }

        System.out.println("My name is " + name + " and I am a " + getType() + "!");
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }

    public String getType() {
        return type.name().toLowerCase();
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        System.out.println("There " + (numberOfMammals == 1 ? "are" : "are") + " currently " + numberOfMammals + " mammal" + (numberOfMammals == 1 ? "" : "s" + " in our world."));
        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        System.out.println("There " + (numberOfFish == 1 ? "are" : "are") + " currently " + numberOfFish + " fish" + (numberOfFish == 1 ? "" : "" + " in our world."));
        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        System.out.println("There " + (numberOfBirds == 1 ? "are" : "are") + " currently " + numberOfBirds + " bird" + (numberOfBirds == 1 ? "" : "s" + " in our world."));
        return numberOfBirds;
    }

    public static void displayNumberOfAnimals() {
        System.out.println("There " + (numberOfAnimals == 1 ? "are" : "are") + " currently " + numberOfAnimals + " animal" + (numberOfAnimals == 1 ? "" : "s" + " in our world."));
    }

    public static void main(String[] args) {
    Animal isidore = new Animal("Isidore", 4, Animal.Type.MAMMAL);
    Animal birdo = new Animal("Birdo", 2, Animal.Type.BIRD);
    Animal birdy = new Animal("Birdy", 2, Animal.Type.BIRD);
        
    System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs and is a " + isidore.getType() + ".");
    System.out.println(birdo.getName() + " has " + birdo.getLegs() + " legs and is a " + birdo.getType() + ".");
    System.out.println(birdy.getName() + " has " + birdy.getLegs() + " legs and is a " + birdy.getType() + ".");

        displayNumberOfAnimals();

    }
}

