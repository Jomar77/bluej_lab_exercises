import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        score = input.nextInt();
        while (score != -1) {
            if (score < 50) {
                System.out.println("FAIL");
            } else if (score < 80) {
                System.out.println("PASS");
            } else {
                System.out.println("MERIT");
            }
            score = input.nextInt();
        }
    }
}