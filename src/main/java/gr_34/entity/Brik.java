package gr_34.entity;

import java.awt.Color;

import gui_fields.GUI_Car;
import gui_fields.GUI_Car.Pattern;
import gui_fields.GUI_Car.Type;

public class Brik {
	private GUI_Car brik;
	
	public Brik(Color farve1, Color farve2) {
		brik = new GUI_Car(farve1, farve2, Type.CAR, Pattern.CHECKERED);
	}

	public GUI_Car getBrik() {
		return brik;
	}

	public void setBrik(GUI_Car brik) {
		this.brik = brik;
	}
}
