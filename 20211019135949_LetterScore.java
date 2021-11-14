/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterscore;
import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class LetterScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
        
        System.out.printf("%1s", "Please Input a Score: ");
        int score = myObj.nextInt();
        
        if (score >= 90){
        System.out.printf("%1s", "Your score is A, Excellent");
        System.out.printf("\n");
        }
        else if (score >= 80 && score < 90){
        System.out.printf("%1s", "Your score is B, Well Done");
        System.out.printf("\n");
        }
        else if (score >= 70 && score < 80){
        System.out.printf("%1s", "Your score is C, Okay");
        System.out.printf("\n");
        }
        else if (score >= 60 && score < 70){
        System.out.printf("%1s", "Your score is D, Passed");
        System.out.printf("\n");
        }
        else if (score < 60){
        System.out.printf("%1s", "Your score is F, Better Try Again");
        System.out.printf("\n");
        }
        System.out.printf("\n");
        System.out.printf("%1s", "@Aydan Guzevicius");
        System.out.printf("\n");
        
}
}