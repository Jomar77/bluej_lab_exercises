import java.util.Scanner;
 

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double pr = input.nextDouble();
        int qty = input.nextInt();
        double total = pr * qty;
        if (qty >= 10) {
            System.out.printf("%d x %s @ $%.2f%n", qty, name, pr);
            System.out.printf("Subtotal: $%.2f%n", pr * qty);
            System.out.printf("-10%% Discount: $%.2f%n", pr * qty * 0.1);
            System.out.printf("Total: $%.2f%n",  pr * qty * 0.9);
        }else{
            System.out.printf("%d x %s @ $%.2f%n", qty, name, pr);
            System.out.printf("Total: $%.2f", total);
        }
    }
}