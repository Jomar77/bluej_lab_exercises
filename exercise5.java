/* Read, from standard input, the name of an item, its price (a double) and the quantity
of that item (an integer) each on a single line.
Write out the details on a single line with the total price as shown in the example
below.
If the quantity is 10 items or more then give the customer a 10% discount
All currency amounts should be displayed to 2 decimal place precision and with a $ in
front. The quantity should have no decimal places.
(use single spaces for separators)
(Hint Use printf, in printf "%%" is used to print out a single % symbol) */

import java.util.Scanner;
 

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double price = input.nextDouble();
        int quantity = input.nextInt();
        double total = price * quantity;
        if (quantity >= 10) {
            double discount = total *0.1; 
            total = total * 0.9;
            System.out.printf("%d x %s @ $%.2f%n", quantity, name, price);
            System.out.printf("Subtotal: $%.2f%n", price * quantity);
            System.out.println("-10% Discount: $" + discount);
            System.out.printf("Total: $%.2f",  total);
        }else{
            System.out.printf("%d x %s @ $%.2f%n", quantity, name, price);
            System.out.printf("Subtotal: $%.2f", total);
        }
    }
}