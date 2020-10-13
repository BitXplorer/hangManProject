package com.company;

import java.io.PrintWriter;
import java.util.ArrayList;

public class Player {
    private String name;
    private int wins;
    private int totalPlayed;
    private ArrayList<Player> playerList = new ArrayList<>();



    public Player(String name, int wins, int totalPlayed) {
        this.name = name;
        this.wins = wins;
        this.totalPlayed = totalPlayed;

    }

    public addPlayer(name,wins,totalPlayed){
        playerList.add(input);

    }

    public savePlayers(name,wins,totalPlayed){
        PrintWriter out = new PrintWriter("playerlist");
        System.out.println(playerList.toString());
        out.close();

    }
*/
    public String toString(){
        return "Name: " + name + ", " +
                "Wins: " + wins + ", " +
                "Games played: " + totalPlayed + "\n";

    }


}
