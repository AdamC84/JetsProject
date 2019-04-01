package com.skillsdistillery.jet.models;

public class FighterJet extends Jet {

	private int weaponPkgWeight;



	public FighterJet(String classname, String model, int speed, int range, long price, int weaponPkgWeight) {
		super(classname, model, speed, range, price);
		this.weaponPkgWeight = weaponPkgWeight;
	}
	



	public int getWeaponPkgWeight() {
		return weaponPkgWeight;
	}




	public void setWeaponPkgWeight(int weaponPkgWeight) {
		this.weaponPkgWeight = weaponPkgWeight;
	}




	public void fightMode() {
		System.out.println(getModel() +"   DIE COMMIE BASTARD!!");
		System.out.println("MERICA!!");
	}




	@Override
	public String toString() {
		return  getClassName() + ", Model: " + getModel() + ", Speed " + getSpeed() + ", Range: " + getRange() + ", Price: " + getPrice() + ", " + " Weapon Package Weight: " + weaponPkgWeight + ", time they can fly: " + (getRange() / getSpeed() + " hour(s) ");
	}
	

}
