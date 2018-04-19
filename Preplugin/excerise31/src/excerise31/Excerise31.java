/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise31;
import java.util.Scanner;


/**
 *
 * @author curti
 */
public class Excerise31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int low;
        int hi;
        
                
        System.out.print(" first (low) : ");
        low = Integer.parseInt(reader.nextLine());
        System.out.print("last (hi) : ");
        hi = Integer.parseInt(reader.nextLine());
        int count = low;
        
        while (count <= hi) {
            System.out.println(count);
            count++;
         
            
        }
        if (low > hi) {
            System.out.println("Wrong way dummy!");
        }
        
        
    }
    
}
