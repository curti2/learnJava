/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise19;
import java.util.Scanner;

/**
 *
 * @author curti
 */
public class Excerise19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age =  Integer.parseInt(reader.nextLine());
        
        if (age > 0 && age < 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossibru!");
        }

    }

}
