import java.util.Scanner;
import java.util.Arrays;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        int temp = 0;
        String tempName = "";
        String line = input.nextLine();

        while (!line.equals("#")) {
            String[] parts = line.split(" ");
            parts.sort()
            for (int i = 0; i < sortedScores.length; i++) {
                System.out.print(sortedNames[i] + " " + sortedScores[i]);
                if (i != sortedScores.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            line = input.nextLine();
        }