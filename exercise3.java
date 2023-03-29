import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double pr = input.nextDouble();
        int qty = input.nextInt();
        System.out.printf("%d x %s @ $%.2f Total: $%.2f", qty, name, pr, pr * qty);
    }
}