/* Read, from standard input, the name of an item, its price (a double) and the quantity
of that item (an integer) each on a single line.
Write out the details on a single line with the total price as shown in the example
below.
All currency amounts should be displayed to 2 decimal place precision and with a $ in
front. The quantity should have no decimal places.
(use single spaces for separators)
(Hint Use printf)
*/

import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String name = input.nextLine();
        System.out.println("Enter the price of the item");
        double price = input.nextDouble();
        System.out.println("Enter the quantity of the item");
        int quantity = input.nextInt();
        System.out.printf("%d x %s @ $%.2f Total: $%.2f", quantity, name, price, price * quantity);
    }
}