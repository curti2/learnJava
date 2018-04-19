/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise24;
import java.util.Scanner;
/**
 *
 * @author curti
 */
public class Excerise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        int i = 1;
        int fact = 1;
        
        while (i <= input) {
            fact *= i;
            i++;
           
        }
          System.out.println("Factorial is " +fact);      
       
    }
    
}
