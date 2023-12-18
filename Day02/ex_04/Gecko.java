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

    public static void main(String[] args) {
        Gecko arthur = new Gecko();
        Gecko benjy = new Gecko();
        arthur.setAge(7);
        arthur.status();
    }
}
