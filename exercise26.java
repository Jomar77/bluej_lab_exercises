import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        String[] unpleasantWords = new String[args.length / 2];
        String[] pleasantWords = new String[args.length / 2];
        for (int i = 0; i < args.length; i += 2) {
            String[] pair = args[i].split(",");
            unpleasantWords[i / 2] = pair[0];
            pleasantWords[i / 2] = pair[1];
        }

        Scanner input = new Scanner(System.in);
        String line =    input.nextLine();
        while (!line.equals("#")) {
            for (int i = 0; i < unpleasantWords.length; i += 2) {
                line = line.replace(unpleasantWords[i], pleasantWords[i]);
            }
            System.out.println(line);
            line = input.nextLine();
        }
    }
}
