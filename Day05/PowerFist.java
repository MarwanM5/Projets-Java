public class PowerFist extends Weapon {
    private String name;
    private int apcost;
    private int damage;
    private String output;
    private boolean melee;


    public PowerFist() {
        super("Power Fist", 50, 8, true);
    }

    public void attack() {
        System.out.println("SBAM");
    }
}
