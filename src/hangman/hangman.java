package hangman;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

class Hangman{
    private final ArrayList<String> words = new ArrayList<String>();
    private ArrayList<String> lettersInWord = new ArrayList<String>();
    private ArrayList<String> word;

    private int HEALTH = 8;


    public void createRandomWord(){
        Random rand = new Random();
        String[] words = new String[]{"java","kotlin","python","javascript"};
        String randWord = words[rand.nextInt(4)];
        word = new ArrayList<String>();
        for (int i = 0;i<randWord.length();i++){
            word.add(Character.toString(randWord.charAt(i)));
        }
        lettersInWord = new ArrayList<String>();
    }
    public void printSecretWord(){
        for (String s : word) {
            if (lettersInWord.contains(s)) {
                System.out.print(s);
            } else {
                System.out.print("-");
            }

        }
        System.out.println();
    }
    public void addLetter(String letter){
        if(word.contains(letter)){
            lettersInWord.add(letter);
        }
        else {
            this.HEALTH-=1;
        }
    }



}

public class hangman {
    public static void main(String[] args) {
        Hangman player = new Hangman();
        Scanner input = new Scanner(System.in);
        System.out.println("HANGMAN:");
        player.createRandomWord();
        while (true) {
            player.printSecretWord();
            String letter = input.next();
            player.addLetter(letter);


        }
    }
}
