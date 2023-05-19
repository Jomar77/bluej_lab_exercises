import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String number = input.nextLine();
        while (!number.equals("#") && number.length() < 20  && number.length() > 0) {
            Scanner lineScanner = new Scanner(number);
            while (lineScanner.hasNext()) {
                    numbers.add(lineScanner.nextInt());
            }

            Collections.sort(numbers);

            for (int i : numbers) {
                System.out.print(i + " ");
            }
            System.out.println();
            numbers = new ArrayList<Integer>();
            number = input.nextLine();
        }
    }
}