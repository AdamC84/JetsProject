package com.skillsdistillery.jet.models;

public class CargoJet extends Jet {

	private int cargoVolume;

	public CargoJet() {
	}

	public CargoJet(String className, String jetName, int cargoVolume, int jetRange, long jetPrice, int jetCargoVolume) {
		super();
		this.cargoVolume = cargoVolume;
	}

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
				+ "And then bury me in the leaning rest\n" + "\n" + "Well if I die on a Chinese hill\n"
				+ "Take my watch or the commies will\n" + "But if I die in the Korean mud\n"
				+ "Bury me with a case of Bud");
	}
}
