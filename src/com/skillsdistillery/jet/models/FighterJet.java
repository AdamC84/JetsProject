package com.skillsdistillery.jet.models;

public class FighterJet extends Jet implements Fighter {

	private int weaponPkgWeight;



	public FighterJet(String classname, String model, int speed, int range, long price, int weaponPkgWeight) {
		super(classname, model, speed, range, price);
		this.weaponPkgWeight = weaponPkgWeight;
	}
	



	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.Fighter#getWeaponPkgWeight()
	 */
	@Override
	public int getWeaponPkgWeight() {
		return weaponPkgWeight;
	}




	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.Fighter#setWeaponPkgWeight(int)
	 */
	@Override
	public void setWeaponPkgWeight(int weaponPkgWeight) {
		this.weaponPkgWeight = weaponPkgWeight;
	}




	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.Fighter#fightMode()
	 */
	@Override
	public void fightMode() {
		System.out.println(getModel() +"   DIE COMMIE BASTARD!!");
		System.out.println("MERICA!!");
	}




	@Override
	public String toString() {
		return  getClassName() + ", Model: " + getModel() + ", Speed " + getSpeed() + ", Range: " + getRange() + ", Price: " + getPrice() + ", " + " Weapon Package Weight: " + weaponPkgWeight + ", time they can fly: " + (getRange() / getSpeed() + " hour(s) ");
	}
	

}
