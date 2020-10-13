package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {
    File playerFile = new File("playerlist");

	Player p1 = new Player("Dan",5,10);
	Player p2 = new Player("Antene",30,40);
	Player p3 = new Player("Joel",3,5);

	p3.playerList();

    }
}
