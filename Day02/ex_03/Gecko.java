public class Gecko {
    private String name;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Gecko arthur = new Gecko("Arthur");
        Gecko benjy = new Gecko();
        System.out.println(arthur.getName());
        System.out.println(benjy.getName());
    }
}
