public class Canary extends Animal {
    private int eggs;

    public Canary(String name) {
        super(name, 2, Type.BIRD);
        this.eggs = 0;
        System.out.println("Yellow and smart? Here I am!");
    }

    public int getEggsCount() {
        return eggs;
    }

    public void layEgg() {
        eggs += 1;
    }

    public static void main(String[] args) {
        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy");

        willy.status();
        willy.smellBlood(true);
        willy.status();

        titi.layEgg();
        System.out.println(titi.getEggsCount());
    }
}
