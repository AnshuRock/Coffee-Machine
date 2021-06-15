package machine;

public abstract class CoffeeType {

    public int water;
    public int milk;
    public int coffeeBeans;
    public int price;

    public abstract boolean checkAvailability(InitialQuantity quantity);

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public int getPrice() {
        return price;
    }
}
