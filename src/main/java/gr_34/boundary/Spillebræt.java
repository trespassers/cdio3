package gr_34.boundary;

import java.awt.Color;

import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

/**
 * Opretter spillebrættet med felter for monopoly
 * @author Sebastian
 *
 */
public class Spillebræt {
	private GUI_Field[] felter;
	
	public Spillebræt() {
		felter = new GUI_Field[4];
		felter[0] = new GUI_Start();
		felter[0].setTitle("Start");
		felter[0].setSubText("Spillerstart");
		felter[0].setDescription("Spillerstart");
		
		felter[1] = new GUI_Street();
		felter[1].setTitle("Burgerbaren");
		felter[1].setSubText("M1");
		felter[1].setBackGroundColor(Color.ORANGE);
		
		felter[2] = new GUI_Street();
		felter[2].setTitle("Pizzahuset");
		felter[2].setSubText("M1");
		felter[2].setBackGroundColor(Color.ORANGE);
		
		felter[3] = new GUI_Street();
		felter[3].setTitle("Chance");
		felter[3].setDescription("Chance");
		
		felter[4] = new GUI_Street();
		felter[4].setTitle("Slikbutikken");
		felter[4].setSubText("M1");
		felter[4].setBackGroundColor(Color.BLUE);
		
		
		felter[5] = new GUI_Street();
		felter[5].setTitle("Iskiosken");
		felter[5].setSubText("M1");
		felter[5].setBackGroundColor(Color.BLUE);
		
		felter[6] = new GUI_Street();
		felter[6].);
		
		
		GUI gui = new GUI(felter);
		gui.setDice(2, 4);
	}
}
