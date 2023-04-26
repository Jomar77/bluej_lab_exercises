import java.util.Scanner;

public class exercise12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int count = 1;
            String line = input.nextLine();
            while (!line.equals("#")) {
                System.out.println(count(line,count));
                count = 1;
                line = input.nextLine();
            }
        }
    }

    public static int count(String line, int counter) {
        for (char c : line.toCharArray()) {
            if (c == ' ') {
                counter++;
            }
        }
        return counter;
    }
}
