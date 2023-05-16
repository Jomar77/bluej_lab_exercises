import java.util.Scanner;

public class exercise28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int i = 0;
        int input = 0;
        while(input != -1){
            input = sc.nextInt();
            if(input != -1){
                numbers[i] = input;
                i++;
            }
        }
        for(int j = 0; j < i; j++){
            for(int k = 0; k < i; k++){
                if(numbers[j] < numbers[k]){
                    int temp = numbers[j];
                    numbers[j] = numbers[k];
                    numbers[k] = temp;
                }
            }
        }
        for(int j = 0; j < i; j++){
            System.out.println(numbers[j]);
        }
    }
}