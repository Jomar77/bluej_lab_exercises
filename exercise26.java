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
            for (int i = 0; i < array.length; i++) {
                if (text.contains(array[i])) {
                    text = text.replace(array[i], array[i + 1]);
                }
            }
            System.out.println(text);
            text = input.nextLine();
        }
    }
}
