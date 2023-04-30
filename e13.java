import java.util.Scanner;

public class e13 {
    public static void main (String args []){

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        while(!line.equals("#")){
            for(int i = line.length(); i > 0; i-- ){
                System.out.print(line.charAt(i-1));
            }
            System.out.println();
            line = s.nextLine();
        }
    }
}
