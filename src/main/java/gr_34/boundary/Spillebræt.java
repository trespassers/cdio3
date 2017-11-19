package gr_34.boundary;

import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
/**
 * Opretter spillebrættet for monopoly
 * @author Sebastian
 *
 */
public class Spillebræt {
	public Spillebræt() {
		GUI_Field[] felter = new GUI_Field[0];
		GUI_Board bræt = new GUI_Board(felter);
		
	}
}
