package tictactoe;

import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String field = input.next();
        System.out.println("---------\n" +
                "| " + field.charAt(0) + " " + field.charAt(1) + " " + field.charAt(2) + " |\n" +
                "| " + field.charAt(3) + " " + field.charAt(4) + " " + field.charAt(5) + " |\n" +
                "| " + field.charAt(6) + " " + field.charAt(7) + " " + field.charAt(8) + " |\n" +
                "---------");
    }
}
