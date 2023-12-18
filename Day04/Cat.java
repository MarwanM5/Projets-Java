public class Cat extends Animal {
    private String color;

    public Cat(String name) {
        this(name, "grey");
    }

    public Cat(String name, String color) {
        super(name, 4, Type.MAMMAL);
        this.color = color;
        System.out.println(getName() + ": MEEEOOWWWW");
    }

    public String getColor() {
        return color;
    }

    public void meow() {
        System.out.println(getName() + " the " + getColor() + " kitty is meowing.");
    }

    public static void main(String[] args) {
        Cat isidore = new Cat("Isidore", "orange");

        System.out.println(isidore.getName() + " has " + isidore.getLegs() + " legs ans is a " + isidore.getType() + ".");
        isidore.meow();
    }
}
