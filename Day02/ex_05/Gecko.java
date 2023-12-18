public class Gecko {
    private String name;
    private int age;

    public Gecko() {
        name = "Unknown";
        System.out.println("Hello!");
    }

    public void status() {
        String geckoStatus;

        switch(age) {
            case 0 :
            geckoStatus = "Unborn Gecko";
            break;

            case 1,2 :
            geckoStatus = "Baby Gecko";
            break;

            case 3, 4, 5, 6, 7, 8, 9, 10 :
            geckoStatus = "Adult Gecko";
            break;

            case 11, 12, 13 :
            geckoStatus = "Old Gecko";
            break;

            default :
            geckoStatus = "Impossible Gecko";
            break;
        }
        System.out.println(geckoStatus);
    }

     public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void hello(String hello) {
        System.out.println("Hello " + hello + ", I'm " + name + "!");
    }

    public void hello(int nbr) {
        for (int i = 0; i < nbr; i++) {
            System.out.println("Hello, I'm " + name + "!");
        }
        
    }

    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        mimi.hello("Titi");
        mimi.hello(7);
    }
}
