
public class Astronaut {
    private String name;
    private int snacks;
    private String destination;
    private static int putId;
    private int id;

    public int putId() {
        return id;
    }

    public Astronaut(String name) {
        this.name = name;
        this.snacks = 0;
        this.destination = null;
        this.id = putId;
        putId++;
        System.out.println(name + " ready for launch!");
    }

    public String getName() {
        return name;
    }

    public int getSnacks() {
        return snacks;
    }

    public String getDestination() {
        return destination;
    }

    public int getId() {
        return id;
    }

    public void doActions(Object parameter) {
        if (parameter == null) {
            System.out.println(name + ": " + "Nothing to do.");
        }
        else if (parameter instanceof planet.Mars){
            System.out.println(name + ":Started a mission!");
            destination = getDestination();
        }
        else if (parameter instanceof chocolate.Mars) {
            chocolate.Mars mars = (chocolate.Mars) parameter;
            System.out.println(name + ":Thanks for this mars number " + mars.getId() + ".");
            snacks++;
        }
    
        if (destination == null) {
            System.out.println(name + ": I may have done nothing, but I have " + snacks + " Mars to eat at least!");
        }
    }


    public static void main(String[] args) {
    chocolate.Mars mars = new chocolate.Mars();
        Astronaut astronaut = new Astronaut("gege");
        astronaut.doActions(mars);
        astronaut.doActions(mars);
        }
    }
