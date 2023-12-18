package planet.moon;

public class Phobos {
    private planet.Mars mars;
    private String landingSite;

    public planet.Mars getMars() {
        return mars;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public Phobos(planet.Mars mars, String landingSite) {
        this.mars = mars;
        this.landingSite = landingSite;
        System.out.println("Phobos placed in orbit.");
    }

    public Phobos(String landingSite) {
        this.landingSite = landingSite;
        System.out.println("No planet given.");
    }
}
