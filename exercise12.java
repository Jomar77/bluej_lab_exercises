/*
Write a program that reads in a series of lines terminated by a line
containing only a single '#'. By counting the spaces, output the number of words on each line
Do not output a result for the line containing the #
(Hint Use for – counter controlled loop)
 */

import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int i = 0;
        int count = 1;
        line = input.nextLine();
        while (!line.equals("#")) {
            if (line.isEmpty()) {
                count = 0;
            }else if(!line.isEmpty())
            for (i = 0; i < line.length(); i++) {
                if (line.charAt(i) ==  ' '){
                    count++;
                }
            }
            System.out.println(count);
            count = 1;
            line = input.nextLine();
        }
    }
}