package machine;

public class Cappuccino extends CoffeeType {

    int water = 200;
    int milk = 100;
    int coffeeBeans = 12;
    int price = 6;

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
