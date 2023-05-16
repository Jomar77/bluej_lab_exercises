import java.util.ArrayList;
import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number = input.nextInt();
        concat(number, numbers);
        
        Collections.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }
    }

    public static void concat(int number, ArrayList<Integer> numbers){
        Scanner input = new Scanner(System.in);
        while (number != -1) {
            numbers.add(number);
            number = input.nextInt();
        }
    }
}