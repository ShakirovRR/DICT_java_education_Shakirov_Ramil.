package CoffeeMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int water = 400; int milk = 540; int beans = 120; int cups = 9; int money = 550;
        while(true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = input.next();
            if (Objects.equals(action, "take")) {
                System.out.println("I gave you " + money);
                money = 0;
            } else if (Objects.equals(action, "fill")) {
                System.out.println("Write how many ml of water you want to add:");
                water += input.nextInt();
                System.out.println("Write how many ml of milk you want to add:");
                milk += input.nextInt();
                System.out.println("Write how many grams of coffee beans you want to add:");
                beans += input.nextInt();
                System.out.println("Write how many disposable coffee cups you want to add:");
                cups += input.nextInt();
            } else if (Objects.equals(action, "buy")) {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String coffee = input.next();
                if (Objects.equals(coffee, "1")) {
                    String situation = exeption(water, milk, beans, cups, 250, 0, 16);
                    if (situation.length() == 0) {
                        water -= 250;
                        cups -= 1;
                        beans -= 16;
                        money += 4;
                    } else {
                        System.out.println("Sorry, not enough " + situation + "!");
                    }

                } else if (Objects.equals(coffee, "2")) {
                    String situation = exeption(water, milk, beans, cups, 350, 75, 20);
                    if (situation.length() == 0) {
                        water -= 350;
                        milk -= 75;
                        beans -= 20;
                        money += 7;
                        cups -= 1;
                    } else {
                        System.out.println("Sorry, not enough " + situation + "!");
                    }

                } else if (Objects.equals(coffee, "3")) {
                    String situation = exeption(water, milk, beans, cups, 200, 100, 12);
                    if (situation.length() == 0) {
                        water -= 200;
                        milk -= 100;
                        cups -= 1;
                        beans -= 12;
                        money += 6;
                    } else {
                        System.out.println("Sorry, not enough " + situation + "!");
                    }
                    water += 200;
                    milk -= 100;
                    beans -= 12;
                    cups -= 1;
                    money += 6;
                }
            } else if (Objects.equals(action, "remaining")) {
                cIng(water, milk, beans, cups, money);
            } else if (Objects.equals(action, "exit")) {
                System.exit(0);
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

    public static String exeption(int water,int milk, int beans, int cups,int cwater,int cmilk, int cbeans) {
        ArrayList<String> null_ingrifient = new ArrayList<>();
        if(water-cwater<0){
            null_ingrifient.add("water");
        }
        else if (milk-cmilk<0){
            null_ingrifient.add("milk");
        }
        else if (beans-cbeans<0){
            null_ingrifient.add("beans");
        }
        else if (cups==0){
            null_ingrifient.add("cups");
        }
        else {return "";}
        return null_ingrifient.get(0);
    }

}
