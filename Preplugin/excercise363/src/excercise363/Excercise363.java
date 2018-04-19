/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise363;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Excercise363 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        
        
        System.out.print("Type numbers: ");
        int input = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int numEnt = 0;
        int even = 0;
        int odd = 0;
                
        double avg;
        while (input != -1) {
            
            sum += input;
            input = Integer.parseInt(reader.nextLine());
            numEnt++;
            int mod = input % 2;

            if (mod == 0) {
                even++;
            }
            else {
                odd++;
            }
            
                    
        }
       
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numEnt);
        System.out.println("Average:" + ((double)sum/numEnt));
        System.out.println("Number of even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        
    }
    
}