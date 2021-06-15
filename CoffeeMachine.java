package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner read = new Scanner(System.in);
    static InitialQuantity machine = new InitialQuantity();
    static CoffeeType espresso = new Espresso();
    static CoffeeType latte = new Latte();
    static CoffeeType cappuccino = new Cappuccino();

    public static void main(String[] args) {
	// write your code here

        writeAction();

    }
    public static void writeAction() {
        while (true) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = read.nextLine();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printContents();
                    break;
                case "exit":
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }
    public static void printContents() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(machine.availableWater + " ml of water");
        System.out.println(machine.availableMilk + " ml of milk");
        System.out.println(machine.availableCoffeeBeans + " g of coffee beans");
        System.out.println(machine.disposableCups + " disposable cups");
        System.out.println("$" + machine.availableMoney + " of money");
    }
    public static void buy() {

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = read.nextLine();

            switch (choice) {
                case "1":
                    if (espresso.checkAvailability(machine)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineUpdate(espresso);
                    } else {
                        isEnoughResources(espresso);
                    }
                    break;
                case "2":
                    if (latte.checkAvailability(machine)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineUpdate(latte);
                    } else {
                        isEnoughResources(latte);
                    }
                    break;
                case "3":
                    if (cappuccino.checkAvailability(machine)) {
                        System.out.println("I have enough resources, making you a coffee!");
                        machineUpdate(cappuccino);
                    } else {
                        isEnoughResources(cappuccino);
                    }
                    break;
                case "back":
                    break;
                default:
                    System.out.println("Wrong Choice");
        }
    }
    public static void fill() {

        System.out.println("\nWrite how many ml of water you want to add:");
        int waterQuantity = read.nextInt();
        machine.availableWater += waterQuantity;
        System.out.println("Write how many ml of milk you want to add:");
        int milkQuantity = read.nextInt();
        machine.availableMilk += milkQuantity;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeBeansQuantity = read.nextInt();
        machine.availableCoffeeBeans += coffeeBeansQuantity;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int noOfCups = read.nextInt();
        machine.disposableCups += noOfCups;

        read.nextLine();
    }
    public static void take() {
        System.out.println("I gave you $" + machine.availableMoney);
        machine.availableMoney = 0;
    }

    public static void machineUpdate(CoffeeType type) {

        machine.availableWater -= type.getWater();
        machine.availableMilk -= type.getMilk();
        machine.availableCoffeeBeans -= type.getCoffeeBeans();
        machine.disposableCups--;
        machine.availableMoney += type.getPrice();
    }
    private static void isEnoughResources (CoffeeType type) {

        if (machine.availableWater < type.getWater()) {
            System.out.println("Sorry, not enough water!");
        } if (machine.availableMilk < type.getMilk()) {
            System.out.println("Sorry, not enough milk!");
        } if (machine.availableCoffeeBeans < type.getCoffeeBeans()) {
            System.out.println("Sorry, not enough coffee bean!");
        } if (machine.disposableCups == 0) {
            System.out.println("Sorry, not enough cups!");
        }
    }
}
