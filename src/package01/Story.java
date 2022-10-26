package package01;

import package02.Monster_Bufeo;
import package02.Monster_Chullachaqui;
import package02.Monster_Yacuruna;
import package02.SuperMonster;
import package02.SuperWeapon;
import package02.Weapon_Axe;
import package02.Weapon_Fist;
import package02.Weapon_Knife;
import package02.Weapon_Rocks;
import package02.Weapon_Spell;

public class Story 
{
	Game game;
	static UI ui;
	VisibilityManager vm;
	Player player = new Player();
	SuperMonster monster;  
	
	public Story (Game g, VisibilityManager vManager, UI uInterface)
	{
		game = g;
		vm = vManager;
		ui = uInterface;
	}
	
	//This is the default setup, so the HP and weapon that the player has at the beginning of the game
	//If we wanted to restart the game without this part, it would take us to the previous state before dying
	//This means having more advanced weapons at the beginning of the game, or a higher HP.
	public void defaultSetUp()
	{
		player.hp = 50;
		ui.hpNumberLabel.setText("" + player.hp);
		
		player.currentWeapon = new Weapon_Fist();
		ui.weaponNameLabel.setText(player.currentWeapon.name);
	}
	
	//This is the method which will allow us to change between places.
	//Without this method, the buttons won't be able to take us to one screen or another.
	public void selectPlace(String nextPlace)
	{
		switch(nextPlace)
		{
		case "notes": notes(); break;
		case "backSleep": backSleep(); break;
		case "window": window(); break;
		case "armasSquare": armasSquare(); break;
		case "wakeUp": wakeUp(); break;
		case "north": north(); break;
		case "west": west(); break;
		case "south": south(); break;
		case "east": east(); break;
		case "talkPort": talkPort(); break;
		case "lookPort": lookPort(); break;
		case "chullachaqui": chullachaqui(); break;
		case "yacuruna": yacuruna(); break;
		case "runAway": runAway(); break;
		case "bufeo": bufeo(); break;
		case "river": river(); break;
		case "fightRiver": fightRiver(); break;
		case "playerAttack": playerAttack(); break;
		case "monsterAttack": monsterAttack(); break;
		case "endYacuruna": endYacuruna(); break;
		case "win": win(); break;
		case "forest": forest(); break;
		case "party": party(); break;
		case "conversation": conversation(); break;
		case "shunto": shunto(); break;
		case "juane": juane(); break;
		case "seduce": seduce(); break;
		case "forestno": forestno(); break;
		case "jungle": jungle(); break;
		case "finalBufeoFirst": finalBufeoFirst(); break;
		case "bufeoSecond": bufeoSecond(); break;
		case "finalBufeo": finalBufeo(); break;
		case "finalEscape": finalEscape(); break;
		case "finalHappy": finalHappy(); break;
		case "loseFinal": loseFinal(); break;
		case "sadFinal": sadFinal(); break;
		case "deepForest": deepForest(); break;
		case "finalBoss": finalBoss(); break;
		case "title": title(); break;
		case "finalChullachaqui": finalChullachaqui(); break;
		}
	}
	
	//I've created this method separated to call the attack, since it's something we will use often
	public void attack()
	{
		int monsterDamage = new java.util.Random().nextInt(monster.power);
		
		ui.mainTextArea.setText("The " + monster.mname + " has attacked you!\nYou received " + monsterDamage + " damage!");
		player.hp = player.hp - monsterDamage;
		ui.hpNumberLabel.setText("" + player.hp);
	}
	
	//method related to the polymorphism
	static void letsHear(final SuperWeapon weapon)
	{
	    ui.mainTextArea.setText(weapon.message());
	}
	
	//All the other methods from here are just screens in the game, meaning that they represent
	//one single scenario in the game
	public void wakeUp()
	{
		ui.mainTextArea.setText("Welcome to the Amazon jungle. This is one of the most exotic places in the whole world. A place where magic still exists, and the mysticity emanates from every single living being. \nYou've woken up up in Iquitos, the capital of the Peruvian jungle. You have some notes nearby, there is a window next to your bed, and a door on the other side of the room.\nWhat do you do?");
		ui.choice1.setText("Look at my notes");
		ui.choice2.setText("Try to go back to sleep");
		ui.choice3.setText("Look through the window");
		ui.choice4.setText("Get up and leave");
		
		game.nextPlace1 = "notes";
		game.nextPlace2 = "backSleep";
		game.nextPlace3 = "window";
		game.nextPlace4 = "armasSquare";
	}
	
	public void notes()
	{
		ui.mainTextArea.setText("You have some texts about mythical creatures living in the jungle.\nYou also have a boat ticket. Oh, it's right! You have a boat leaving soon to go to the jungle.");
		ui.choice1.setText("Go back");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "wakeUp";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void backSleep()
	{
		ui.mainTextArea.setText("You try to go back to sleep...\nHave you forgotten you are in the Amazon? It's over 35 °C the whole year, there is no way you can go back to sleep!");
		ui.choice1.setText("Go back");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "wakeUp";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void window()
	{
		ui.mainTextArea.setText("You can see the Amazon River from here, and the landscape is totally beautiful. Well, it makes sense, you are in 'La Casa Morey', a hotel which used to be the residence of one of the richest businessman in the city, Luis Felipe Morey. He made his fortune thanks to the rubber, and it was during that time when the city really started to grow as well.");       
		ui.choice1.setText("Go back");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "wakeUp";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void armasSquare()
	{
		ui.mainTextArea.setText("You've come to the southwest, to the Armas Square. This is the center of the city, and most of the buildings are from the 19th and 20th century. The boulevard is on the east. To the south you can find the Belen district. You have the library on the west. And the port is on the north.");
		ui.choice1.setText("North");
		ui.choice2.setText("West");
		ui.choice3.setText("South");
		ui.choice4.setText("East");
		
		game.nextPlace1 = "north";
		game.nextPlace2 = "west";
		game.nextPlace3 = "south";
		game.nextPlace4 = "east";
	}
	
	public void north()
	{
		ui.mainTextArea.setText("You arrive to the city port. There are a lot of boats and ships around. Well, this port is the main one of the whole region, so it seems to be quite important.");
		ui.choice1.setText("Go back");
		ui.choice2.setText("Look around");
		ui.choice3.setText("Talk to some of the locals");
		ui.choice4.setText("Get into the boat");
		
		game.nextPlace1 = "armasSquare";
		game.nextPlace2 = "lookPort";
		game.nextPlace3 = "talkPort";
		game.nextPlace4 = "river";
	}
	
	public void lookPort()
	{
		ui.mainTextArea.setText("You take a look at the port. It is definitely bigger than you thought, even though it's a bit rustic.");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "north";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void talkPort()
	{
		ui.mainTextArea.setText("Some of the locals approaches you and asks you if you need help with something to be carried. You ask him what he means, and he points at a guy carrying an entire motorcycle by himself to one of the ships.\n(What do they eat here...?)");
		ui.choice1.setText("Continue");        
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "north";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void west()
	{
		ui.mainTextArea.setText("You are in the library of the city. You see that it contains some of the legends you had in your notes. \nWhat would you like to do?");
		
		ui.choice1.setText("Go back");
		ui.choice2.setText("Read 'El bufeo colorado'");
		ui.choice3.setText("Read 'El chullachaqui'");
		ui.choice4.setText("Read 'El yacuruna'");
		
		game.nextPlace1 = "armasSquare";
		game.nextPlace2 = "bufeo";
		game.nextPlace3 = "chullachaqui";
		game.nextPlace4 = "yacuruna";
	}
	
	public void bufeo()
	{
		ui.mainTextArea.setText("'El bufeo colorado' is the Amazon pink dolphin. The legend says that this animal turns into a beautiful human which seduces you and takes you to the river to live with all the other 'bufeos' forever. The only way to spot him is...\nYou can't read the rest of the text, it's too old.");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "west";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void chullachaqui()
	{
		ui.mainTextArea.setText("The 'Chullachaqui' is the guardian of the jungle. He can transform into someone you know to trick you and make you get lost, making you starve to death. But this happens only if you hurt the jungle and its creatures, of course. However, the transformation is not always complete...");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "west";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	
	public void yacuruna()
	{
		ui.mainTextArea.setText("The 'Yacuruna' is a mythical creature who lives in the bottom of the river. He is the king and protector of the river, and you can easily spot him because he wears an anaconda as his bell, big turtles as shoes, and he is always riding a wild black crocodile.");
		ui.choice1.setText("Continue");                    
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "west";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void south()
	{
		ui.mainTextArea.setText("You enter to the famous Belen district, also known as the Amazon Venecia. There are a lot of houses floating in the river, and people seem to be used to it, rather than surprised, unlike you.\nHowever, this is not the safest place around, and you actually find a knife on the ground.\n(You've obtained a knife)");
		
		player.currentWeapon = new Weapon_Knife();
		ui.weaponNameLabel.setText(player.currentWeapon.name);
		
		ui.choice1.setText("Go back");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "armasSquare";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	
	public void east()
	{
		ui.mainTextArea.setText("This is the boulevard of Iquitos, such a quiet and cosmopolitan place. You see a lot of foreigners around, just admiring the landscape. You can see again the Amazon River in the horizon. There is a playground around, and you see some rocks. They look nice, so keep them as a souvenir.\n(You've obtained rocks)");
		
		player.currentWeapon = new Weapon_Rocks();
		ui.weaponNameLabel.setText(player.currentWeapon.name);
		
		ui.choice1.setText("Go back");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "armasSquare";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	
	public void river()
	{
		ui.mainTextArea.setText("You are now in the boat, navigating through the biggest river in the whole world.\nYou are admiring the sunset and watching some pink dolphins. They are such beautiful creatures, it's obvious why people around created myths about them.\nYou start to fall sleep... no, you are being hypnotized. You see a beautiful woman singing at the distance... You fall into the river.");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "fightRiver";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	
	public void fightRiver()
	{
		monster = new Monster_Yacuruna();
		
		ui.mainTextArea.setText("You wake up in an island in the middle of the river, and there is a big man on a black crocodile in front of you. It's... the Yacuruna!\n" + monster.attackPhrase + "\nWhat do you do?");
		
		ui.choice1.setText("Fight");
		ui.choice2.setText("Run away");
		ui.choice3.setText("Wait");
		ui.choice4.setText("Give up");
		
		game.nextPlace1 = "playerAttack";
		game.nextPlace2 = "runAway";
		game.nextPlace3 = "monsterAttack";
		game.nextPlace4 = "endYacuruna";
	}
	
	public void runAway()
	{
		ui.mainTextArea.setText("You try to run away, but the island is rather small and the Yacuruna is faster than you've expected.\nWhat do you do?");
		
		ui.choice1.setText("Fight");
		ui.choice2.setText("Run away");
		ui.choice3.setText("Wait");
		ui.choice4.setText("Give up");
		
		game.nextPlace1 = "playerAttack";
		game.nextPlace2 = "runAway";
		game.nextPlace3 = "monsterAttack";
		game.nextPlace4 = "endYacuruna";
	}	


	public void playerAttack()
	{
		//attack (player, monster);
		int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage);
		
		//		letsHear(new Weapon_Axe());
		ui.mainTextArea.setText("You attack the " + monster.mname + " and deal " + playerDamage + " damage!");
       
		monster.hp = monster.hp - playerDamage;

		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		if(monster.hp>0)
		{
			game.nextPlace1= "monsterAttack";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
		}
		
		else if (monster.hp<1)
		{
			if(monster.mname == "Yacuruna")
			{
			game.nextPlace1= "win";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
			
			else if (monster.mname == "Bufeo Colorado")
			{game.nextPlace1= "bufeoSecond";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
			
			else if (monster.mname == "Chullachaqui")
			{game.nextPlace1= "finalChullachaqui";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
		}
	}	
		
	public void monsterAttack()
	{
		attack();
		//int monsterDamage = new java.util.Random().nextInt(monster.power);
		
		//ui.mainTextArea.setText("The " + monster.mname + " has attacked you!\nYou received " + monsterDamage + " damage!");
		//player.hp = player.hp - monster.power;
		//ui.hpNumberLabel.setText("" + player.hp);

		//ui.choice1.setText("Fight");
		//ui.choice2.setText("Run away");
		//ui.choice3.setText("Wait");
		//ui.choice4.setText("Give up");
		
		if(player.hp>0)
		{
			
			ui.choice1.setText("Fight");
			ui.choice2.setText("Run away");
			ui.choice3.setText("Wait");
			ui.choice4.setText("Give up");
			
			if (monster.mname == "Yacuruna")
			{game.nextPlace1= "playerAttack";
			game.nextPlace2= "runAway";
			game.nextPlace3= "monsterAttack";
			game.nextPlace4= "endYacuruna";
			}
			
			else if (monster.mname == "Bufeo Colorado")
			{game.nextPlace1= "playerAttack";
			game.nextPlace2= "jungle";
			game.nextPlace3= "bufeoSecond";
			game.nextPlace4= "finalBufeo";
			}
			
			else if (monster.mname == "Chullachaqui")
			{game.nextPlace1= "playerAttack";
			game.nextPlace2= "sadFinal";
			game.nextPlace3= "monsterAttack";
			game.nextPlace4= "loseFinal";
			}
			
		}
		
		else if (player.hp<1)
		{
			ui.choice1.setText("Continue");
			ui.choice2.setText("");
			ui.choice3.setText("");
			ui.choice4.setText("");
			
			if (monster.mname == "Yacuruna")
			{game.nextPlace1= "endYacuruna";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
			
			else if (monster.mname == "Bufeo Colorado")
			{game.nextPlace1= "finalBufeo";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
			
			else if (monster.mname == "Chullachaqui")
			{game.nextPlace1= "loseFinal";
			game.nextPlace2= "";
			game.nextPlace3= "";
			game.nextPlace4= "";
			}
			
		}
	}	

	public void win()
	{
		//Previous method implemented
		//		ui.mainTextArea.setText("You've survived the " + monster.mname + ", which runs away to hide and rest.\n\nHe drops one of the weapons he was carrying.\n\n(You've obtained an Axe)");
	
		//Now substituted by the polymorphist method
		letsHear(new Weapon_Axe());
		
		player.currentWeapon = new Weapon_Axe();
		ui.weaponNameLabel.setText(player.currentWeapon.name);
		
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		if (monster.mname == "Yacuruna")
		{game.nextPlace1= "forest";
		game.nextPlace2= "";
		game.nextPlace3= "";
		game.nextPlace4= "";
		}
		
	}
		
	public void endYacuruna()
	{
		ui.mainTextArea.setText("The Yacuruna has defeated you. You are prepared for you death, but he takes you hand and takes you with him to the bottom of the river. You see a lot of pink dolphins, mermaids, and a lot of animals such as anacondas or turtles. It's the kingdom of the river, and they brought you here to purify your soul and eventually become one of them\n\nGAME OVER");
		
		ui.choice1.setText("Restart the game");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");

		game.nextPlace1= "title";
		game.nextPlace2= "";
		game.nextPlace3= "";
		game.nextPlace4= "";
	}	
	
	public void forest()
	{
		ui.mainTextArea.setText("A boat comes to your rescue. It's the people from the original boat, who take you to a nearby village so you can rest. After some hours, at the evening, you decide to go out. There is a celebration, and you decide to go there.\nWhat do you do?");
		ui.choice1.setText("Ask about the celebration");
		ui.choice2.setText("Join the celebration");
		ui.choice3.setText("Talk to someone");
		ui.choice4.setText("Eat something");
		
		game.nextPlace1 = "party";
		game.nextPlace2 = "shunto";
		game.nextPlace3 = "conversation";
		game.nextPlace4 = "juane";
	}	
	
	public void forestno()
	{
		ui.mainTextArea.setText("You are in the party in the village.\nWhat do you do?");
		ui.choice1.setText("Ask about the celebration");
		ui.choice2.setText("Join the celebration");
		ui.choice3.setText("Talk to someone");
		ui.choice4.setText("Eat something");
		
		game.nextPlace1 = "party";
		game.nextPlace2 = "shunto";
		game.nextPlace3 = "conversation";
		game.nextPlace4 = "juane";
	}	
	
	public void shunto()
	{
		ui.mainTextArea.setText("You join the celebration of San Juan Fest. One of the locals grabs you and takes you with her to jump the shunto. The story is true, after all, you feel how your soul grows stronger.\n\n(You've recovered 4 HP)");
		
		player.hp = player.hp + 4;
		ui.hpNumberLabel.setText("" + player.hp);
		
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "forestno";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void conversation()
	{
		ui.mainTextArea.setText("One of the guests in the party aproaches you and starts talking. She is wearing a night dress and a hat, unlike all the other people in the party. She seems to be a foreigner, and yet she knows a lot about the jungle. You tell her about the Yacuruna, and she seems worried about it. You ask her what's going on, and she tells you that you might be cursed.\nWhat would you like to do?");
		
		ui.choice1.setText("Ask for more information");
		ui.choice2.setText("Ignore her");
		ui.choice3.setText("Follow her");
		ui.choice4.setText("Talk about her");
		
		game.nextPlace1 = "seduce";
		game.nextPlace2 = "jungle";
		game.nextPlace3 = "seduce";
		game.nextPlace4 = "finalBufeoFirst";
	}	
	
	public void juane()
	{
		ui.mainTextArea.setText("A local gives you some regional food. You see just big leaves in a weird shape. The local explains that it represents the head of the apostle John being cut. You are a bit freaked out, but he opens the leaves and you see some yellow rice. You try it, and it is really delicious!\n\n(You've recovered 3 HP)");
		
		player.hp = player.hp + 3;
		ui.hpNumberLabel.setText("" + player.hp);
		
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "forestno";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void party()
	{
		ui.mainTextArea.setText("You ask about this celebration. It's the San Juan fest, celebrated each June 24 to commemorate the death the the apostle John. People jump campfires called 'shuntos' in order to purify their souls, and eat a regional dish called 'juane'.");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "forestno";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void seduce()
	{
		monster = new Monster_Bufeo();
		
		ui.mainTextArea.setText("While you follow her to her house, she tells you more about the curse. She says that you will be in a lot of danger unless it's cured right away.\nSuddenly you realize that you are far from the village, and there isn't any house around. You stop walking, but she insists you to follow her.\n A story pops up in your head, and you now realize who she is: the mythical Bufeo Colorado\nWhat do you do?");
		ui.choice1.setText("Fight");
		ui.choice2.setText("Run away");
		ui.choice3.setText("Wait");
		ui.choice4.setText("Give up");
		
		game.nextPlace1 = "playerAttack";
		game.nextPlace2 = "jungle";
		game.nextPlace3 = "bufeoSecond";
		game.nextPlace4 = "finalBufeo";
	}
	
	public void finalBufeoFirst()
	{
		ui.mainTextArea.setText("You ask the woman about herself, but she doesn't really know how to answer your questions, like where she is from. You continue asking, until she gets nervous and tried to escape, but her hat falls. Then all the people in the party see her transforming into a bufeo colorado. The people capture the creature, and the shaman of the village cures you as a way of thanking you. Congratulations! You are free.\nGAME OVER");
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void bufeoSecond()
	{
		//method with polymorphism
		letsHear(new Weapon_Spell());
		
		player.currentWeapon = new Weapon_Spell();
			//		ui.mainTextArea.setText("The bufeo tries to attack, but she gets confused and falls. Her hat falls as well, and she transforms into a pink dolphin. She is dying, so you help her get into the river again. Thankful, she apologizes for her behavior and teaches you a spell to keep you safe from any danger, besides curing you from your wounds.\n(You've obtained a magic spell)\n(You've recovered 30 HP)");            
		ui.weaponNameLabel.setText(player.currentWeapon.name);
		
		player.hp = player.hp + 30;
		ui.hpNumberLabel.setText("" + player.hp);
		
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "jungle";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void finalBufeo()
	{
		ui.mainTextArea.setText("The bufeo takes you with her to the shore of the river. She gets in, and she finally reveals her true form. She drags you into the river, and you see a magical world down there. Before you can even realize, you are not even a human anymore: now you are a bufeo, as you'll live you whole life as the mythical creatures you've always admired.\n\nGAME OVER");
		ui.choice1.setText("Restart game");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "wakeUp";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}
	
	public void jungle()
	{
		ui.mainTextArea.setText("After this event, you go for a walk, and you realize that you are now lost in the middle of the jungle. You scream for hours looking for someone. Finally, you find the captain of the boat looking for you. He tells you to follow him to get back to the village.");
		ui.choice1.setText("Follow him");
		ui.choice2.setText("Look at him");
		ui.choice3.setText("Tell him about your adventures");
		ui.choice4.setText("Ask him to follow you");
		
		game.nextPlace1 = "deepForest";
		game.nextPlace2 = "finalBoss";
		game.nextPlace3 = "finalHappy";
		game.nextPlace4 = "finalEscape";
	}
	
	public void deepForest()
	{
		ui.mainTextArea.setText("You follow the captain, but there are a lot of plants on the ground and you hurt your legs. You find it extrange that he has no problems with it. You look at his leg, and then you realize that he has a goat leg. This is not the captain.\n(You've lost 10)");
		
		player.hp = player.hp - 10;
		ui.hpNumberLabel.setText("" + player.hp);
		
		ui.choice1.setText("Continue");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "finalBoss";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void finalBoss()
	{
		monster = new Monster_Chullachaqui(); 
		
		ui.mainTextArea.setText("You take a look again at the Captain's leg: it's a goat's leg. You suddenly remember the legend. The creature that morphs into someone you know, but the transformation it's never complete. This is the Chullachaqui, the guardian of the whole jungle! You've better be prepared.\n" + monster.attackPhrase + "\nWhat do you do?");
		ui.choice1.setText("Fight");
		ui.choice2.setText("Run Away");
		ui.choice3.setText("Wait");
		ui.choice4.setText("Give Up");
		
		game.nextPlace1 = "playerAttack";
		game.nextPlace2 = "sadFinal";
		game.nextPlace3 = "monsterAttack";
		game.nextPlace4 = "loseFinal";
	}	
	
	public void finalHappy()
	{
		ui.mainTextArea.setText("The Captain hears you, but you realize it wasn't the Captain after all. It was the Chullachaqui, trying to punish you. But he sees through you, and he knows you don't want to hurt the forest. As an apology, he calls all the creatures of the jungle and offers you the most amazing show you've ever seen, impossible to describe. Then he returns you to the village, and although nobody believes you, your eyes will never forget what they saw.\nGAME OVER");
		ui.choice1.setText("Restart");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void finalEscape()
	{
		ui.mainTextArea.setText("The Captain gives you a strange look, since what you say doesn't make sense. But anyway, he follows you through the forest. Almost at dawn you find the village. The first person you see is the Captain looking for you. You turn around, and the other Captain is not there... It was the Chullachaqui, and you've survived.\nGAME OVER");
		ui.choice1.setText("Restart");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	
	public void loseFinal()
	{
		ui.mainTextArea.setText("The chullachaqui has defeated you. He explains to you that he must protect the jungle at all costs, and some day you will discover its wonders as well. To help you with that, he casts a spell on you. You slowly morph into a tree, and you will now dedicate your life to witness the wonders of the nature.\n\nGAME OVER");
		ui.choice1.setText("Restart");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void sadFinal()
	{
		ui.mainTextArea.setText("You escape from the Chullachaqui... but you are already lost in the jungle, and you never get to find your way out. You don't die, since the jungle takes you as a son. The mother Nature provides food and support, and you defend it in return. Eventually, you start to change, not only inside, but also outside. You care about the jungle, and feel part of it. Without even noticing, you've become the next protector of the jungle, the next Chullachaqui.\nGAME OVER");
		ui.choice1.setText("Restart");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	public void finalChullachaqui()
	{
		ui.mainTextArea.setText("The Chullachaqui still wants to fights, but then you both hear the voices of some people: those are the villagers, who came to your rescue. They the chullachaqui runs away, and they rescue you. You now live your whole life as a legend, one of the few people who was able to survive the chuallachaqui and can tell everyone about it.\nGAME OVER");
		ui.choice1.setText("Restart");
		ui.choice2.setText("");
		ui.choice3.setText("");
		ui.choice4.setText("");
		
		game.nextPlace1 = "title";
		game.nextPlace2 = "";
		game.nextPlace3 = "";
		game.nextPlace4 = "";
	}	
	
	//Here I am calling the defaultSetUp so we can restart the original values
	public void title()
	{
		defaultSetUp();
		vm.showTitleScreen();
	}
 
}
