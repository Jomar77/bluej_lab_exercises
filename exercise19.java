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
                System.out.print(sortedNames[i] + " " + sortedScores[i]);
                if (i != sortedScores.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
            line = input.nextLine();
        }

    }
}