package machine;

public class Output extends CoffeeMachine {
    public static void OutPut1() {
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(amountOfBeans + " g of beans");
        System.out.println(amountOfCups + " disposable cups");
        System.out.println("$" + amountOfMoney + " of money");
    }

    public static void Output2() {
        System.out.println("Write how many ml of water you want to add:");
        amountOfWater += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        amountOfMilk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        amountOfBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        amountOfCups += scanner.nextInt();
    }

    public static void Output3() {
        System.out.println("I gave you $" + amountOfMoney);
        amountOfMoney = 0;
    }
}
