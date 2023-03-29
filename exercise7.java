import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        while (score != -1) {
            if (score <= 49) {
                System.out.println("FAIL");
            } else {
                System.out.println("PASS");
            }
            score = input.nextInt();
        }
    }
}