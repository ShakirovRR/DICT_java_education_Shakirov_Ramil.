package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Alex.\n" +
                "I was created in 2021.\n" +
                "Please, remind me your name.");
        Scanner input = new Scanner(System.in);
        System.out.println("What a great name you have, " + input.next() + "!\n" +
                "Let me guess your age.\n" + "Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (input.nextInt() * 70 + input.nextInt() * 21 + input.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + "; a good time to start programming!");
    }
}
