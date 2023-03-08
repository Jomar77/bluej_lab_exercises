import java.util.Scanner;
import java.util.Arrays;

public class exercise46 {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        String [] number = new String[0];
        Scanner scan = new Scanner(System.in);
        int median = 0;
        String line = scan.nextLine();
        
        while (!line.equals("#")) {
            number = line.split(" ");
            numbers = new int[Integer.parseInt(number[0])];
            for(int i=0; i<numbers.length; i++) {
                numbers[i] = Integer.parseInt(number[i+1]);
             }
             Arrays.sort(numbers);
            if (numbers.length % 2 == 0) {
                median = (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2;
                System.out.println(median);
            } else {
                median = numbers[numbers.length / 2];
                System.out.println(median);
            }
            line = scan.nextLine();
        }
    }
}