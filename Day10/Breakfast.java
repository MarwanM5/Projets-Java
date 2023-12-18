public class Breakfast<DR extends Drink, ME extends Bread> extends Menu<DR, ME>  {
    
    public Breakfast(DR drink, ME meal) {
        super(drink, meal);
    }
}
