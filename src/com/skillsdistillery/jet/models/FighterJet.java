package com.skillsdistillery.jet.models;

public class FighterJet extends Jet {

	private int weaponPkgWeight;


	public FighterJet(String fclassName, String fjetName, int weaponPkgWeight, int fjetRange, long fjetPrice, int fjetWpnWeight) {
		super();
		this.weaponPkgWeight = weaponPkgWeight;
	}

	public FighterJet() {

	}

	public int getWeaponPkgWeight() {
		return weaponPkgWeight;
	}

	public void setWeaponPkgWeight(int weaponPkgWeight) {
		this.weaponPkgWeight = weaponPkgWeight;
	}

	public void fightMode() {
		System.out.println("DIE COMMIE BASTARD!!");
		System.out.println("MERICA!!");
	}

}
