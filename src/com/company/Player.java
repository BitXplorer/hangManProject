package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


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

    public void loadPlayers(String playerlist) throws FileNotFoundException{
        File playerFile = new File("playerlist");
        Scanner scan = new Scanner(playerFile);
        while()
    }

    public findPlayer(String this.name){
        return name;
    }


    public savePlayer(playerlist) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("playerlist");
        System.out.println(playerList.toString());
        out.close();

    }

    public String toString(){
        return "Name: " + name + ", " +
                "Wins: " + wins + ", " +
                "Games played: " + totalPlayed + "\n";

    }


}
