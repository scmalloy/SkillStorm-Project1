package com.skillstorm.projectbeans;

import java.util.Scanner;

public class Scene {

	
	// setting the scene
	public void plot() {
		System.out.println("You are a baker ~ a cookie extraordinaire, if you will ~ in a high-end, always busy bakery in Gilbert, Arkansas. "
				+ "\nYou are ready to put Gilbert on the map and decide to compete in the international cookie bake-off.");
	}
	
	public void eventOne(Player player, Scanner in) {
		System.out.println("\n*********Recipe choice*********");
		System.out.println("The bake-off requires you to come up with your own unique cookie");
		System.out.println("what recipe do you choose? "
				+ "\nA.) Your great aunt Linda’s one-of-a-kind lemon raspberry crumble cookie"
				+ "\nB.) Your customers favorite cookie, the '" + player.getName() + "'s Chunky Chocolate Chip'"
				+ "\nC.) You decide you don’t want to plan what cookie to bake. You want to bake with your heart "
				+ "\nand create a cookie on the spot");
		String recipeType;
		
		do {
			System.out.println("Please choose A, B, or C");
			recipeType = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
		} while (!recipeType.equalsIgnoreCase("A") && !recipeType.equalsIgnoreCase("B") 
				&& !recipeType.equalsIgnoreCase("C"));
		
		if (recipeType.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("While you love great aunt Linda’s version, you feel it is too boring and plain so you "
					+ "\ndecide to add your own spin! You add a lemon compote to the top, most of the judges seem impressed");
			player.setPoints(player.getPoints() + 3);
		} else  if (recipeType.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("Great aunt Linda never wrote her recipe down and you refuse to take any risks during the competition "
					+ "\nso you spend 2 months searching for and testing different recipes to find the one that is closest to great aunt Linda’s. "
					+ "\nYou were unable to find one that had the same magical flavor but had to choose because it is competition time. "
					+ "\nThe judges thought the recipe was nice, but could tell it wasn’t a cookie you were particularly proud of.");
			player.setPoints(player.getPoints() + 1);
		} else  if (recipeType.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("This cookie brings you back to your childhood and you know this recipe by heart. You make sure to include every "
					+ "\ndetail and love to share the story of how you grew to love cookies so much to the audience. The judges notice your passion "
					+ "\nand the crowd loves listening to your stories, this adds a personalized touch and the judges can notice that passion when "
					+ "\njudging your cookie. ");
			player.setPoints(player.getPoints() + 5);
		} else  if (recipeType.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("Although its a favorite, you just cant help but change each cookie recipe, you decide to add salted potato chips "
					+ "\nin the batter and it pays off! The judges love the perfect balance of sweet and salty!");
			player.setPoints(player.getPoints() + 5);
		} else  if (recipeType.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("Its your bakery’s favorite cookie for a reason. You meticulously follow the recipe to a T. However, 40 other bakers also "
					+ "\nchose chocolate chip cookie variations and yours does not stand out from the rest. The judges agree its a very solid chocolate "
					+ "\nchip cookie but feel the recipe was too safe.");
			player.setPoints(player.getPoints() + 3);
		} else  if (recipeType.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("As great aunt Linda always told you, bake with your heart. You decide to not measure any of the ingredients and add more "
					+ "\nthan double the chocolate chips than you usually do. Risky move…half of the judges love the chocolate overload while the other half "
					+ "\nthink it was way too much and took away from the actual cookie");
			player.setPoints(player.getPoints() + 1);
		} else  if (recipeType.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("This is where you strive! You’ve built your brand on creative freedom so why stop now? You decide to pack up as many "
					+ "\ningredients as you can to whip up the most unique cookie the judges have ever seen! It pays off, the judges are impressed by "
					+ "\nyour ability and skill and thankfully the combination you chose of miso and peanut butter sets you apart from the other contestants");
			player.setPoints(player.getPoints() + 5);
		} else  if (recipeType.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You always have a plan! What were you thinking? “Failure to plan is a plan to fail”, and you did just that, the stress of "
					+ "\ntrying to create the perfect cookie with no recipe was too much. You make the simplest sugar cookie possible with just eggs, flour, "
					+ "\nsugar and butter. The judges were not impressed.");
			player.setPoints(player.getPoints() - 2);
		} else  if (recipeType.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("Baking from the heart is what you grew up watching great aunt Linda do! Her charisma in the kitchen to grab whatever "
					+ "\ningredients spoke to her is now flowing through you. Your cookie comes out perfect and made with love. While your cookie is "
					+ "\nnot the most creative but the judges can tell you’re passionate which wins you some extra points");
			player.setPoints(player.getPoints() + 3);
		} 
	}
	
	
	public void eventTwo(Player player, Scanner in) {
		System.out.println("\n********The EGGs-treme mistake*******");
		System.out.println("You forgot eggs!!! In order to make up for this grave mistake you decide to: "
				+ "\nA.) Politely ask the baker in the booth next to you if you could borrow the 50 eggs needed for your recipe "
				+ "\nB.) Find a substitute for the eggs "
				+ "\nC.) Beg someone in the crowd to go buy you eggs");
		String eggs;
		
		do {
			System.out.println("Please choose A, B, or C");
			eggs = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
		} while (!eggs.equalsIgnoreCase("A") && !eggs.equalsIgnoreCase("B") && !eggs.equalsIgnoreCase("C"));
		
		if (eggs.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("Being “polite” isn’t your strong suit, the booth next to you takes offense in how you approached "
					+ "\nthem and laughs in your face, they tell you to work on your attitude first.");
			player.setPoints(player.getPoints() - 3);
		} else if (eggs.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("The booth next to you only has 20 eggs they can give you….you are grateful, BUT YOUR RECIPE CALLS FOR 50!!! "
					+ "\nNow what?! You fumble around trying to re-do all your measurement calculations for 20 eggs. You lose over an hour "
					+ "\nof time in the challenge doing the calculations, now you’re rushed to make the cookies.");
			player.setPoints(player.getPoints() + 2);
		} else if (eggs.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("The booth next to you listened as you told your story about Great aunt Linda and were so touched that they "
					+ "\ngladly gave you the 50 eggs and wish you luck!");
			player.setPoints(player.getPoints() + 5);
		} else if (eggs.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("Did you forget the eggs on purpose? Finding a substitute is your bread & butter! You are in the zone "
					+ "\nand forgetting the eggs doesn’t even phase you!");
			player.setPoints(player.getPoints() + 3);
		} else if (eggs.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("This is your worst nightmare. Your recipe doesn’t list any substitute for the eggs, how will your cookies "
					+ "\nturn out if you don’t have eggs? You’re thinking of just forfeiting now, but your baking partner inspires you to at least try! "
					+ "\nYou spend the next 45 minutes researching the best substitute for eggs.");
			player.setPoints(player.getPoints() + 1);
		} else if (eggs.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("If there's one thing great aunt Linda taught you, it was how to roll with the punches! She taught you all the "
					+ "\ntips and tricks on how to substitute while baking. You search around your booth and find the perfect substitute!");
			player.setPoints(player.getPoints() + 5);
		} else if (eggs.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("One of your greatest downfalls is your inability to create meaningful connections with strangers. Due to this, "
					+ "\nyou rudely ask people in the crowd to “GET ME EGGS”, the crowd is unenthused and the majority of the crowd walks off. "
					+ "\nLucky for you, someone in the crowd sees that you are just stressed and offers to go buy them for you. After an hour, "
					+ "\nthe crowd member returns with the eggs, you have 2 hours left to create the perfect cookie.");
			player.setPoints(player.getPoints() + 1);
		} else if (eggs.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You’re in a full blown panic and the crowd can tell. One of the on-lookers feels pity and gladly steps up to the plate to help…."
					+ "\nor so you thought. You sit and wait for the crowd member to return, unfortunately they stole your card and had a shopping spree at the local Wal-mart. "
					+ "\nYou scurry to make a cookie with no eggs and to no surprise of your own, the “cookie” doesn’t bake properly and hardly looks edible.");
			player.setPoints(player.getPoints() - 4);
		} else {
			System.out.println("who's that in the crowd? Is that your long lost uncle Jesse?! He recognizes you and sees the dilemma. He gets you 60 eggs(some to spare) "
					+ "\nplus a coffee in less than 30 minutes. Uncle Jesse to the rescue! You are still on track and can continue at the pace you planned.");
			player.setPoints(player.getPoints() + 5);
		}
		
	}
	
	
	public void eventThree(Player player, Scanner in) {
		System.out.println("\n*********The Biography**********");
		System.out.println("Before the competition each baker is required to write a quick bio on themselves and their bakery, you decide to focus on: "
				+ "\nA.) Writing mainly about Gilbert, Arkansas and why it's so amazing "
				+ "\nB.) Your family’s history with baking "
				+ "\nC.) How successful you have become and why you deserve to win ");
		String biography;
		
		do {
			System.out.println("Please choose A, B, or C");
			biography = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
		} while (!biography.equalsIgnoreCase("A") && !biography.equalsIgnoreCase("B") && !biography.equalsIgnoreCase("C"));
	
		if (biography.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("Your goal is to put Gilbert on the map! You attribute Gilbert’s growing popularity due to the success of your bakery, "
					+ "\nand yes, while Gilbert does have a special place in your heart you want people to know you made Gilbert what it is today! "
					+ "\nYour bio comes off arrogant and the judges are put-off by it.");
			player.setPoints(player.getPoints() - 3);
		} else if (biography.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You meticulously research the history of Gilbert, Arkansas for months in hopes to capture its true beauty. "
					+ "\nNo one reads your bio as many people didn’t want a history lesson. The judges don’t even get past the first few words "
					+ "\n“Gilbert, Arkansas was founded in 1902 by……”");
			player.setPoints(player.getPoints() - 2);
		} else if (biography.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("Your family's ties to Gilbert date all the way back to when the town was founded, the crowd and judges love hearing "
					+ "\nhow you've continued to help the town you grew up in grow and flourish.");
			player.setPoints(player.getPoints() + 3);
		} else if (biography.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("You don’t like contributing your success to anyone but yourself. Your bio comes off as cold and the crowd and judges "
					+ "\nunfortunately do not get a good first impression of you.");
			player.setPoints(player.getPoints() - 3);
		} else if (biography.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You’re a planner, you love lists….so what do you decide to do? Give a bullet point explanation on your family's history with baking. "
					+ "\nThe crowd and judges love the simplicity of this layout and love how easy it is to see your background in baking, great job!");
			player.setPoints(player.getPoints() + 5);
		} else if (biography.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("If there is one topic you could speak on for hours, it's this. So how do you fit it all into a small bio? You enlist the help of your family members "
					+ "\nand together you create the most beautiful, heartfelt bio one has ever written about baking. The crowd and the judges are touched by the sentiment "
					+ "\nand excited to try your cookie that has such a deep family history.");
			player.setPoints(player.getPoints() + 3);
		} else if (biography.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("Talking about yourself is your second greatest skill behind baking cookies, of course. Although you're confident and know you are a cookie master, "
					+ "\nyour bio comes off a bit arrogant. Some of the judges can appreciate the confidence while others are less than impressed and hope your cookie can live up to "
					+ "\nthe lofty gloating going on.");
			player.setPoints(player.getPoints() + 2);
		} else if (biography.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You like to contribute your success to your meticulous and careful baking routines. Ensuring the recipes that have been created are followed to a T, "
					+ "\nthe judges and guests love that you pay so much attention to your baking process and are excited to see how your cookies turn out!");
			player.setPoints(player.getPoints() + 3);
		} else if (biography.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("Your success has only been possible due to your family’s history with baking. Writing about just yourself when it comes to those successes makes you feel like a fraud. "
					+ "\nDue to this, your bio comes off as shallow and does not excite the judges.");
			player.setPoints(player.getPoints() - 2);
		}
	
	}
	
	
	public void eventFour(Player player, Scanner in) {
		System.out.println("\n*********Please choose a partner**********");
		System.out.println("For the competition you can choose to bring one person to help you prep and bake, you choose: "
				+ "\nA.) Great aunt Linda "
				+ "\nB.) Your most trustworthy employee, Drew "
				+ "\nC.) You decide to have a raffle and have people submit their favorite cookie recipe to choose your partner");
		String partner;
		
		do {
			System.out.println("Choose A, B, or C");
			partner = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
		} while (!partner.equalsIgnoreCase("A") && !partner.equalsIgnoreCase("B") && !partner.equalsIgnoreCase("C"));
		
	 if (partner.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
		System.out.println("Great aunt Linda is the safe choice, not the typical bold choice you would make. While you love her, "
				+ "\nher style of baking is significantly different than yours and you spend half the time arguing. "
				+ "\nYour creative energy is dampened by the fussing and your cookie's uniqueness pays the price.");
		player.setPoints(player.getPoints() - 3);
	} else if (partner.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Classic")) {
		System.out.println("Great aunt Linda bakes with her heart, she's been baking cookies for longer than you’ve been alive. "
				+ "\nHowever, her inaccuracies cause the cookie to be flat and dry.");
		player.setPoints(player.getPoints() - 2);
	} else if (partner.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
		System.out.println("You’ve been baking cookies with great aunt Linda for as long as you can remember. "
				+ "\nYou two have a great flow in the kitchen and are able to create magic. "
				+ "\nThe crowd and judges are so impressed with how well you two work in the kitchen.");
		player.setPoints(player.getPoints() + 5);
	} else if (partner.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
		System.out.println("Drew has been with you since you opened shop, you’ve taught him everything he knows! "
				+ "\nHe is honored to be by your side for this competition and you two work wonders together. "
				+ "\nHe understands your quirks and ensures you stay on task all while ensuring not to disrupt your creative flow.");
		player.setPoints(player.getPoints() + 3);
	} else if (partner.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Classic")) {
		System.out.println("This is the best choice you could have made. You hired Drew because he agrees that recipes are meant to be followed as precisely as possible. "
				+ "\nThe two of you work together like a well-oiled machine, ensuring you are crossing off each step once complete. "
				+ "\nYour cookie turns out exactly like the recipe intended.");
		player.setPoints(player.getPoints() + 3);
	} else if (partner.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
		System.out.println("Drew, like the rest of your bakery employees, is like family. He has been with you since you first opened and since great aunt Linda missed her flight he is the perfect replacement. "
				+ "\nYour cookie turns out great and great aunt Linda made it just in time to watch the judges come through.");
		player.setPoints(player.getPoints() + 5);
	} else if (partner.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
		System.out.println("What better way to show the judges that you are a creative genius?! You chose the applicant who created a cookie with garlic, sun dried tomatoes and figs."
				+ "\nTheir unique style and yours meshes so well together and you create a one-of-a-kind cookie mastery.");
		player.setPoints(player.getPoints() + 5);
	} else if (partner.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Classic")) {
		System.out.println("As the planner you are, you decided to bake each applicant's cookie to choose your partner. You landed on Susan, her cookie was the perfect balance or soft, chewy, sweet and savory. "
				+ "\nYou show her the recipe you two will be baking for the challenge and get right to work! She decides to help when instructed to ensure there is no confusion, "
				+ "\ndue to this the baking process takes longer than normal but your cookie is completed just in time!");
		player.setPoints(player.getPoints() + 3);
	} else if (partner.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
		System.out.println("Great aunt Linda always taught you to give others a chance. Unfortunately the partner you chose does not show up on competition day and you are left to bake on your own. "
				+ "\nFrazzled by the change, you forget to add flour to your cookies and they end up not even baking properly.");
		player.setPoints(player.getPoints() - 10);
	}
	
}
	
	public void eventFive(Player player, Scanner in) {
		System.out.println("\n**********The surprise ingredient**********");
		System.out.println("The judges decide to spice things up a bit and add in a required ingredient, bacon! You then decide to: "
				+ "\nA.) Leave the bacon out, it wasn’t in the rule book and you don’t want to mess up your perfectly crafted cookie "
				+ "\nB.) Add the bacon, that's what the judges said to do so you must "
				+ "\nC.) Create a petition with the other bakers around you to make the bacon optional");
		String ingredient;
		
		do {
			System.out.println("Please choose A, B, or C");ingredient = in.nextLine();
			System.out.println("*****************************{ processing........ }*****************************\n");
		} while (!ingredient.equalsIgnoreCase("A") && !ingredient.equalsIgnoreCase("B") && !ingredient.equalsIgnoreCase("C"));
	
		
		if (ingredient.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("What are you thinking? For someone who says they love the chaos of adding in unusual ingredients, this was your time to shine! "
					+ "\nThe judges are less than impressed and you lose major points…");
			player.setPoints(player.getPoints() - 10);
		} else if (ingredient.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("It wasn’t in the initial rule book which you of course studied to a T, so why would they add it now? "
					+ "\nYou decide to bring your concern to the judges who are unenthused with your push-back. "
					+ "\nIn the end, the judges stick to their decision and you lose points for not adding the bacon.");
			player.setPoints(player.getPoints() - 5);
		} else if (ingredient.equalsIgnoreCase("A") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("Great Aunt Linda always told you “cheeses and meats never belong in sweets”. When presenting your bacon-less cookie, "
					+ "\nyou use that quote and the judges appreciate that you stuck with your true baking identity.");
			player.setPoints(player.getPoints() + 1);
		} else if (ingredient.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("This is easy for you! It’s like the judges added this rule in for you to shine! Bacon was the missing piece of your cookie and you had no idea! "
					+ "\nThis might be the best cookie you've ever made!");
			player.setPoints(player.getPoints() + 5);
		} else if (ingredient.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("You’re a rule follower so of course you add it, but you’re worried how it’ll work. "
					+ "\nThankfully you find a recipe in the recipe book you took with you that adds not only bacon, but the bacon grease as well! "
					+ "\nThe judges love that you use every part of the bacon in your cookie.");
			player.setPoints(player.getPoints() + 5);
		} else if (ingredient.equalsIgnoreCase("B") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("Great Aunt Linda would be disappointed to see you adding bacon, you were always taught to “bake with your heart”...now you’re having to sacrifice that to appease the judges. "
					+ "\nThe judges can tell you are annoyed by the rule change and your cookie suffers due to that.");
			player.setPoints(player.getPoints() - 3);
		} else if (ingredient.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Innovator")) {
			System.out.println("While you do have a commanding presence, you often come off as arrogant and a little intense. "
					+ "\nThe bakers around you are not thrilled and you waste half of your cooking time failing to get any signatures. "
					+ "\nSo you rush to add the bacon and forget to add sugar to your cookies. ");
			player.setPoints(player.getPoints() - 8);
		} else if (ingredient.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Classic")) {
			System.out.println("The other recipe-following bakers agree with you and you end up getting 50 signatures! The judges had no choice but to make the bacon optional.");
			player.setPoints(player.getPoints() + 2);
		} else if (ingredient.equalsIgnoreCase("C") && player.getPlayerType().equalsIgnoreCase("Ancestral")) {
			System.out.println("You tell the other bakers about how Great Aunt Linda also told you to stand up for what you believe in and having to be forced to add an ingredient into your baking "
					+ "\ntakes away from the true magic of cookie baking. "
					+ "\nThe other bakers could not agree more and you get 100 signatures. The judges have no other but to make the bacon options. Way to stand up!");
			player.setPoints(player.getPoints() + 3);
		} 
	}
	
	public void finale(Player player, Scanner in) {
		System.out.println("\n*****************************{ processing........ }*****************************\n\n");
		if (player.getPoints() >= 15) {  
			System.out.println("Congratulations, " + player.getName() + "!!! You rose to the challenge and proved to be trimphant! "
					+ "\nNow everyone knows you are the best cookie baker and you've successfully put Gilbert, Arkansas AND your bakery on the map. "
					+ "\nTake in the glory, champ!"); 
			} else if (player.getPoints() < 15 && player.getPoints() > 5) { 
				System.out.println("Well, " + player.getName() + " this certaintly wasn't your best work. Unfortunately you did not win, however, "
						+ "\nyou were able to create some buzz around your bakery and you do end up seeing an increase in customers over the next few months. So it wasn't a waste!");
			} else if (player.getPoints() <= 5) {
				System.out.println("What happened " + player.getName() + "?!?! who knew someone could do so terrible in a cookie baking contest...."
						+ "\nnot only did you lose the competition, but your customer count decreased as well. Better luck next time, if your bakery even survives the next year....");
			}
	}
}

