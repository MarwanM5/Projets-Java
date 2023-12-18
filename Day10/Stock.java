import java.util.Map;
import java.util.HashMap;

public class Stock {
    private Map<Class<? extends Food>, Integer> stock;

    public Stock() {
        stock = new HashMap<>();
        stock.put(FrenchBaguette.class, 100);
        stock.put(SoftBread.class, 100);
        stock.put(AppleSmoothie.class, 100);
        stock.put(Coke.class, 100);
        stock.put(HamSandwich.class, 100);
        stock.put(Panini.class, 100);
        stock.put(Cookie.class, 100);
        stock.put(CheeseCake.class, 100);
    }

    public int getNumberOf(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!stock.containsKey(foodClass)) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getName());
        }
        return stock.getOrDefault(foodClass, 0);
    }

    public boolean add(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!stock.containsKey(foodClass)) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getName());
        }
        stock.put(foodClass, stock.get(foodClass) + 1);
        return true;
    }

    public boolean remove(Class<? extends Food> foodClass) throws NoSuchFoodException {
        if (!stock.containsKey(foodClass) || stock.get(foodClass) <= 0) {
            throw new NoSuchFoodException("No such food type: " + foodClass.getName());
        }
        stock.put(foodClass, stock.get(foodClass) - 1);
        return true;
    }
}

