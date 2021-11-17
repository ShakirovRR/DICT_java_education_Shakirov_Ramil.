package CoffeeMachine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        int count_of_cups = input.nextInt();
        System.out.println("For " + count_of_cups + " cups of coffee you will need:\n" +
                200*count_of_cups + " ml of water\n" +
                50*count_of_cups + " ml of milk\n" +
                15*count_of_cups + " g of coffee beans");
    }
}
