/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise18;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Exercise18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        if (points <= 29) {
            System.out.println("Grade : Failed");
        } else if (points <= 34) {
            System.out.println("Grade : 1");
        } else if (points <= 39) {
            System.out.println("Grade : 2");
        } else if (points <= 44) {
            System.out.println("Grade : 3");
        } else if (points <= 49) {
            System.out.println("Grade : 4");
        } else if (points <= 60) {
            System.out.println("Grade : 5");
        }
        
    }
    
}
