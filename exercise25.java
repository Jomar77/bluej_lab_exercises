import java.util.Scanner;

public class exercise25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len = 0;
        len = input.nextInt();
        String [] words = new String[len];
        for (int i = 0; i < len; i++) {
            words[i] = input.next();
        }
        sorting(words, len);

        for (int i = 0; i < len; i++) {
            System.out.println(words[i]);
        }

}

   
    public static void sorting(String[] words, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        
    }
}
