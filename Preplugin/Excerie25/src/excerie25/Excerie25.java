/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerie25;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excerie25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        int sum = 0;
        int read;
        
        System.out.println("Please enter the first of 3 numbers: ");
        read = Integer.parseInt(reader.nextLine());
        
        sum = read;
        
        System.out.println("Please enter the second number: ");
        read = Integer.parseInt(reader.nextLine());
        
        sum = sum + read;
        
        System.out.println("Please enter the final number: ");
        read = Integer.parseInt(reader.nextLine());
        
        sum = sum + read;
        
        System.out.println("Sum: " + sum);
    }
    
}
