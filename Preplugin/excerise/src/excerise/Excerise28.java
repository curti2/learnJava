/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excerise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // TODO code application logic here
        
        System.out.print("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int i = 1;
        
        while (i <= input) {
            sum += i;
            i++; 
        }
        System.out.println("Sum is " + sum);
            
    }
    
}
