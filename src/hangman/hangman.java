package hangman;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String[] words = new String[]{"java","kotlin","python","javascript"};
        Random rand = new Random();
        String word = words[rand.nextInt(4)];
        System.out.println("HANGMAN\nGuess the word:");
        Scanner input = new Scanner(System.in);
        if(Objects.equals(input.next(), word)){
            System.out.println("You survived!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
