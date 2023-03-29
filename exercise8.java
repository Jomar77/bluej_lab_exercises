import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        while (score != -1) {
            if (score <= 49) {
                System.out.println("FAIL");
            } else if (score <= 79) {
                System.out.println("PASS");
            } else {
                System.out.println("MERIT");
            }
            score = input.nextInt();
        }
    }
}