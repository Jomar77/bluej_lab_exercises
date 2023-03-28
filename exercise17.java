import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String[] words = new String[0];
        int j = 0;
        int a = 0;
        line = input.nextLine();
        while (!line.equals("#")) {
            words = line.split(",");
            for (j = 2; j < 6; j++) {
                a = a + Integer.parseInt(words[j]);
            }
            System.out.printf("%s %s %d%n", words[1], words[0], a);
            a = 0;
            line = input.nextLine();
        }
    }
}