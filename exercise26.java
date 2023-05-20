import java.util.Scanner;

public class exercise26 {
    public static void main(String[] args) {
        String[] replaceWords = args;

        Scanner input = new Scanner(System.in);
        String line =    input.nextLine();
        while (!line.equals("#")) {
            for (int i = 0; i < replaceWords.length; i += 2) {
                line = line.replace(replaceWords[i], replaceWords[i + 1]);
            }
            System.out.println(line);
            line = input.nextLine();
        }
    }
}
