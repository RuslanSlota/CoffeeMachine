package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public final static Scanner scanner = new Scanner(System.in);
    public static int amountOfWater = 400;
    public static int amountOfMilk = 540;
    public static int amountOfBeans = 120;
    public static int amountOfCups = 9;
    public static int amountOfMoney = 550;
    public static boolean running = true;
    public static void main(String[] args) {
        while (running) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            if (action.equals("exit")) {
                running = false;
            } else {
                Properties.choose(action);
            }
        }
    }


}
