/*Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line represents games of Chess between two players
The line consists of a series of letters A signifying a win by player A and
B representing a win by player B.
For each line of input you are to output the total number of games won by
player A and player B as shown in the sample output
There could be any number of games.
If there are no games the total is 0
Do not output a result for the line containing the #*/

import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a series of lines terminated by a line containing only a single '#'");
        String line = input.nextLine();
        int winA = 0;
        int winB = 0;
        while (!line.equals("#")) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'A') {
                    winA++;
                } else if (line.charAt(i) == 'B') {
                    winB++;
                }
            }
            System.out.println("Player A:" + winA + "Player B:" + winB);
            winA = 0;
            winB = 0;
            System.out.println("Enter a series of lines terminated by a line containing only a single '#'");
            line = input.nextLine();
            winA = 0;
            winB = 0;
        }
    }
}
