import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        while (!name.equals("#")) {
            System.out.println("Hello " + name);
            name = input.nextLine();
        }
    }
}