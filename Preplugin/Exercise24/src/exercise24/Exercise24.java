/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise24;

import java.util.Scanner;
import nhlstats.NHLStatistics;

/**
 *
 * @author curti
 */
public class Exercise24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");
        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
                
                // print the top ten playes sorted by points
                
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
                
                // print the top ten players sorted by goals
                
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
                
                // print the top ten players sorted by assists
                
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);

                // print the top ten players sorted by penalties
            } else if (command.equals("player")) {
                System.out.println("What Player? (name): ");
                NHLStatistics.searchByPlayer((reader.nextLine()));
                
                
                
                // ask the user for the player name and print the statistics for that player
            } else if (command.equals("club")) {
                System.out.println("What Club (3 letter ident please) :");
                String club = reader.nextLine();
                
                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(club);
                // ask the user for the club abbreviation and print the statistics for the club
                // note: the statistics should be sorted by points
                //     (players with the most points are first)
            }
        }
    }

}
