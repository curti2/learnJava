/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise20;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Exercise20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type your username: ");
        String name = reader.nextLine();
        
        System.out.println("Type your password: ");
        String pass = reader.nextLine();
        
        if (name.equals("alex") && pass.equals("mightyducks")){
            System.out.println("You are now logged into the system");
        } else if (name.equals("emily") && pass.equals("cat")) {
            System.out.println("You are now logged into the system");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
    
}
