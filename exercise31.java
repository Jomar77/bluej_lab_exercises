import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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

            Collections.sort(numbers);

            process(numbers);
            
            
            numbers = new ArrayList<String>();
            System.out.println();
            number = input.nextLine();
        }
    }

    public static void process(ArrayList<String> numbers){
        for (int i = 0; i < numbers.size(); i++) {
            if(i != numbers.size() -1 ) {
                System.out.print(numbers.get(i) +",");
            }
            else {
                System.out.print(numbers.get(i));
            }
        }
    }
}