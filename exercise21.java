import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        while (!line.equals("#")) {
            System.out.println(sum(line));
            line = input.nextLine();
        }
    }
    public static int sum(String line) {
        int sum = 0;
        Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    sum = sum + lineScanner.nextInt();
                }   else {
                    lineScanner.next();
                }
            }
        return sum;
    }
}