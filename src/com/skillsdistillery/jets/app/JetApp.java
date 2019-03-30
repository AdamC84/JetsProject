package com.skillsdistillery.jets.app;

import java.util.Scanner;

import com.skillsdistillery.jet.models.Airfield;
import com.skillsdistillery.jet.models.CargoJet;
import com.skillsdistillery.jet.models.FighterJet;
import com.skillsdistillery.jet.models.Jet;

public class JetApp {

	private Airfield airfield;

	public static void main(String[] args) {
		JetApp ja = new JetApp();
		ja.run();
	}

	public void run() {
		displayUserMenu();

	}

	public int displayUserMenu() {
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
			input = kb.nextInt();
			return input;

	public void runMethods(int input) {

			switch (input) {
			case 1:
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
				break;
			case 6:

				break;
			case 7:
//				addJet();
				break;
			case 8:
//				removeJet();
				break;
			case 9:
				System.out.println("God Speed!");
				listPower = false;
				break;
			default:
				System.out.println("That was not the proper selection, try again.");
				break;
			}

	}while(listPower);kb.close();


}
