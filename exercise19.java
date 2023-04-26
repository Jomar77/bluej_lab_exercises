import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tempName = "";
        String line = input.nextLine();

        while (!line.equals("#")) {
            String[] parts = line.split(" ");
            int [] num = new int[parts.length];
            num[0] = Integer.parseInt(parts[1]);
            num[1] = Integer.parseInt(parts[3]);

                if (num[1] > num[0]) {
                    tempName = parts[3];
                    parts[3] = parts[1];
                    parts[1] = tempName;
                    tempName = parts[0];
                    parts[0] = parts[2];
                    parts[2] = tempName;
                }
                
            for (int i = 0; i < parts.length; i++){
                System.out.print(parts[i] + " ");
            }
            System.out.println();
            line = input.nextLine();
        }
    }
}