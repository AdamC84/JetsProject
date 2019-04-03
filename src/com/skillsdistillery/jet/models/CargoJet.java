package com.skillsdistillery.jet.models;

public class CargoJet extends Jet implements CargoCarrier {

	private int cargoVolume;

	public CargoJet() {
	}

	public CargoJet(String classname, String model, int speed, int range, long price, int cargoVolume) {
		super(classname, model, speed, range, price);
		this.cargoVolume = cargoVolume;
	}

	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.CargoCarrier#getCargoVolume()
	 */
	@Override
	public int getCargoVolume() {
		return cargoVolume;
	}

	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.CargoCarrier#setCargoVolume(int)
	 */
	@Override
	public void setCargoVolume(int cargoVolume) {
		this.cargoVolume = cargoVolume;
	}

	/* (non-Javadoc)
	 * @see com.skillsdistillery.jet.models.CargoCarrier#loadCargo()
	 */
	@Override
	public void loadCargo() {
		System.out.println("C-130 Rollin’ Down the Strip\n" + "C-130 rollin’ down the strip\n"
				+ "64 Rangers on a one-way trip\n" + "Mission Top Secret, destination unknown\n"
				+ "They don’t even know if they’re ever coming home\n" + "When my plane gets up so high\n"
				+ "Paratroopers take to the skies\n" + "\n" + "Stand up, hook up, shuffle to the door\n"
				+ "My knees got weak and I hit the floor\n" + "Jumpmaster picked me up with ease\n"
				+ "Tossed my knees into the breeze\n" + "\n"
				+ "Count one-thousand, two-thousand, three-thousand, four\n" + "My main opened with a mighty roar\n"
				+ "But if my main don’t open wide\n" + "I got a reserve by my side\n"
				+ "But if that one should fail me too\n" + "Look out below I’m a-comin’ through\n" + "\n"
				+ "If I die on the old drop zone\n" + "Box me up and ship me home\n" + "Pin my wings upon my chest\n"
				+ "And then bury me in the leaning rest\n" + "\n" + "Well if I die on a Big'ol hill\n"
				+ "Take my watch or the someone will\n" + "But if I die in the dark mud\n"
				+ "Bury me with a case of Bud");
	}

	@Override
	public String toString() {
		return getClassName() + ", Model: " + getModel() + ", Speed " + getSpeed() + ", Range: " + getRange() + ", Price: " + getPrice() + ", " + " Max Cargo Weight : " + cargoVolume + ", time they can fly: " + (getRange() / getSpeed() + " hour(s) ");
	}
	
}
