public class Lunch <DR extends Drink, ME extends Sandwich> extends Menu<DR, ME> {
    
    public Lunch(DR drink, ME meal) {
        super(drink, meal);
    }
}
