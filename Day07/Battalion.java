import java.util.List;
import java.util.ArrayList;

public class Battalion {
    private List<Character> characters;
    

    public Battalion() {
        this.characters = new ArrayList<>();
        
    }

    public void add(List<? extends Character> newCharacters) {
        for (Character character : newCharacters) {
            this.characters.add(character);
        }
    }

    public void display() {
        for (Character character : characters) {
            System.out.println(character.getName());
        }
    }

    public boolean fight() {
        if (characters.size() < 2) {
            return false;
        }

        Character characterF = characters.get(0);
        Character characterS = characters.get(1);

        int result = characterF.compareTo(characterS);

        if (result < 0) {
            characters.remove(characterF);
        }
        else if (result > 0){
            characters.remove(characterS);
        }
        else {
            characters.remove(characterF);
            characters.remove(characterS);
        }
        return true;
    }



public static void main (String args[]) {
    List<Mage> mages = new ArrayList < > ();
    mages.add(new Mage("Merlin"));
    mages.add(new Mage("Mandrake"));
    List<Warrior> warriors = new ArrayList < > ();
    warriors.add(new Warrior("Spartacus"));
    warriors.add(new Warrior("Clovis"));
    Battalion battalion = new Battalion();
    battalion.add(mages);
    battalion.add(warriors);
    battalion.display();

}
}
