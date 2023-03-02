/*
 * Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains a series of integers and words
Ignore the words and only output the sum of the integers on each line of
input
Do not output a result for the line containing the #
(Hint Use hasNextInt)
    */

import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter a line of text terminated by a #");
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    sum = sum + lineScanner.nextInt();
                }   else {
                    lineScanner.next();
                }
            }
            System.out.println("Sum: " + sum);
            sum = 0;
            System.out.println("Enter a line of text terminated by a #");
            line = input.nextLine();
        }
    }
}