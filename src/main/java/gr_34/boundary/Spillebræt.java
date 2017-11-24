package gr_34.boundary;

import java.awt.Color;

import gr_34.controller.Felter;
import gr_34.entity.Felt;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

/**
 * Opretter spillebrættet med felter for monopoly
 * 
 * @author Sebastian
 *
 */
public class Spillebræt {
	private GUI_Field[] felter;

	public Spillebræt() {
		felter = new GUI_Field[24];
		felter[0] = new GUI_Start();
		felter[0].setTitle("Start");
		felter[0].setDescription("Spillerstart");

		felter[1] = new GUI_Street();
		felter[1].setTitle("Burgerbaren");
		((GUI_Street) felter[1]).setRent("1");
		felter[1].setBackGroundColor(Color.DARK_GRAY);

		felter[2] = new GUI_Street();
		felter[2].setTitle("Pizzahuset");
		felter[2].setRent(1);
		felter[2].setBackGroundColor(Color.DARK_GRAY);

		felter[3] = new GUI_Street();
		felter[3].setTitle("Chance");
		felter[3].setDescription("Chance");

		felter[4] = new GUI_Street();
		felter[4].setTitle("Slikbutikken");
		felter[4].setRent(1);
		felter[4].setBackGroundColor(Color.CYAN);


		felter[5] = new GUI_Street();
		felter[5].setTitle("Iskiosken");
		felter[5].setRent(1);
		felter[5].setBackGroundColor(Color.CYAN);

		felter[6] = new GUI_Street();
		felter[6].setTitle("I fængsel");
		felter[6].setDescription("På besøg");

		felter[7] = new GUI_Street();
		felter[7].setTitle("Museet");
		felter[7].setRent(2);
		felter[7].setBackGroundColor(Color.PINK);

		felter[8] = new GUI_Street();
		felter[8].setTitle("Biblioteket");
		felter[8].setRent(2);
		felter[8].setBackGroundColor(Color.PINK);

		felter[9] = new GUI_Street();
		felter[9].setTitle("Chance");
		felter[9].setDescription("Chance");

		felter[10] = new GUI_Street();
		felter[10].setTitle("Skaterparken");
		felter[10].setRent(2);
		felter[10].setBackGroundColor(Color.ORANGE);


		felter[11] = new GUI_Street();
		felter[11].setTitle("Swimmingpoolen");
		felter[11].setRent(2);
		felter[11].setBackGroundColor(Color.ORANGE);

		felter[12] = new GUI_Street();
		felter[12].setTitle("Parkeringsplads");
		felter[12].setDescription("Gratis parkering");

		felter[13] = new GUI_Street();
		felter[13].setTitle("Spillehallen");
		felter[13].setRent(3);
		felter[13].setBackGroundColor(Color.RED);


		felter[14] = new GUI_Street();
		felter[14].setTitle("Biografen");
		felter[14].setRent(3);
		felter[14].setBackGroundColor(Color.RED);

		felter[15] = new GUI_Street();
		felter[15].setTitle("Chance");
		felter[15].setDescription("Chance");

		felter[16] = new GUI_Street();
		felter[16].setTitle("Legetøjsbutikken");
		felter[16].setRent(3);
		felter[16].setBackGroundColor(Color.YELLOW);

		felter[17] = new GUI_Street();
		felter[17].setTitle("Dyrehandlen");
		felter[17].setRent(3);
		felter[17].setBackGroundColor(Color.YELLOW);

		felter[18] = new GUI_Street();
		felter[18].setTitle("Gå i fængsel");
		felter[18].setDescription("Ryk direkte i fængsel");

		felter[19] = new GUI_Street();
		felter[19].setTitle("Bowlinghallen");
		felter[19].setRent(4);
		felter[19].setBackGroundColor(Color.GREEN);

		felter[20] = new GUI_Street();
		felter[20].setTitle("Zoo");
		felter[20].setRent(4);
		felter[20].setBackGroundColor(Color.GREEN);

		felter[21] = new GUI_Street();
		felter[21].setTitle("Chance");
		felter[21].setDescription("Chance");

		felter[22] = new GUI_Street();
		felter[22].setTitle("Vandlandet");
		felter[22].setRent(5);
		felter[22].setBackGroundColor(Color.BLUE);

		felter[23] = new GUI_Street();
		felter[23].setTitle("Strandpromenaden");
		felter[23].setRent(5);
		felter[23].setBackGroundColor(Color.BLUE);
			
		}

	}

