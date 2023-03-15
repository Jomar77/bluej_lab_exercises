import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        int sum = 0;
        int count = 0;
        score = input.nextInt();
        while (score != 999) {
            sum += score;
            count++;
            score = input.nextInt();
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + String.format("%.2f", (double) sum / count));
    }
}