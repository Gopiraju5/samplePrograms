package com.practice.java.oops;

public class Player {

    int playerId;
    String playerName;
    double playerPoints;

    public void setPlayerData(int id, String name, double points){
        playerId = id;
        playerName = name;
        playerPoints = points;
    }

    public void getPlayerData(){
        System.out.println("Player id is: " + playerId);
        System.out.println("Player name is: "+ playerName);
        System.out.println("Player points is: " + playerPoints);
    }
}
