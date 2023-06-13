import static org.junit.Assert.assertEquals;


import java.util.Scanner;

import org.junit.Test;

public class exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        while (score != -1) {
            if (score <= 49) {
                System.out.println("FAIL");
            } else if (score <= 79) {
                System.out.println("PASS");
            } else {
                System.out.println("MERIT");
            }
            score = input.nextInt();
        }
    }

    //unit testing for merit
    
}

class mylibtest{
    public static String MarktoGrade(int score){
        if (score <= 49) {
            return "FAIL";
        } else if (score <= 79) {
            return "PASS";
        } else {
            return "MERIT";
        }
    }

    @Test
    public void testMarktoGradeFAIL(){
        assertEquals("FAIL", mylibtest.MarktoGrade(40));
        assertEquals("FAIL", mylibtest.MarktoGrade(30));
        assertEquals("FAIL", mylibtest.MarktoGrade(29));
    }

    @Test
    public void testMarktoGradeMERIT(){
        assertEquals("MERIT", mylibtest.MarktoGrade(89));
        assertEquals("MERIT", mylibtest.MarktoGrade(92));
        assertEquals("MERIT", mylibtest.MarktoGrade(87));
    }

}