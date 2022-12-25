package machine;

public class Properties extends Output {
    public static void choose(String action) {
        switch (action) {
            case "buy" -> {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                String whichCoffee = scanner.nextLine();
                if (whichCoffee.equals("1")) {
                    espresso();
                    return;
                } else if (whichCoffee.equals("2")) {
                    latte();
                    return;
                } else if (whichCoffee.equals("3")) {
                    cappuccino();
                    return;
                } else if (whichCoffee.equals("back")) {
                    return;
                }
                System.out.println("I have enough resources, making you a coffee!");
            }
            case "fill" -> Output2();
            case "take" -> Output3();
            case "remaining" -> OutPut1();

        }
    }

    public static void espresso() {
        if (amountOfWater - 250 < 0) {
            System.out.println("Sorry, not enough water!");
        } else {
            amountOfWater -= 250;
        }
        if (amountOfBeans - 16 < 0) {
            System.out.println("Sorry, not enough beans!");
        } else {
            amountOfBeans -= 16;
        }
        if (amountOfCups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
        } else {
            amountOfCups -= 1;
        }
        amountOfMoney += 4;
    }

    public static void latte() {
        if (amountOfWater - 350 < 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else {
            amountOfWater -= 350;
        }
        if (amountOfMilk - 75 < 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else {
            amountOfMilk -= 75;
        }
        if (amountOfBeans - 20 < 0) {
            System.out.println("Sorry, not enough beans!");
            return;
        } else {
            amountOfBeans -= 20;
        }
        if (amountOfCups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
            return;
        } else {
            amountOfCups -= 1;
        }
        amountOfMoney += 7;
    }

    public static void cappuccino() {
        if (amountOfWater - 200 < 0) {
            System.out.println("Sorry, not enough water!");
            return;
        } else {
            amountOfWater -= 200;
        }
        if (amountOfMilk - 100 < 0) {
            System.out.println("Sorry, not enough milk!");
            return;
        } else {
            amountOfMilk -= 100;
        }
        if (amountOfBeans - 12 < 0) {
            System.out.println("Sorry, not enough beans!");
            return;
        } else {
            amountOfBeans -= 12;
        }
        if (amountOfCups - 1 < 0) {
            System.out.println("Sorry, not enough cups!");
            return;
        } else {
            amountOfCups -= 1;
        }
        amountOfMoney += 6;
    }
}
