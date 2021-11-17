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

    public int getHEALTH() {
        return HEALTH;
    }

    public void printSecretWord(){
        int num = 0;
        for (String s : word) {
            if (lettersInWord.contains(s)) {
                System.out.print(s);
            } else {
                System.out.print("-");
                num+=1;
            }

        }
        System.out.println();
        if(num==0){
            System.out.println("Thanks for playing!\n" +
                    "We'll see how well you did in the next stage");
            System.exit(0);
        }
    }
    public void addLetter(String letter){
        if(word.contains(letter)){
            if (lettersInWord.contains(letter)){
                System.out.println("No improvents");
                this.HEALTH-=1;
            }
            else{
                lettersInWord.add(letter);
            }

        }
        else {
            System.out.println("That letter doesn't appear in the word");
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
            if(player.getHEALTH()==0){
                System.out.println("You lost!");
                break;
            }
            player.addLetter(letter);


        }
    }
}
