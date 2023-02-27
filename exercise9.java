/* 
Read, from standard input a series of integers, one per line, ending in a sentinel value
of 999. The numbers will be in the range 0 to 100.
Output on a line Sum: followed by the sum of the series of integers as shown below.
Output on a new line Average: followed by the mean average of the series of
numbers formatted to a precision of 2 decimal places as shown below.
*/

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        int sum = 0;
        int count = 0;
        System.out.println("Enter a score: ");
        score = input.nextInt();
        while (score != 999) {
            sum += score;
            count++;
            System.out.println("Enter a score: ");
            score = input.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + String.format("%.2f", (double) sum / count));
    }
}