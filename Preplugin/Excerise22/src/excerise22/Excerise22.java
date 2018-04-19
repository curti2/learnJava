/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise22;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Excerise22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Welcome to the secret!");
        
        while (true) {
            System.out.println("Type the password: ");
            String pass = reader.nextLine();
            
            if (pass.equals("carrot")) {
                break;    
            } else {
                System.out.println("Wrong!");
            }
            
            
        }
        System.out.println("Right!");
        System.out.println("The secret is; jryy qbar!");
        
    } 
}
