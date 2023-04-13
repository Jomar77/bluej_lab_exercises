import java.util.Scanner;
import java.util.ArrayList;

public class exercise31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> numbers = new ArrayList<String>();
        
        String number = input.nextLine();
        while (!number.equals("#")) {
            Scanner lineScanner = new Scanner(number);
            lineScanner.useDelimiter(",");
            while (lineScanner.hasNext()) {
                    numbers.add(lineScanner.next());
            }
            sort(numbers, numbers.size());
            
            for (int i = 0; i < numbers.size(); i++) {
                if(i != numbers.size() -1 ) {
                    System.out.print(numbers.get(i) +",");
                }
                else {
                    System.out.print(numbers.get(i));
                }
            }
            
            numbers = new ArrayList<String>();
            number = input.nextLine();
        }
    }

    public static void sort(ArrayList<String> numbers, int size){
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j).compareTo(numbers.get(j + 1)) > 0) {
                    String temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }
}