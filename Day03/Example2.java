public class Example2 {

    public void Mars() {
        
    }
    public static void main(String[] args) {
        planet.Mars titi = new planet.Mars("Here and there");
        planet.Mars toto = new planet.Mars("Up");
        planet.moon.Phobos phobos 1 = new planet.moon.Phobos(titi, "Alpha 3");
        planet.moon.Phobos phobos 2 = new planet.moon.Phobos(toto, "Beta 1");
        System.out.println(phobos1.getLandingSite());

    }
}
