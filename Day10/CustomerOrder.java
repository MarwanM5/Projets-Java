import java.util.ArrayList;
import java.util.List;

public class CustomerOrder {
    private List<Food> order;
    private List<Menu<? extends Food, ? extends Food>> menus;
    private Stock stock;

    public CustomerOrder(Stock stock) {
        this.order = new ArrayList<>();
        this.menus = new ArrayList<>();
        this.stock = stock;
    }

    public boolean addItem(Food food) throws NoSuchFoodException {
        if (stock.remove(food.getClass())) {
            order.add(food);
            return true;
        }
        return false;
    }

    public boolean removeItem(Food food) throws NoSuchFoodException {
        if (order.remove(food)) {
            stock.add(food.getClass());
            return true;
        }
        return false;
    }

    public float getPrice() {
        float total = 0;
        for (Food food : order) {
            total += food.getPrice();
        }
        for (Menu <? extends Food, ? extends Food> menu : menus) {
            total += menu.getPrice();
        }
        return total;
    }

    public boolean addMenu(Menu <? extends Food, ? extends Food> menu) throws NoSuchFoodException {
        if (stock.getNumberOf(menu.getDrink().getClass()) <= 0 || stock.getNumberOf(menu.getMeal().getClass()) <= 0) {
            return false;
        }
        if (stock.remove(menu.getDrink().getClass()) && stock.remove(menu.getMeal().getClass())) {
            menus.add(menu);
            stock.remove(menu.getDrink().getClass());
            stock.remove(menu.getMeal().getClass());

            return true;
        }
        return false;
    }

    public boolean removeMenu(Menu <? extends Food, ? extends Food> menu) throws NoSuchFoodException {
        if (menus.contains(menu)) {
            stock.add(menu.getDrink().getClass());
            stock.add(menu.getMeal().getClass());
            return menus.remove(menu);
        }
        return false;
    }

    public void printOrder() {
        System.out.println("Your order is composed of:");
        for (Menu<? extends Food, ? extends Food> menu : menus) {
            System.out.println("- " + menu.getClass().getName() + " menu (" + menu.getPrice() + " euros)");
            System.out.println("-> drink: " + menu.getDrink().getClass().getName());
            System.out.println("-> meal: " + menu.getMeal().getClass().getName());
        }
        for (Food food : order) {
            System.out.println("- " + food.getClass().getName() + " (" + food.getPrice() + " euros)");
        }
        System.out.println("For a total of " + getPrice() + " euros.");
    }
}
