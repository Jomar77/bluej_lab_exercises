/* Read, from standard input a series of integers, one per line, ending in a sentinel value
of -1;
Each integer represents a test score (in the range 0 to 100).
For each score output a line with FAIL for a score less than 50 or PASS for a score
greater or equal to 50
Do not process the sentinel value.
(Hint Use while – sentinel controlled loop) */

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        System.out.println("Enter a score: ");
        score = input.nextInt();
        while (score != -1) {
            if (score < 50) {
                System.out.println("FAIL");
            } else {
                System.out.println("PASS");
            }
            System.out.println("Enter a score: ");
            score = input.nextInt();
        }
    }
}