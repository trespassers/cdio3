package gr_34.controller;

import gr_34.boundary.TUI;
import gr_34.entity.Spillerliste;

public class Controller {
	private Spillerliste spillerliste;

	public Controller() {
		spillerliste = new Spillerliste();
	}
	
	public void spilkontrol(int antalSpillere) {
		TUI.println("Velkommen til Monopoly Junior!!");
		TUI.print("\t\n");
		TUI.println("*******************************");
		TUI.print("\t\n");
		spillerliste.tilføjSpiller(antalSpillere);
		
	}
}
