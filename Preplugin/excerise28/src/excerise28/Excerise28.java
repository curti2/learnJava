/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise28;
import java.util.Scanner;



/**
 *
 * @author curti
 */
public class Excerise28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int limit;
        System.out.println("Up to what number?");
        limit = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= limit) {
            System.out.println(i);
            i++;
            
        }       
    }
    
}
