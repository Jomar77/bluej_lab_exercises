/*Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains names and four test scores in the format
Surname,Firstname, score1, score2, score3, score4
You are to output results in the format Firstname Surname TotalScore
Do not output a result for the line containing the #
 */
import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String[] words = new String[0];
        int j = 0;
        int a = 0;
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#") {
            words = line.split(",");
            for (j = 2; j < 6; j++) {
                a = a + Integer.parseInt(words[j]);
            }
            System.out.printf("%s %s %d", words[1], words[0], a);
            a = 0;
            line = input.nextLine();
        }
    }
}