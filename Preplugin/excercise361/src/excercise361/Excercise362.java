/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise361;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Excercise362 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // TODO code application logic here
        
        
        System.out.print("Type numbers: ");
        int input = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (input != -1) {
            
            sum += input;
            input = Integer.parseInt(reader.nextLine());
        }
       
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
    }
    
}
