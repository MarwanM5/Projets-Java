public abstract class Character implements Movable {
    protected String name;
    protected int life = 50;
    protected int agility = 2;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

    public Character(String name, String RPGClass) {
        this.name = name;
        this.RPGClass = RPGClass;
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

    public void attack(String name) throws WeaponException {
        if (name.isEmpty()) {
            throw new WeaponException(getName() + ": I refuse to fight with my bare hands.");
        }
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

    public void tryToAttack(String weapon) {
        try {
            this.attack(weapon);
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

    
        
    public static void main(String[] args) {
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");
        warrior.tryToAttack("screwdriver");
        mage.tryToAttack("hammer");
        warrior.tryToAttack("hammer");
        try {
            mage.attack(" ");
        } catch (WeaponException e) {
            System.out.println(e.getMessage());
        }
    }

}
