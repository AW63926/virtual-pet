package com.adam.virtualpet;

import java.util.Scanner;

public class VirtualPet {
	Scanner input = new Scanner(System.in);
	private String dragonName;
	private String color;
	private int height;
	private int lenght;
	private int tickCount;
	private int treasureCount;
	private int welcomeCount;

	public VirtualPet(String dragonName, String color, int height, int lenght) {
		super();
		this.dragonName = dragonName;
		this.color = color;
		this.height = height;
		this.lenght = lenght;
	}

	public String getDragonName() {
		return dragonName;
	}

	public void setDragonName(String dragonName) {
		this.dragonName = dragonName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public boolean breatheFire() {
		tick(3);
		System.out.println("Hope somebody brought marshmallows!");
		System.out.println("RRRRRAAAAARRRRRRRRRGGGGGHHHH!!!!!!!");
		sleepTracker();
		// when method is called the dragon should breathe fire

		return true;
	}

	public boolean eat() {
		// When method is called the dragon should eat
		System.out.println("Time for a pizza!..Or 20...GULP!");
		this.tickCount -= 1;
		if (this.tickCount < 0) {
			this.tickCount = 0;
		}
		sleepTracker();
		return true;
	}

	public boolean fly() {
		// When this method is called the dragon should fly
		tick(2);
		System.out.println("I can see the whole world from up here!");
		sleepTracker();
		return true;
	}

	public boolean sleep() {
		System.out.println(".....zzzzzzz.......zzzzzz......zzzzzzzzzzzzzzz.......zzzzz");
		this.tickCount -= 3;
		int randNum = (int) (Math.random() * 5);
		if (this.tickCount < 0) {
			this.tickCount = 0;
		}
		if (randNum == 5) {
			System.out.println("My precious treasure!!! Its all gone!");
			this.treasureCount = 0;
		}

		else if (randNum == 4) {
			System.out.println("OH no! Someone stole from my pile of treasure!");
			this.treasureCount -= 4;
			if (this.treasureCount < 0) {
				this.treasureCount = 0;
			}
		} else if (randNum == 3) {
			System.out.println("I think someone has been in my cave!  I had better count my treasure!");
			this.treasureCount -= 1;
			if (this.treasureCount < 0) {
				this.treasureCount = 0;
			}
		}
		treasureTracker();
		sleepTracker();
		return true;
	}

	// increases tick count by number given
	public int tick(int number) {
		// Each time this method is called it will increase a tick counter
		this.tickCount += number;
		return this.tickCount;
	}

	// Treasure Hunt expends energy at different levels. returns t/f found/not found
	public boolean treasureHunt() {
		int randNum = (int) (Math.random() * 5);

		if (randNum <= 2) {
			tick(2);
			this.treasureCount += 4;
			System.out.println("You found a fortune!");
			sleepTracker();
			return true;
		} else if (randNum == 3) {
			tick(3);
			this.treasureCount += 2;
			System.out.println("You found some gold coins, not too shabby!");
			sleepTracker();
			return true;
		} else {
			tick(5);
			System.out.println("Oh NO!, This treasure hunt was a bust.");
			sleepTracker();
			return false;
		}

	}

	// Tracks energy level
	public void sleepTracker() {
		System.out.println("Energy left before nap: " + (10 - this.tickCount));
		if (this.tickCount >= 10) {
			System.out.println("Dragon has gone to sleep ");
			sleep();
		}
	}

	public void treasureTracker() {
		System.out.println("Lets see how much treasure Ive got.");
		int treasureTrack = this.treasureCount;
		switch (treasureTrack) {
		case 0:
			System.out.println("OH NO!!! Im broke!");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 1:
			System.out.println("Not much treasure to be found!  Only one gold coin lying on the ground");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 2:
			System.out.println("Ive got a few coins to rub together, but more treasure would be even better!");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 3:
			System.out.println("Movin on up!!  Now Im making money");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 4:
			System.out.println("I may need a bigger cave for all of this treasure");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 5:
			System.out.println("Does Porsche make anything in my size?");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		case 6:
			System.out.println("Get out of my way peasants!!");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;
		default:
			System.out.println("IM RICHHHHHHH!!!!!!!!!!!!!!");
			System.out.println("Treasure Level: " + this.treasureCount);
			break;

		}

	}

	public void welcome() {
		System.out.println("Welcome!");
		welcomeCount++;

	}

	public void printMenu() {
		System.out.println("**************************************************");
		System.out.println("Enter 1: To feed your Dargon");
		System.out.println("Enter 2: To make your Dragon fly");
		System.out.println("Enter 3: To make your Dragon breathe fire");
		System.out.println("Enter 4: To make your Dragon hunt for Treasure");
		System.out.println("Enter 5: To make your Dragon sleep");
		System.out.println("Enter 6: To count your Dragon's treasure");
		System.out.println("Enter 7: To print menu");
		System.out.println("Enter 8: To see your Dragon");
		System.out.println("Enter 9: To learn about your Dragon");
		System.out.println("Enter \"quit\" to exit");
		System.out.println("**************************************************");
	}

	// Gameplay####################################################################

	public void gamePLay() {
		if (welcomeCount == 0) {
			welcome();
			printMenu();
		}
		boolean menuLoop = true;
		while (menuLoop) {
			System.out.println("Enter a choice from the Menu to control your Dragon");
			String userInput = input.nextLine();
			switch (userInput.toLowerCase()) {
			case "1":
				eat();
				break;
			case "2":
				fly();
				break;
			case "3":
				breatheFire();
				break;
			case "4":
				treasureHunt();
				break;
			case "5":
				sleep();
				break;
			case "6":
				treasureTracker();
				break;
			case "7":
				printMenu();
				break;
			case "8":
				dragonArtTwo();
				dragonArtOne();
				break;
			case "9":
				tellMeAboutDragon();
				break;
			case "quit":
				menuLoop = false;
				System.exit(0);
			}

		}
	}

	public void tellMeAboutDragon() {
		System.out.println("Hello, my name is " + this.dragonName + ".  I am " + this.color + " and I am " + this.height
				+ " feet tall, and " + this.lenght + " feet long.\n"
				+ "I have big beautiful wings and I can Breathe Fire!, but I am a gentle dragon. ");
	}

	// ******************************************************************************
	// Dragon Graphic output

	public void dragonArtOne() {
		System.out.println(" ^___^");
		System.out.println(" |o--o|");
		System.out.println(" | .. |");
		System.out.println(" \\_O_/ ");
		System.out.println(" * HI *      ");
	}

	public void dragonArtTwo() {
		System.out.println(" ^___^");
		System.out.println(" |*--*|");
		System.out.println(" | .. |");
		System.out.println(" \\_-_/ ");

	}
}
