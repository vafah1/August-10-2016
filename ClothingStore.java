package com.objectdesign;

import java.util.Scanner;

public class ClothingStore {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String userInput = null;
		boolean userFailed = false;
		int numberInput= 0;

		SportsJerseys newJersey= new SportsJerseys();

		System.out.println("Welcome to the Jersey Store!");
		System.out.println("Pick your squad and let's create you custom jersey!");


		do {
			System.out.println("Please select your sport");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setSport(userInput);

		do {
			System.out.println("Please select your team");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setTeam(userInput);

		do {
			System.out.println("Which team logo would you prefer?");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setTeamLogo(userInput);

		do {
			System.out.println("What's size would you like?");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setSize(userInput);

		do {
			System.out.println("Please select the fabric type you prefer");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setFabric(userInput);

		do {
			System.out.println("What sleeve length would you prefer?");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setSleeveLength(userInput);

		do {
			System.out.println("Please input the name you want on your jersey");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setNameOnBack(userInput);

		do {
			System.out.println("Please select your primary color");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setPrimaryColor(userInput);

		do {
			System.out.println("Please select your secondary color");
			userInput = sc.nextLine();

		} while (userFailed);
		newJersey.setSecondaryColor(userInput);

		do {
			System.out.println("Please input your jersey number");
			userInput = sc.nextLine();
			userFailed = numberIsValid(userInput);

		} while (userFailed);
		numberInput = Integer.parseInt(userInput);
		newJersey.setNumberOnBack(numberInput);
		
		System.out.println(newJersey.toString());

	}

	private static boolean numberIsValid(String userInput) {

		try {
			int aNumber = Integer.parseInt(userInput);
			return false;

		} catch (NumberFormatException e) {
			return true;
		}

	}
}
