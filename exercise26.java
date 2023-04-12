import java.util.Scanner;
public class exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = args[i];
        }
        
        String text = input.nextLine();
        while (!text.equals("#")) {
            System.out.println(input(array, text));
            text = input.nextLine();
        }
    }

    public static void input(String[] array, String text) {
        for (int i = 0; i < array.length; i++) {
            if (text.contains(array[i])) {
                text = text.replace(array[i], array[i + 1]);
            }
        }
    }
}
