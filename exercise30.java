import java.util.Scanner;
import java.util.ArrayList;

public class exercise30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        String number = input.nextLine();
        while (!number.equals("#")) {
            Scanner lineScanner = new Scanner(number);
            while (lineScanner.hasNext()) {
                    numbers.add(lineScanner.nextInt());
            }
            for (int i = 0; i < numbers.size(); i++) {
                for (int j = 0; j < numbers.size() - 1; j++) {
                    if (numbers.get(j) > numbers.get(j + 1)) {
                        int temp = numbers.get(j);
                        numbers.set(j, numbers.get(j + 1));
                        numbers.set(j + 1, temp);
                    }
                }
            }
            for (int i : numbers) {
                System.out.print(i + " ");
            }
            
            numbers = new ArrayList<Integer>();
            System.out.println("\nEnter your numbers:");
            number = input.nextLine();
        }
    }
}