/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccerscore;

import java.util.Scanner;
/**
 *
 * @author kant2
 */
public class SoccerScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSoure source= new ScoreSoure();
        Thai Sub = new Thai();
        UAE Sub2 = new UAE();
        Scanner sc = new Scanner(System.in);
        source.addScoreListener(Sub);
        source.addScoreListener(Sub2);
 
        String type;
        do {
            System.out.printf("Enter Score Thai VS UAE ==> ");
            type = sc.nextLine();
            source.setScoreLine(type);
        }while(!type.equals(""));
       
    }

}
