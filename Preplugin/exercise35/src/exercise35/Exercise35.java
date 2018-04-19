/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise35;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Exercise35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        
        System.out.print("Type a number: ");
        int pwr = Integer.parseInt(reader.nextLine());
        int sum = 1;
        int i = 1;
        
        while (i <= pwr) {
            sum += (int)Math.pow(2, i);
            i++;
            
        }
        System.out.println("The result is " + sum);        
    }
    
}
