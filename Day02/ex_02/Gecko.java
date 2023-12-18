public class Gecko {
    String name;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();
        System.out.println(arthur.name);
        System.out.println(benjy.name);
    }
}
