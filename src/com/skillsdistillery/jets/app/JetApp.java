package com.skillsdistillery.jets.app;

import java.util.Scanner;

import com.skillsdistillery.jet.models.Airfield;

public class JetApp {

	private Airfield airfield;

	public static void main(String[] args) {
		JetApp ja = new JetApp();
		ja.run();
	}

	public void run() {
		airfield = new Airfield();
		airfield.sortJets();
		displayUserMenu();

	}

	public void displayUserMenu() {
		Scanner kb = new Scanner(System.in);
		boolean listPower = true;
		int input;
		do {
			System.out.println("1. List fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit");
			System.out.print("Please enter a choice: ");
			try {
				input = kb.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("That was not a valid entry.");
				continue;
			}

			switch (input) {
			case 1:
				airfield.listJets();
				break;
			case 2:
				airfield.flyMethod();
				break;
			case 3:
				airfield.fastestJet();
				break;
			case 4:
				airfield.longestRange();
				break;
			case 5:
				airfield.loadAllCargoJets();
				break;
			case 6:
				airfield.dogFight();
				break;
			case 7:
				userAddJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				System.out.println("God Speed!");
				listPower = false;
				break;
			default:
				System.out.println("That was not the proper selection, try again.");
				break;
			}

		} while (listPower);
		kb.close();
	}

	public void userAddJet() {
		Scanner kb = new Scanner(System.in);
		String model;
		int speed, range, weaponPkgWeight, cargoWeight = 0;
		long price;
		System.out.println("What kind of jet would you like to create (Fighter or Cargo?");
		String choice = kb.nextLine();

		try {
			if (choice.equalsIgnoreCase("Fighter")) {
				System.out.println("Please enter the model: ");
				model = kb.next();
				System.out.println("Please enter the speed: ");
				speed = kb.nextInt();
				System.out.println("Please enter the range: ");
				range = kb.nextInt();
				System.out.println("Please enter the price: ");
				price = kb.nextLong();
				System.out.println("Please enter the weapon package weight: ");
				weaponPkgWeight = kb.nextInt();
				airfield.addFighterToList(model, speed, range, price, weaponPkgWeight);

			} else if (choice.equalsIgnoreCase("Cargo")) {
				System.out.println("Please enter the model: ");
				model = kb.next();
				System.out.println("Please enter the price: ");
				speed = kb.nextInt();
				System.out.println("Please enter the speed: ");
				range = kb.nextInt();
				System.out.println("Please enter the range: ");
				price = kb.nextLong();
				System.out.println("Please enter the cargo weight: ");
				weaponPkgWeight = kb.nextInt();
				airfield.addCargoJetToList(model, speed, range, price, cargoWeight);

			} else {
				System.out.println("Invalid type entered.");
			}
		} catch (Exception e) {
			System.out.println("Invalid Jet entry.");
		}
	}

	public void removeJet() {
		Scanner kb = new Scanner(System.in);
		int choice;
		airfield.listJets();
		System.out.println("Which number jet would you like to remove? ");
		try {
			choice = kb.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Jet not found.");
			return;
		}
		airfield.removeTheJet(choice);
	}
}
