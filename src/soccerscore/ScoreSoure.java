/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccerscore;

import java.util.ArrayList;
/**
 *
 * @author kant2
 */
public class ScoreSoure {
    private ArrayList<ScoreListener> listeners;
    public ScoreSoure() {
	listeners = new ArrayList<>();
    }
    public void setScoreLine(String val) {
	fireScoreEvent(new ScoreEvent(this, val));
	}
    public void addScoreListener(ScoreListener l) {
	listeners.add(l);
    }
    public void removeScoreListener(ScoreListener l) {
	listeners.remove(l);
    }
    public void fireScoreEvent(ScoreEvent e) {
        for(int i = 0; i < listeners.size(); i++) {
            ScoreListener l = listeners.get(i);
            l.scoreChange(e);
	}
    }
}
