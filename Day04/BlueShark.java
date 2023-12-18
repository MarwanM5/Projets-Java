public class BlueShark extends Shark {
    
    public BlueShark (String name) {
        super(name);
    }
    
    @Override
    public Boolean canEat(Animal animal) {
        if (animal.getType() == Animal.Type.FISH.name().toLowerCase()) {
            return true;
        }

        else {
            return false;
        }
    }
}
