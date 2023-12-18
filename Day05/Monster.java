public abstract class Monster extends Unit {
    protected int damage;
    protected int apcost;

    protected Monster(String name, int hp, int ap) {
        super(name, hp, ap);
        this.damage = 0;
        this.apcost = 0;
    }

    public int getDamage() {
        return damage;
    }

    public int getApcost() {
        return apcost;
    }

    public void equip() {
        System.out.println("Monsters are proud and fight with their own bodies.");
    }

    @Override
    public boolean attack(Fighter ennemy) {
        if (super.getTarget() == ennemy) {
            if (getAp()  >= getApcost()) {
                System.out.println(getName() + " attacks " + ennemy.getName() + ".");
                receiveDamage(getDamage());
                ap -= getApcost();
                return true;
            }
        } else {
            System.out.println(getName() + ": I'm too far away from " + ennemy.getName() + ".");
        }
        return false;
    }
}
