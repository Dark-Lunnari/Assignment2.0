/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futuresalary;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LUCY
 */
public class FutureSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);
    
        System.out.printf("%1s", "Please Input the amount of years: ");
        double nyears = myObj.nextDouble();
        
        System.out.printf("%1s", "Please Input a Salary: ");
        double salary0 = myObj.nextDouble();
        
        double salary1 = Math.pow(1+0.03, nyears)*salary0;
        
        double salary2 = Math.pow(1+0.05, nyears-2)*(salary0) + salary1;
        
        double salary3 = Math.pow(1+0.08, nyears-10)*(salary0) + salary2;
        
        
        if (nyears < 3){
        System.out.printf("%1s %1s %.2f \n", "The Future Salary will be",":", salary1);
        }
        else if (3 <= nyears && nyears < 10){
        System.out.printf("%1s %1s %.2f \n", "The Future Salary will be",":", salary2);
        }
        else if (nyears >= 10){
        System.out.printf("%1s %1s %.2f \n", "The Future Salary will be",":", salary3);
        
        System.out.printf("\n");
        System.out.printf("%1s", "@Aydan Guzevicius");
        System.out.printf("\n");
        }
    }
    
}
