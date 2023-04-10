import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        exercise10.printTable(number);
    }
    static void printTable(int number){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " times " + number + " is " + number * i);
        }
    }
}