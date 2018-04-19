/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise13;
import java.util.Scanner;
import nhlstats.NHLStatistics;
/**
 *
 * @author curti
 */
public class Exercise13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top 10 by Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
       
        System.out.println("Top 25 players based on Penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println("Sidney Crosby's Stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println("Philadelphia's Flyers Stats");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
       
    }
    
}
