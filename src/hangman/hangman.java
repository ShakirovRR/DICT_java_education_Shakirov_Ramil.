package hangman;

import java.util.Objects;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        System.out.println("HANGMAN\nGuess the word:");
        Scanner input = new Scanner(System.in);
        if(Objects.equals(input.next(), "python")){
            System.out.println("You win!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
