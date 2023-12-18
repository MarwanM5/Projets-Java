public class PlasmaRifle extends Weapon {
    private String name;
    private int apcost;
    private int damage;
    private String output;
    private boolean melee;



    public PlasmaRifle() {
        super("Plasma Rifle", 21, 5, false);
    }

    public void attack() {
        System.out.println("PIOU");
    }
}
