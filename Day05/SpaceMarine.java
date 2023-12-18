public abstract class SpaceMarine extends Unit {
    protected Weapon weapon;

    protected SpaceMarine(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public boolean equip(Weapon weapon) {
        if (weapon == null || this.weapon.isGeared()) {
            return false;
        }

        System.out.println(this.getName() + " has been equipped with a " + weapon + ".");
        this.weapon = weapon;
        this.weapon.geared = true;
        return true;
    }

    @Override
    public boolean attack(Fighter target) {
        if (this.weapon == null) {
            System.out.println(this.getName() + ": Hey, this is crazy. I'm not going to fight this empty-handed.");
            return false;
        } else if (this.weapon.isMelee() && target != null && !target.equals(this)) {
            System.out.println(this.getName() + ": I'm too far away from " + target.getName() + ".");
            return false;
        } else if (this.weapon.getApcost() > this.ap) {
            return false;
        } else if ((this.weapon.isMelee() && target == this) || !this.weapon.isMelee()) {
            target.receiveDamage(this.weapon.getDamage());
            System.out.println(
                    this.getName() + " attacks " + target.getName() + " with a " + this.weapon.getName() + ".");
            this.ap -= this.weapon.getApcost();
            return true;
        }
        return false;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
        System.out.println(this.getName() + " received " + damage + " damage.");
        if (this.hp == 0) {
            System.out.println(this.getName() + " is dead.");
        }
    }
    public boolean moveCloseTo(Fighter target) {
        if (this.weapon == null || !this.weapon.isMelee()) {
            return false;
        }
        return super.moveCloseTo(target);
    }
    public void recoverAP() {
        this.ap += 9;
        if (this.ap > 50) {
            this.ap = 50;
        }
    }
}
