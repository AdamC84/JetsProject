package com.skillsdistillery.jet.models;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	List<Jet> jetList = new ArrayList<>();

//	public void AirField() {
//		loadAirfield("initialData.txt");
////		System.out.println(jetList);
//
//	}

//	public void loadAirfield(String fileName) {
//	}

	public void sortJets() {

		try {
			FileReader fr = new FileReader("initialData.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				String[] stringLine = line.split(", ");
//				sortJets(stringLine);
//				System.out.println(stringLine[0].toString());

//				System.out.println(jetList);

				if (stringLine[0].equals("CargoJet")) {
					String className = stringLine[0];
					String model = stringLine[1];
					int speed = Integer.parseInt(stringLine[2]);
					int range = Integer.parseInt(stringLine[3]);
					long price = Long.parseLong(stringLine[4]);
					int cargoVolume = Integer.parseInt(stringLine[5]);
					CargoJet cj = new CargoJet(className, model, speed, range, price, cargoVolume);
//					System.out.println(cargoVolume);
					jetList.add(cj);
//					System.out.println(jetList);
				} else if (stringLine[0].equals("FighterJet")) {
					String fclassName = stringLine[0];
					String fjetName = stringLine[1];
					int fjetSpeed = Integer.parseInt(stringLine[2]);
					int fjetRange = Integer.parseInt(stringLine[3]);
					long fjetPrice = Long.parseLong(stringLine[4]);
					int fjetWpnWeight = Integer.parseInt(stringLine[5]);
					FighterJet fj = new FighterJet(fclassName, fjetName, fjetSpeed, fjetRange, fjetPrice,
							fjetWpnWeight);
					jetList.add(fj);
				}

			}

			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Invalid filename: " + e.getMessage());
		} catch (IOException e) {
//			System.err.println("Problem while reading " + fileName + ": " + e.getMessage());
		}

	}

	public void fastestJet() {
		int speed = 0;
		Jet newJet = null;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i).getSpeed() > speed) {
				newJet = jetList.get(i);
				speed = newJet.getSpeed();
			}

		}
		System.out.println("The fastest Jet is: " + newJet);
	}

	public void longestRange() {
		int range = 0;
		Jet newJet = null;
		for (int i = 0; i < jetList.size(); i++) {
			if (jetList.get(i).getRange() > range) {
				newJet = jetList.get(i);
				range = newJet.getRange();
			}

		}
		System.out.println("The Jet with the longest range is: " + newJet);
	}

	public void flyMethod() {
		Jet newJet;
		for (Jet jet : jetList) {
			newJet = jet;
			System.out.println(newJet + " flying and doing Jetty things. ");

		}
	}

	@Override
	public String toString() {
		return "Airfield [jetList=" + jetList + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jetList == null) ? 0 : jetList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airfield other = (Airfield) obj;
		if (jetList == null) {
			if (other.jetList != null)
				return false;
		} else if (!jetList.equals(other.jetList))
			return false;
		return true;
	}

	public void listJets() {
		for (Jet jets : jetList) {
			System.out.println((jetList.indexOf(jets) + 1) + " " + jets);
		}
	}

	public void loadAllCargoJets() {
		for (Jet jets : jetList) {
			if (jets instanceof CargoJet) {
				((CargoJet) jets).loadCargo();
			}
		}
	}

	public void dogFight() {
		for (Jet jets : jetList) {
			if (jets instanceof FighterJet) {
				((FighterJet) jets).fightMode();
			}
		}

	}
	public void addFighterToList(String model, int speed, int range, long price, int weaponPkgWeight) {
		Jet newJet = new FighterJet("FighterJet", model, speed, range, price, weaponPkgWeight);
		jetList.add(newJet);
		
	}
	public void addCargoJetToList(String model, int speed, int range, long price, int cargoWeight) {
		Jet newJet = new FighterJet("CargoJet", model, speed, range, price, cargoWeight);
		jetList.add(newJet);
		
		
	}
	public void removeTheJet(int choice) {
		int remove = choice - 1;
		jetList.remove(remove);
	}

}
