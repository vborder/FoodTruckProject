package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApplication {

//		Grading:
		
//		There are no static methods other than the one main method.
		
//		When a FoodTruck is created, its constructor assigns its id field the 
//		current value of a static field, then increments the static field.
		
//		The user can input up to five food trucks. [COMPLETED]
//		
//		The user can stop inputing trucks before entering five by entering quit as 
//		the truck name, after which all input stops and the program continues. [COMPLETED]
//		
//		When a menu item is chosen the list of all trucks entered is displayed. If 
//		less than five were input, only those trucks that were created are displayed. [COMPLETED]
//		
//		When another menu item is chosen the average rating based on the number of 
//		trucks entered is displayed.
//		
//		When another menu item is chosen the winning truck - the one that was input
//		with the highest rating - is displayed with all its properties. [COMPLETED]
//		
//		Food trucks are displayed by printing its toString, which includes all FoodTruck fields. [COMPLETED]
//		
//		When the quit menu item is chosen, the program ends with a message. [COMPLETED]
	
	private static int MAX_Trucks = 5;
	FoodTruck[] ftArray = new FoodTruck[MAX_Trucks];
	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		FoodTruckApplication ftApp = new FoodTruckApplication();
		ftApp.createTrucks();
		ftApp.printMenu();
	}
	public void createTrucks() {
		System.out.println("Welcome to the MobileBites App!");
//		System.out.print("How many food trucks would you like to enter? Enter up"
//				+ " to 5: ");
//		int arr = kb.nextInt();
		
		for(int i = 0; i < ftArray.length; i++) {
			System.out.println("Enter the name of the truck food, or enter \"quit\" to "
					+ "see the menu: ");
			String ftName = kb.next();
			
			if(ftName.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println("Enter the food type: ");
			String foodType = kb.next();
			
			System.out.println("Enter a rating for the truck, from 1 (lowest) to 5: ");
			int rating = kb.nextInt();
			
			ftArray[i] = new FoodTruck();
			ftArray[i].setName(ftName);
			ftArray[i].setFoodType(foodType);
			ftArray[i].setRating(rating);
			ftArray[i].setNumericId(i + 1);
		}
	}
	public void printMenu() {
		int menuSel = 0;
		do {
			
			System.out.println("------------------MENU-------------------");
			System.out.println("        Select a menu item (number)      ");
			System.out.println("1: List all existing food trucks.");
			System.out.println("2: See the average rating of food trucks.");
			System.out.println("3: Display the highest-rated food truck.");
			System.out.println("4: Quit the program.");
			menuSel = kb.nextInt();
			switch(menuSel) {
			case 1: 
				displayTrucks();
				break;
			case 2: 
				ftRating();
				break;
			case 3:
				ftHighestRating();
				break;
			case 4: 
				System.out.println("Come back soon!");
				System.exit(0);
			}	
			
		} while (menuSel != 4);
	}
	public void displayTrucks() {
//	 display the array of food trucks that were created in the for loop createTrucks[] method
		for (int i = 0; i < ftArray.length; i++) {
			if(ftArray[i] != null) {
				System.out.println(ftArray[i].toString());
			}
		}
	}
	
	public void ftRating() {
		double totalRating = 0.0;
		for (int i = 0; i < ftArray.length; i++) {
		totalRating += ftArray[i].getRating();
		}
		
//	int avgRating = totalRating / ftArray.length;
	}
	
//	public void ftAverage() {
//		
//	}
	
	public void ftHighestRating() {
		FoodTruck hTruck = ftArray[0];
		for(int i = 0; i < ftArray.length; i++) {
			if(ftArray[i] != null) {
				if (hTruck.getRating() < ftArray[i].getRating()) {
					hTruck = ftArray[i];
				}
			}
		}
		System.out.println(hTruck);
	}
		
}