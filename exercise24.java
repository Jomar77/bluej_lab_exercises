import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        int number = 0;
        int current = 0;
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            tick(lineScanner, smallest, largest, number, current);
            line = input.nextLine();
        }
    }

    public static void tick(Scanner lineScanner, int smallest, int largest, int number, int current) {
        while (lineScanner.hasNext()) {
            if (lineScanner.hasNextInt()) {
                number = lineScanner.nextInt();
                if (current == 0) {
                    smallest = number;
                    largest = number;
                    current++;
                }
            } else {
                lineScanner.next();
            }
            if (number <= smallest) {
                smallest = number;
            }
            if (number >= largest) {
                largest = number;
            }
        }
        System.out.println("Min: " + smallest + " Max: " + largest);
    }
}