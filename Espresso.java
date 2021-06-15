package machine;

public class Espresso extends CoffeeType {

    int water = 250;
    int milk = 0;
    int coffeeBeans = 16;
    int price = 4;

    @Override
    public boolean checkAvailability(InitialQuantity quantity) {
        return quantity.availableWater >= water && quantity.availableCoffeeBeans >= coffeeBeans;
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
