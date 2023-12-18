package Decorator;

public class FireSword extends StuffDecorator {
    
    public FireSword(Warrior holder) {
        this.holder = holder;
        System.out.println("I can slice and burn like the wind and the flames.");
    }

    @Override
    public int getDmg() {
        return this.holder.getDmg() + 3;
    }
}
