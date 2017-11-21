package gr_34.boundary;

import java.awt.Color;
import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
/**
 * Opretter spillebrættet for monopoly
 * @author Sebastian
 *
 */
public class Spillebræt {
	
	public Spillebræt() {
		GUI_Field[] felter;
		felter = new GUI_Field[24];
		felter[0] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[1] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[2] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[3] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[4] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[5] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[6] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[7] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[8] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[9] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[10] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[11] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[12] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[13] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[14] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[15] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[16] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[17] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[18] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[19] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[20] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[21] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[22] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		felter[23] = new GUI_Field(Color.white, Color.BLUE, "Hej", "hej","hej") {};
		new GUI_Board(felter);
	}
}
