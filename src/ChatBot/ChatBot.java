package ChatBot;

import java.util.Scanner;

public class ChatBot<nums> {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Alex.\n" +
                "I was created in 2021.\n" +
                "Please, remind me your name.");
        Scanner input = new Scanner(System.in);
        System.out.println("What a great name you have, " + input.next() + "!\n" +
                "Let me guess your age.\n" + "Enter remainders of dividing your age by 3, 5 and 7.");
        int age = (input.nextInt() * 70 + input.nextInt() * 21 + input.nextInt() * 15) % 105;
        System.out.println("Your age is " + age + "; a good time to start programming!\n" + "Enter a number");
        int num = input.nextInt();
        for (int i = 0;i < num+1;i++){
            System.out.println(i + " !");
        }
        System.out.println("Test\n" +
                "Say my name:\n1)Alex\n2)Kirill\n3)Ramil\n4)Maks");
        int nums = input.nextInt();
        while (true) {
            if (nums == 1) {
                System.out.println("Good!");
                break;
            } else {
                System.out.println("Bad!");
            }
        }
    }
}
