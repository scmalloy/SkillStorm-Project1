package com.skillstorm.projectbeans;

import java.util.Scanner;


public class Player {
	// Player variables
	private String playerType;
	private int creativeness;
	private int bakingSkill;
	private int overallCookieTaste;
	private String name;
	private int points;
	
	// Create constructor
	public Player(String playerType, int creativeness, int bakingSkill, int overallCookieTaste, String name, int points){
		this.playerType = playerType;
		this.creativeness = creativeness;
		this.bakingSkill = bakingSkill;
		this.overallCookieTaste = overallCookieTaste;
		this.name = name;
		this.points = points;
	}
	
	public Player() {}


	public void playerSelection(Scanner in)  {
	
	
	System.out.println("What is your players name? ");
	name = in.nextLine();
	
	//System.out.println("Alright, " + name + ". Choose what type of cookie baker you are: A.) The Innovator B.) The Classic C.) The Family Baker");
	String characterType;
	
	 // create a do-while loop to have user choose their player
	do {
		System.out.println("Alright, " + name + ". Choose what type of cookie baker you are: \nA.) The Innovator Baker "
				+ "		\nB.) The Classic Baker \nC.) The Ancestral Baker");
		characterType = in.nextLine();
		System.out.println("*****************************{ processing........ }*****************************");
	
	} while (!characterType.equalsIgnoreCase("A") && !characterType.equalsIgnoreCase("B") && 
				!characterType.equalsIgnoreCase("C"));
	
	if (characterType.equalsIgnoreCase("A")) {
		System.out.println("The innovator: You’re a risk taker, you love creating combinations that others might not think about,  "
				+ "\nwhich is why your bakery always has a line out of the door. That bold creativity usually plays in your favor.…."
				+ "\nbut not always, you are also prone to creating cookie combos that shall never be spoken of…"
				+ "\nCreativeness = 10"
				+ "\nBaking Skills = 8"
				+ "\nOverall Cookie Taste = 7");
		playerType = "Innovator";
		creativeness = 10;
		bakingSkill = 8;
		overallCookieTaste = 7;
		
	} else if (characterType.equalsIgnoreCase("B")) {
		System.out.println("The classic: You like to play it safe. People flock towards your bakery because you follow the golden rule of "
				+ "\n“if it's not broken, dont fix it”. You weigh each ingredient out and refuse to falter from your tried and true recipes."
		+ "\nCreativeness = 1"
		+ "\nBaking Skills = 9"
		+ "\nOverall Cookie Taste = 8");
		playerType = "Classic";
		creativeness = 1;
		bakingSkill = 9;
		overallCookieTaste = 8;
	} else {
		System.out.println("The ancestral baker: You take pride in your family's long history with cookie baking, you fell in love with "
				+ "\nbaking cookies after learning from a young age. Your great aunt Linda was a pro and you hope to continue her love for "
				+ "\ncookies for generations to come. That passion is what your customers love when coming to your bakery, they feel the love "
				+ "\nand passion you have for cookies."
				+ "\nCreativeness = 5"
				+ "\nBaking Skills = 7"
				+ "\nOverall Cookie Taste = 8");
		playerType = "Ancestral";
		creativeness = 5;
		bakingSkill = 7;
		overallCookieTaste = 8;
	}  
		
}

	
	public int getCreativeness() {
		return creativeness;
	}
	public void setCreativeness(int creativeness) {
		this.creativeness = creativeness;
	}
	
	public int getBakingSkill() {
		return bakingSkill;
	}
	public void setBakingSkill(int bakingSkill) {
		this.bakingSkill = bakingSkill;
	}
	
	public int getOverallCookieTaste() {
		return overallCookieTaste;
	}
	public void setOverallCookieTaset(int overallCookieTaste) {
		this.overallCookieTaste = overallCookieTaste;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
	
}
