package gr_34.controller;

import java.awt.Color;

import gr_34.entity.Felt;
import gui_main.GUI;

public class Felter {

	private Felt[] felter;

	public Felter() {



		felter = new Felt[4];
		felter[0] = new Felt();
		felter[0].setTitel("Start");
		felter[0].setPris(0);
		felter[0].setBeskrivelse("Spillerstart");

		felter[1] = new Felt();
		felter[1].setTitel("Burgerbaren");
		felter[1].setPris(1);
		felter[1].setFarve(Color.ORANGE);

		felter[2] = new Felt();
		felter[2].setTitel("Pizzahuset");
		felter[2].setPris(1);
		felter[2].setFarve(Color.ORANGE);

		felter[3] = new Felt();
		felter[3].setTitel("Chance");
		felter[3].setBeskrivelse("Chance");

		felter[4] = new Felt();
		felter[4].setTitel("Slikbutikken");
		felter[4].setPris(1);
		felter[4].setFarve(Color.BLUE);


		felter[5] = new Felt();
		felter[5].setTitel("Iskiosken");
		felter[5].setPris(1);
		felter[5].setFarve(Color.BLUE);

		felter[6] = new Felt();
		felter[6].setTitel("I fængsel");
		felter[6].setBeskrivelse("På besøg");

		felter[7] = new Felt();
		felter[7].setTitel("Museet");
		felter[7].setPris(2);
		felter[7].setFarve(Color.PINK);





		//GUI gui = new GUI(felter);
	}
}