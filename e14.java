import java.util.Scanner;
public class e14 {
    public static void main(String args[]){
        Scanner s = new Scanner (System.in);
        String line = s.nextLine();
        int count = 0 ;

        while(!line.equals("#")){
            for(int i = 0; i< line.length(); i++){
                if(line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u' ){
                    count++;
                }
            }

            System.out.println(count);
            count =0;
            line     = s.nextLine();

        }
    }
    
}
