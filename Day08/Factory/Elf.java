package Factory;

import java.util.List;
import java.util.ArrayList;

public class Elf {
    private Toy toy;
    private List<GiftPaper> papers = new ArrayList<>();
    private Factory factory;

    public Elf(Factory factory) {
        this.factory = factory;
    }

    public boolean pickToy(String toy) {
        try {
        if (this.toy == null) {
            this.toy = factory.create(toy);
            System.out.println("What a nice one! I would have liked to keep it...");
            return true;
        }
        else {
            System.out.println("Minute please?! I'm not that fast.");
            return false;
        }
        }
        catch (NoSuchToyException error) {
            System.out.println("I didn't find any " + toy + ".");
            return false;
        }
    }

    public boolean pickPapers(int n) {
        this.papers = factory.getPapers(n);
        return true;
    }

    public GiftPaper pack() {
        if (papers.isEmpty()) {
            System.out.println("Wait... I can't pack it with my shirt.");
            return null;
        }
        GiftPaper paper = papers.remove(0);
        if (toy == null) {
            System.out.println("I don't have any toy, but hey at least it's paper!");
        }
        else {
            paper.wrap(toy);
            System.out.println("And another kid will be happy!");
        }
        return paper;
        
    }
}
