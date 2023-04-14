import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class exercise32 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("raw.txt"));
            String line = in.readLine();
            while (line != null) {
                ArrayList<String> names = new ArrayList<String>();
                String[] data = names.toArray(new String[0]);
                String name = data[0];
                int[] scores = new int[data.length - 1];
                for (int i = 1; i < data.length; i++) {
                    scores[i - 1] = Integer.parseInt(data[i]);
                }
               
                System.out.print(name + " ");
                for (int i = 0; i < 3; i++) {
                    System.out.print(scores[i] + " ");
                }
                System.out.println();
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }

    public  static void sort (int[] scores){
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
    }
}
