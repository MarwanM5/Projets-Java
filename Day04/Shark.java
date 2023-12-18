public class Shark extends Animal {
    private Boolean frenzy;

    public Shark(String name) {
        super(name, 0, Type.FISH);
        this.frenzy = false;
        System.out.println("A KILLER IS BORN!");
    }

    public void smellBlood(Boolean frenzy) {
        this.frenzy = frenzy;
    }

    public void status() {
        if (frenzy) {
            System.out.println(getName() + " is smelling blood and wants to kill.");
        }

        else {
            System.out.println(getName() + " is swimming peacefully.");
        }

    }

    public Boolean canEat(Animal animal) {
        if (animal instanceof Shark) {
            return false;
        }

        else {
            return true;
        }
    }

    public void eat(Animal animal) {
        if (canEat(animal) == true) {
            System.out.println(getName() + " ate a " + animal.getType() + " named " + animal.getName() + ".");
            smellBlood(false);
        }

        else {
            System.out.println(getName() + ": It's not worth my time." );
        }
    }
}
