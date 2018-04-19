/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise21;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Exercise21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        if ((year % 100) == 0 ) {
            if ((year % 400) == 0){
                System.out.println("The year is a leap year!");
        } else {
            System.out.println("The year is NOT a leap year...");
        }} else if ((year % 4) == 0) {
                System.out.println("The year is a leap year!");
                } else {
                System.out.println("The year is NOT a leap year...");
                }
        
    }
    
}
