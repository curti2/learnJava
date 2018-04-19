/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerise39a;

/**
 *
 * @author curti
 */
public class Excerise39a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        xmasTree(10);
    }
    public static void printStars(int numStars) {
        int i = 0;
        while (i < numStars) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }
    public static void printSpaces(int spaces) {
        int i = 1;
        while (i <= spaces) {
            System.out.print(" ");
            i++;
        }
                
    }
    public static void printSquare(int squareSides) {
        int i = 0;
        while (i < squareSides) {
            printStars(squareSides);
            i++;
        }
                
    }
    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size) {
            printStars(i);
            i++;
        }
    }
    public static void printRightTriangle(int size){
        int i = 1;
        int spaces;
        int stars;
        while (i <= size) {
            spaces = size - i;
            stars = size - spaces;
            printSpaces (spaces);
            printStars (stars);
            i++;   
            }
        }
    public static void xmasTree (int size) {
        int i = 1;
        int spaces;
        int stars = 1;
        while (i <= size) {
            spaces = size - i;
            printSpaces (spaces);
            printStars (stars);
            stars += 2;
            i++;
        }
        int ii = 0;
        int trunkSpaces = size - 2;
        while (ii < 2) {
            printSpaces(trunkSpaces);
            printStars(3);
            ii++;
        }
        
    }
    }
             
