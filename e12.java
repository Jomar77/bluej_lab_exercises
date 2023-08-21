// import java.util.Scanner;

// public class e12 {
//     public static void main(String args[]) {
//         Scanner s = new Scanner(System.in);
//         String input = s.nextLine();
//         int count = 1;

//         while (!input.equals("#")) {
//             if (input.equals("")) {
//                 count = 0;
//             } else {
//                 for (int i = 0; i < input.length(); i++) {
//                     if (input.charAt(i) == ' ') {
//                         count++;
//                     }
//                 }
//             }
//             System.out.println(count);
//             count = 1;
//             input = s.nextLine();
//         }
//     }
// }


import java.util.Scanner;
public class e12
{
    public static void main(String[] args)
    {
        Scanner word = new Scanner(System.in);
        String letters = word.nextLine();
        
        while (!letters.equals("#"))
        {
            int sentence = 0;
            sentence = countWords(letters);
            
            System.out.println(sentence);
            
            letters = word.nextLine();
        }
        
        word.close();
    }
    
    public static int countWords(String letters)
    {
        int count = 1;
        
        for (int num = 0; num < letters.length(); num++)
        {
            if (letters.charAt(num) == ' ')
            {
                count++;
            }
        }
        
        return count;
    }
}
