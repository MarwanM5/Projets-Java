import java.util.ArrayList;
import java.util.List;

public abstract class Sandwich implements Food {
    protected boolean vegetarian = false;
    protected List<String> ingredients = new ArrayList<String>();
    protected float price;
    protected int calories;

    public Sandwich(float price, int calories) {
        this.price = price;
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public int getCalories() {
        return this.calories;
    }
}
