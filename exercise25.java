import java.util.Scanner;
public class exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = 0;
        String [] words = new String[0];

        System.out.println("Enter the length of your array");
        len = input.nextInt();
        words = new String[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter a word");
            words[i] = input.next();
        }
        for (int i = 0; i < len; i++) {
            System.out.println(words[i]);
        }
    }
}
