import java.util.Scanner;
 

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();
        double total = price * quantity;
        if (quantity >= 10) {
            System.out.printf("%d x %s @ $%.2f%n", quantity, name, price);
            System.out.printf("Subtotal: $%.2f%n", price * quantity);
            System.out.printf("-10%% Discount: $%.2f%n", price * quantity * 0.1);
            System.out.printf("Total: $%.2f%n",  price * quantity * 0.9);
        }else{
            System.out.printf("%d x %s @ $%.2f%n", quantity, name, price);
            System.out.printf("Total: $%.2f", total);
        }
    }
}