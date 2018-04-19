/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise38;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Excerise38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.print("How many times? ");
        int input = Integer.parseInt(reader.nextLine());
        int i = 0;
        
        while (i <= input) {
            printText();
            i++;
        }
    }
    public static void printText() {
        System.out.println("In the Beginning there were the swamp, the hoe and Java.");
    }
    
}
