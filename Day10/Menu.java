public abstract class Menu<DR extends Food, ME extends Food> {
    private DR drink;
    private ME meal;
    
    public Menu(DR drink, ME meal) {
        this.drink = drink;
        this.meal = meal;
    }

    public DR getDrink() {
        return drink;
    }

    public ME getMeal() {
        return meal;
    }

    public float getPrice() {
        return (drink.getPrice() + meal.getPrice()) * 0.9f;
    }
}
