import java.util.Scanner;

public class exercise26{
  public static void main(String[] args){
    String[] words = new String[args.length * 2];
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < args.length; i ++){
      words[i*2]=args[i].split(",")[0];
      words[i*2+1]=args[i].split(",")[1];
    }

    String line = scan.nextLine();
    while(!line.equals("#")){
      for(int i = 0; i < args.length*2; i +=2){
        line = line.replace(words[i], words[i+1]);
      }
      System.out.println(line);
      line = scan.nextLine();
    }
  }
}