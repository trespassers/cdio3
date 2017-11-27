package gr_34.entity;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Car.Pattern;
import gui_fields.GUI_Car.Type;

/**
 * @author Burhan 
 * @author Alan
 *
 */
public class Brik {
	private GUI_Car brik;
	private Color farve1;
	
	public Brik(Color farve1, Color farve2) { 
		this.farve1 = farve1;
		brik = new GUI_Car(farve1, farve2, Type.CAR, Pattern.CHECKERED);
	}

	public GUI_Car getCar() {
		return brik;
	}

	public void setBrik(GUI_Car brik) {
		this.brik = brik;
	}

	public String toString() {
		return farve1 + " Bil";
	}
	
}
