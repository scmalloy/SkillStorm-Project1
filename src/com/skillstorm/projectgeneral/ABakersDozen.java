package com.skillstorm.projectgeneral;

import java.util.Scanner;

import com.skillstorm.projectbeans.Player;
import com.skillstorm.projectbeans.Scene; 

public class ABakersDozen {

	public static void main (String[] args) {
	
		Scanner in = new Scanner(System.in); // allows user input
		
		
		Player player = new Player();
		Scene scene = new Scene();
		
		scene.plot();
		player.playerSelection(in);
		scene.eventOne(player, in);
		scene.eventTwo(player, in);
		scene.eventThree(player, in);
		scene.eventFour(player, in);
		scene.eventFive(player, in);
		
		scene.finale(player, in);
		
		in.close();
		}
	}
