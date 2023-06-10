import java.util.Scanner;
public class e26 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String[] arraya = new String[args.length];
        String[] arrayb = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            arraya[i] = args[i].split(",")[0];
            arrayb[i] = args[i].split(",")[1];
        }
        String text = scn.nextLine();
        while (!text.equals("#")) {
            for (int i = 0; i < arraya.length; i++) {
                
                    text = text.replace(arraya[i], arrayb[i]);
                
            }
            System.out.println(text);
            text = scn.nextLine();
        }
    }
}
