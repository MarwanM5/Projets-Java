public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        System.out.println(getName() + ": My name will go down in history!");
    }

    public Warrior(String name, int capacity) {
        super(name, "Warrior", capacity);
        this.life = 100;
        this.strength = 10;
        this.agility = 8;
        this.wit = 3;
        this.capacity = capacity;
        System.out.println(getName() + ": My name will go down in history!");
    }

    public void attack(String weapon) {
        if (weapon.equals("hammer") || weapon.equals("sword")) {
            System.out.println(getName() + ": Rrrrrrrrr....");
            System.out.println(getName() + ": I'll crush you with my " + weapon + "!");
        }
    }

    @Override
    public void moveRight() {
        System.out.println(getName() + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(getName() + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(getName() + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(getName() + ": moves back like a bad boy.");
    }

    
}

