package chocolate;

public class Mars {
    private int id;
    private static int nextId = 0;

    public Mars() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }
}