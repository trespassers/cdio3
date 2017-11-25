package gr_34.controller;
import java.awt.Color;
import gr_34.entity.Felt;

/**
 * 
 * @author David
 *
 */

public class Felter {


	public static Felt[] getFelter() {

		Felt[] felter = new Felt[4];
		felter[0] = new Felt();
		felter[0].setTitel("Start");
		felter[0].setPris(-1);
		felter[0].setBeskrivelse("Spillerstart");

		felter[1] = new Felt();
		felter[1].setTitel("Burgerbaren");
		felter[1].setPris(1);
		felter[1].setFarve(Color.DARK_GRAY);

		felter[2] = new Felt();
		felter[2].setTitel("Pizzahuset");
		felter[2].setPris(1);
		felter[2].setFarve(Color.DARK_GRAY);

		felter[3] = new Felt();
		felter[3].setTitel("Chance");
		felter[3].setPris(-1);
		felter[3].setBeskrivelse("Chance");

		felter[4] = new Felt();
		felter[4].setTitel("Slikbutikken");
		felter[4].setPris(1);
		felter[4].setFarve(Color.CYAN);


		felter[5] = new Felt();
		felter[5].setTitel("Iskiosken");
		felter[5].setPris(1);
		felter[5].setFarve(Color.CYAN);

		felter[6] = new Felt();
		felter[6].setTitel("I fængsel");
		felter[3].setPris(-1);
		felter[6].setBeskrivelse("På besøg");

		felter[7] = new Felt();
		felter[7].setTitel("Museet");
		felter[7].setPris(2);
		felter[7].setFarve(Color.PINK);

		felter[8] = new Felt();
		felter[8].setTitel("Biblioteket");
		felter[8].setPris(2);
		felter[8].setFarve(Color.PINK);

		felter[9] = new Felt();
		felter[9].setTitel("Chance");
		felter[3].setPris(-1);
		felter[9].setBeskrivelse("Chance");

		felter[10] = new Felt();
		felter[10].setTitel("Skaterparken");
		felter[10].setPris(2);
		felter[10].setFarve(Color.ORANGE);


		felter[11] = new Felt();
		felter[11].setTitel("Swimmingpoolen");
		felter[11].setPris(2);
		felter[11].setFarve(Color.ORANGE);

		felter[12] = new Felt();
		felter[12].setTitel("Parkeringsplads");
		felter[12].setBeskrivelse("Gratis parkering");

		felter[13] = new Felt();
		felter[13].setTitel("Spillehallen");
		felter[13].setPris(3);
		felter[13].setFarve(Color.RED);


		felter[14] = new Felt();
		felter[14].setTitel("Biografen");
		felter[14].setPris(3);
		felter[14].setFarve(Color.RED);

		felter[15] = new Felt();
		felter[15].setTitel("Chance");
		felter[3].setPris(-1);
		felter[15].setBeskrivelse("Chance");

		felter[16] = new Felt();
		felter[16].setTitel("Legetøjsbutikken");
		felter[16].setPris(3);
		felter[16].setFarve(Color.YELLOW);

		felter[17] = new Felt();
		felter[17].setTitel("Dyrehandlen");
		felter[17].setPris(3);
		felter[17].setFarve(Color.YELLOW);

		felter[18] = new Felt();
		felter[18].setTitel("Gå i fængsel");
		felter[3].setPris(-1);
		felter[18].setBeskrivelse("Ryk direkte i fængsel");

		felter[19] = new Felt();
		felter[19].setTitel("Bowlinghallen");
		felter[19].setPris(4);
		felter[19].setFarve(Color.GREEN);

		felter[20] = new Felt();
		felter[20].setTitel("Zoo");
		felter[20].setPris(4);
		felter[20].setFarve(Color.GREEN);

		felter[21] = new Felt();
		felter[21].setTitel("Chance");
		felter[3].setPris(-1);
		felter[21].setBeskrivelse("Chance");

		felter[22] = new Felt();
		felter[22].setTitel("Vandlandet");
		felter[22].setPris(5);
		felter[22].setFarve(Color.BLUE);

		felter[23] = new Felt();
		felter[23].setTitel("Strandpromenaden");
		felter[23].setPris(5);
		felter[23].setFarve(Color.BLUE);

		return felter;
	}
}