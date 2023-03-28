/*
 * Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains a series of integers
Output the sum of the integers on each line of input
Do not output a result for the line containing the #
(Hint Use hasNextInt)

 */
import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNextInt()) {
                sum = sum + lineScanner.nextInt();
            }
            System.out.println(sum);
            sum = 0;
            line = input.nextLine();
        }
    }
}