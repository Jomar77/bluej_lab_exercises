/*
Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Output the number of times an asterix occurs on each line of input
Do not output a result for the line containing the #
(Hint Use for – counter controlled loop)
*/

import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        int count;
        System.out.println("Enter a line of text: ");
        line = input.nextLine();
        while (!line.equals("#")) {
            count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '*') {
                    count++;
                }
            }
            System.out.printf("The number of asterisks is: " + count);
            System.out.println("Enter a line of text: ");
            line = input.nextLine();
        }
    }
}