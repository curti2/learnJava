/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise16;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excercise16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        
        int mod = num % 2;
        
        if (mod == 0) {
            System.out.println("Number " + num + " is even");
        } else {
            System.out.println("Number " + num + " is odd");
        }
    }
    
}
