import java.util.Scanner;

public class exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        line = input.nextLine();
        while (!line.equals("#")) {
            System.out.println(count(line));
            line = input.nextLine();
        }
    }
    public static int count(String line) {
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '*') {    
                count++;
            }
        }
        return count;
    }
}