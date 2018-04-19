/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise33;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excerise33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner reader = new Scanner(System.in);
        
        System.out.print("First (low): ");
        int low = Integer.parseInt(reader.nextLine());
        
        System.out.print("Last (Hi): ");
        int hi = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = low;
        
        while (i <= hi) {
            sum += i;
            i++;
            
            
        }
        if (low > hi) {
            System.out.println("wrong way try again dummy");
        } else {
            System.out.println("The sum is " + sum);
        }
        
        
        
    }
    
}
