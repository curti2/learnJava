/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise17;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excercise17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type the second number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        if (num1 > num2) {
            System.out.println("Greater number is " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is " + num2);
        } else if (num2 == num1) {
            System.out.println("The numbers are equal!");
        }
        
        
    }
    
}
