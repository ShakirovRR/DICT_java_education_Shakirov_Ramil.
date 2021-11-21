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
        win_situation(field);
    }

    public static void win_situation(String field) {
        if (count(field)){
            System.out.println("Impossible");
            System.exit(0);
        }
        int[][] win = new int[][]{{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6}};
            for(int i =0;i<win.length;i++){
                if (field.charAt(win[i][0])==field.charAt(win[i][1]) && field.charAt(win[i][0])==field.charAt(win[i][2])){
                    System.out.println(field.charAt(win[i][0]) + "wins");
                    System.exit(0);
                }
            }
        if (field.contains("_")){
            System.out.println("Game not finished");
        }
        else {
            System.out.println("Draw");
        }

    }

    public static boolean count(String field) {
        int o = 0;
        int x = 0;
        for(int i = 0; i < 9;i++ ){
            if(field.charAt(i)=="X".charAt(0)){
                x+=1;
            }
            else if (field.charAt(i)=="O".charAt(0)){
                o+=1;
            }
        }
        return Math.abs(x - o) > 1;
    }
}
