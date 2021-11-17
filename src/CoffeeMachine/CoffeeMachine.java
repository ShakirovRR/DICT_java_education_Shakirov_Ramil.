package CoffeeMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        ArrayList<Integer> makeCoffee = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water = input.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk = input.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans = input.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cups = input.nextInt();
        makeCoffee.add(water/200);
        makeCoffee.add(milk/50);
        makeCoffee.add(beans/200);
        if(cups*200<=water && cups*50<=milk && cups*15<=beans){
            System.out.println("Yes, I can make that amount of coffee " + how_many(makeCoffee,cups));
        }
        else {
            System.out.println("No, I can make only " + Collections.min(makeCoffee) + " cups of coffee");
        }
    }
    public static String how_many(ArrayList<Integer> makeCoffee, int cups){
        if (Collections.min(makeCoffee)-cups>0){
            return ("(and even " + (Collections.min(makeCoffee)-cups) + " more than that)");
        }
        return "";
    }
}
