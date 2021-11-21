package CoffeeMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int water = 400; int milk = 540; int beans = 120; int cups = 9; int money = 550;
        System.out.println("Write action (buy, fill, take):");
        String action = input.next();
        if (Objects.equals(action, "take")){
            System.out.println("I gave you " + money);
            money = 0;
        }
        else if (Objects.equals(action,"fill")){
            System.out.println("Write how many ml of water you want to add:");
            water+=input.nextInt();
            System.out.println("Write how many ml of milk you want to add:");
            milk += input.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add:");
            beans += input.nextInt();
            System.out.println("Write how many disposable coffee cups you want to add:");
            cups += input.nextInt();
        }
        else if (Objects.equals(action, "buy")){
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            String coffee = input.next();
            if (Objects.equals(coffee, "1")){
                water -= 250;
                cups -=1;
                beans -= 16;
                money += 4;
            }
            else if (Objects.equals(coffee, "2")){
                water -= 350;
                milk -= 75;
                beans -= 20;
                money += 7;
            }
            else if (Objects.equals(coffee, "3")){
                water += 200;
                milk -= 100;
                beans -= 12;
                money +=6;
            }
        }

    }

    public static void cIng(int water,int milk,int beans, int cups, int money){
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                 milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" +
                money + " of money");
    }
}
