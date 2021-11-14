/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalc;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LUCY
 */
public class AverageCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);
       
        System.out.print("Please enter any number of scores: ");
        
        int num = myObj.nextInt();
        double score = calcAverageScore(num);
        System.out.println("The average score is " + score);
        
    }
    public static double calcAverageScore(int num) {
        
    Random numb = new Random();  
        int discard = 0;
        int sum = 0;
        double average = 0;
        
        for (int i=0; i < num; i++) {
           
        int prop = numb.nextInt(101);
        if (prop < 40) {
            discard++;                
            System.out.println("The final Score recieved " + i + " was " + prop + 
            ". The score of " + prop + " is less than 40 and will be removed");
          } else {
            sum += prop;                
            System.out.println("Score number " + i + " is " + prop);
            }
        }        
        if (discard == num) {
            return average;
        } else {
            average = sum/(num-discard);
            return average;
        }
    }
}

