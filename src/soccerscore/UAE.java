/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccerscore;

/**
 *
 * @author kant2
 */
public class UAE implements ScoreListener{
    @Override
    public void scoreChange(ScoreEvent e) {
        System.out.println("live result: " + e.getScore());
    }
}
