package ChatBot;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        System.out.println("Hello! My name is Alex.\n" +
                "I was created in 2021.\n" +
                "Please, remind me your name.");
        Scanner input = new Scanner(System.in);
        System.out.println("What a great name you have, " + input.next() + "!");
    }
}
