package machine;

public class Latte extends CoffeeType {

    int water = 350;
    int milk = 75;
    int coffeeBeans = 20;
    int price = 7;

    @Override
    public boolean checkAvailability(InitialQuantity quantity) {
        return quantity.availableWater >= water && quantity.availableMilk >= milk
                && quantity.availableCoffeeBeans >= coffeeBeans;
    }

    @Override
    public int getWater() {
        return water;
    }

    @Override
    public int getMilk() {
        return milk;
    }

    @Override
    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
