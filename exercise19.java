/* 
Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains 2 single word names and the game score for each
name
Write out the names and scores in descending (high to low) order of score
Do not output a result for the line containing the #

sample input 1
Sam 10 Tom 90

Sample output 1
Tom 90 Sam 10

Sample input 2
Sue 70 Harry 10

Sample output 2
Sue 70 Harry 10

*/

import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String[] words = new String[0];
        String[] names = new String[0];
        int[] scores = new int[0];
        int[] sortedScores = new int[0];
        String[] sortedNames = new String[0];
        int score = 0;
        String name = "";
        int temp = 0;
        String tempName = "";

        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();

        while (!line.equals("#")) {
            words = line.split(" ");
            names = new String[words.length / 2];
            scores = new int[words.length / 2];
            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0) {
                    name = words[i];
                    names[i / 2] = name;
                } else {
                    score = Integer.parseInt(words[i]);
                    scores[i / 2] = score;
                }
            }

            sortedScores = scores;
            sortedNames = names;
            for (int i = 0; i < sortedScores.length - 1; i++) {
                for (int j = i + 1; j < sortedScores.length; j++) {
                    if (sortedScores[i] < sortedScores[j]) {
                        temp = sortedScores[i];
                        tempName = sortedNames[i];
                        sortedScores[i] = sortedScores[j];
                        sortedNames[i] = sortedNames[j];
                        sortedScores[j] = temp;
                        sortedNames[j] = tempName;
                    }
                }
            }

            for (int i = 0; i < sortedScores.length; i++) {
                System.out.print(sortedNames[i] + " " + sortedScores[i] + " ");
            }

            System.out.println("\nEnter a line of text terminated by a #");
            line = input.nextLine();
        }

    }
}