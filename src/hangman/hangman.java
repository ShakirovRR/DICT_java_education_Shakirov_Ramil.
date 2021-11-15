package hangman;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        String[] words = new String[]{"java","kotlin","python","javascript"};
        String[] secretWords = new String[]{"ja--","ko----","py----","ja--------"};
        Random rand = new Random();
        int indexWord = rand.nextInt(4);
        String word = words[indexWord];
        System.out.println("HANGMAN\nGuess the word " + secretWords[indexWord] + ":");
        Scanner input = new Scanner(System.in);
        if(Objects.equals(input.next(), word)){
            System.out.println("You survived!");
        }
        else{
            System.out.println("You lose!");
        }
    }
}
