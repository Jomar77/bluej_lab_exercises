import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercise28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int input = 0;
        while(input != -1){
            input = sc.nextInt();
            if(input != -1){
                numbers.add(input);
            }
        }
       Collections.sort(numbers);
        for(int i : numbers){
              System.out.println(i);
        }
    }
}