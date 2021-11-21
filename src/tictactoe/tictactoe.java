package tictactoe;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Map<String,Integer> coordinate = new HashMap<>(){};
        coordinate.put("1 1",0);coordinate.put("1 2", 1);coordinate.put("1 3", 2);coordinate.put("2 1", 3);coordinate.put("2 2", 4);coordinate.put("2 3", 5);coordinate.put("3 1", 6);coordinate.put("3 2", 7);coordinate.put("3 3", 8);
        Scanner input = new Scanner(System.in);
        String[] field = new String[]{"","","","","","","","",""};
        while (true) {
            String coord = input.nextLine();
            if (!examination(coord)){
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (!Objects.equals(field[coordinate.get(coord)], "")){
                System.out.println("This cell is occupied! Choose another one!");
            }
            if (ex(field)%2==1){
                field[coordinate.get(coord)]="X";
            }
            else {
                field[coordinate.get(coord)]="O";
            }
            System.out.println("---------\n" +
                    "| " + field[0] + " " + field[1] + " " + field[2] + " |\n" +
                    "| " + field[3] + " " + field[4] + " " + field[5] + " |\n" +
                    "| " + field[6] + " " + field[7] + " " + field[8] + " |\n" +
                    "---------");
            win_situation(field);
        }
    }

    public static void win_situation(String[] field) {
        if (count(field)){
            System.out.println("Impossible");
            System.exit(0);
        }
        int[][] win = new int[][]{{0,1,2},{3,4,5},{6,7,8},{0,4,8},{2,4,6}};
            for(int i =0;i<win.length;i++){
                if (field[win[i][0]]==field[win[i][1]] && field[win[i][0]]==field[win[i][2]] && field[win[i][0]]!=""){
                    System.out.println(field[win[i][0]] + "wins");
                    System.exit(0);
                }
            }
        if (field.equals("")){
            System.out.println("Game not finished");
        }
        else {
            System.out.println("Draw");
        }

    }

    public static boolean count(String[] field) {
        int o = 0;
        int x = 0;
        for(int i = 0; i < 9;i++ ){
            if(field[i]=="X"){
                x+=1;
            }
            else if (field[i]=="O"){
                o+=1;
            }
        }
        return Math.abs(x - o) > 1;
    }

    public static boolean examination(String coord){
        String simbols = "123";
        String[] test = coord.split(" ");
        for (int i = 0;i<2;i++){
            if(!simbols.contains(test[i])){
                return false;
            }
        }
        return true;
    }

    public static int ex(String[] field){
        int num = 0;
        for(int i = 0;i<field.length;i++){
            if (field[i]==""){
                num+=1;
            }
        }
        return num;
    }
}
