public class Gecko {
    private String name;
    private int age;
    private int energy = 100;

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

    public void eat(String food) {
        String geckoReaction;
        food = food.toLowerCase();
        
        switch (food) {
            case "meat":
            geckoReaction = "Yummy!";
            
                break;

            case "vegetable":
            geckoReaction = "Erk!";
                
                break;
        
            default:
            geckoReaction = "I can't eat this!";
                break;
        }
        System.out.println(geckoReaction);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int newEnergy) {
        energy = newEnergy;
            if (energy > 100 ) {
                energy = 100;
            }
            else if (energy < 0) {
                energy = 0;
            }
    }

    public static void main(String[] args) {
        Gecko mimi = new Gecko("mimi");
        mimi.eat("Meat");
    }
}
