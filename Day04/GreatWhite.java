public class GreatWhite extends Shark {
    
        public GreatWhite(String name) {
            super(name);
        }
    
        @Override
        public Boolean canEat(Animal animal) {
            boolean shouldEat = !(animal instanceof Canary);
            if (shouldEat) {
                System.out.println(getName() + ": Next time you try to give me that to eat, I'll eat you instead.");
            }
            return shouldEat;
        }
    
        @Override
        public void eat(Animal animal) {
            if (animal instanceof Shark) {
                System.out.println(getName() + " The best meal one could wish for.");
            }
        }
    }


