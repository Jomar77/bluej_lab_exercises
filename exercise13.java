/*
 Write a program that reads in a series of lines terminated by a line
containing only a single '#'
For each line output the line backwards
Do not output a result for the line containing the #
(Hint Use for – counter controlled loop)
*/

import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String reverse = "";
        int i = 0;
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#")) {
            for (i = line.length() - 1; i >= 0; i--) {
                reverse = reverse + line.charAt(i);
            }
            System.out.println(reverse);
            reverse = "";
            line = input.nextLine();
        }
    }
}