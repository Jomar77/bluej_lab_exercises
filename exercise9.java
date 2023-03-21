import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        int sum = 0;
        int count = 0;
        double avg = 0;
        score = input.nextInt();
        while (score != 999) {
            sum += score;
            count++;
            score = input.nextInt();
        }
        avg = sum/count;
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f", avg);
    }
}