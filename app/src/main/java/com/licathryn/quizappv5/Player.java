package com.licathryn.quizappv5;

public class Player {
    private String playerName;
    private int numCorrect;
    private long time;

    public Player(String n, int c, long t) {
        playerName = n;
        numCorrect = c;
        time = t;
    }
}
