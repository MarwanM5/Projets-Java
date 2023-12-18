public abstract class Character implements Movable, Comparable<Character> {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;
    protected int capacity = 0;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
    }

    public Character(String name, String RPGClass, int capacity) {
        this.name = name;
        this.RPGClass = RPGClass;
        this.capacity = capacity;
    }

    @Override
    public int compareTo(Character character) {
        if (this.getClass() == character.getClass()) {
            return Integer.compare(this.capacity, character.capacity);
        }
        else if (this instanceof Mage && character instanceof Warrior){
            return (character.capacity % this.capacity == 0) ? -1 : 1;
        }
        else if (this instanceof Warrior && character instanceof Mage) {
            return (this.capacity % character.capacity == 0) ? 1 : -1;
        }
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getRPGClass() {
        return this.RPGClass;
    }

    public int getLife() {
        return this.life;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getWit() {
        return this.wit;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void attack(String name) {
        System.out.println(getName() + ": Rrrrrrrrr....");
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back");
    }

    public final void unsheathe() {
        System.out.println(getName() + ": unsheathes his weapon.");
    }

    public static void main(String[] args) {
    Character merlin = new Mage("Merlin", 12);
    Character gandalf = new Mage("Gandalf", 12);
    Character mandrake = new Mage("Mandrake", 9);
    Character achilles = new Warrior("Achilles", 240);
    merlin.compareTo(mandrake);
    System.out.println(merlin.compareTo(mandrake));
    merlin.compareTo(achilles);
    System.out.println(merlin.compareTo(achilles));
    gandalf.compareTo(merlin);
    System.out.println(gandalf.compareTo(merlin));
    }
            
}
            

