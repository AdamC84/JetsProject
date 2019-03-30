package com.skillsdistillery.jet.models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {

	public void AirField() {
		loadAirfield("initialData.txt");

	}

	List<Jet> jetList = new ArrayList<>();

	public void loadAirfield(String fileName) {

		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] stringLine = line.split(", ");
				sortJets(stringLine);

			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Problem while reading " + fileName + ": " + e.getMessage());
		}

	}

	public void sortJets(String[] jets) {

		if (jets[0].equalsIgnoreCase("CargoPlane")) {
			String className = jets[0];
			String jetName = jets[1];
			int jetSpeed = Integer.parseInt(jets[2]);
			int jetRange = Integer.parseInt(jets[3]);
			long jetPrice = Long.parseLong(jets[4]);
			int jetCargoVolume = Integer.parseInt(jets[5]);
			CargoJet cj = new CargoJet(className, jetName, jetSpeed, jetRange, jetPrice, jetCargoVolume);
			jetList.add(cj);
		} else if (jets[0].equalsIgnoreCase("FighterJet")) {
			String fclassName = jets[0];
			String fjetName = jets[1];
			int fjetSpeed = Integer.parseInt(jets[2]);
			int fjetRange = Integer.parseInt(jets[3]);
			long fjetPrice = Long.parseLong(jets[4]);
			int fjetWpnWeight = Integer.parseInt(jets[5]);
			FighterJet fj = new FighterJet(fclassName, fjetName, fjetSpeed, fjetRange, fjetPrice, fjetWpnWeight);
			jetList.add(fj);
		}

	}

	public void fastestJet() {
		int speed = 0;
		Jet newJet;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i).getSpeed() > speed) {
				newJet = jetList.get(i);
				speed = newJet.getSpeed();
			}

		}
	}

	public void longestRange() {
		int range = 0;
		Jet newJet;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i).getRange() > range) {
				newJet = jetList.get(i);
				range = newJet.getRange();
			}

		}
	}

	public void flyMethod() {
		Jet newJet;
		for (int i = 0; i < jetList.size(); i++) {
			newJet = jetList.get(i);
			System.out.println(newJet.getModel() + " " + newJet.getSpeed() + " " + newJet.getRange() + " "
					+ newJet.getPrice() + " " + "flying and doing plane type stuff");
		}
	}

}
