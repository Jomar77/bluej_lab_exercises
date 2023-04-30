import java.util.Scanner;

public class e12 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int count = 1;

        while (!input.equals("#")) {
            if (input.equals("")) {
                count = 0;
            } else {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == ' ') {
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 1;
            input = s.nextLine();
        }
    }
}
