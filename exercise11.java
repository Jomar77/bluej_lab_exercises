import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        int count;
        line = input.nextLine();
        while (!line.equals("#")) {
            count = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == '*') {
                    count++;
                }
            }
            System.out.println(count);
            line = input.nextLine();
        }
    }
}