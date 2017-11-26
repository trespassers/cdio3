package gr_34.controller;

import java.awt.Color;

import gr_34.boundary.Spillebræt;
import gr_34.entity.Brik;
import gr_34.entity.Konto;
import gr_34.entity.Spiller;
import gr_34.entity.Spillerliste;

public class Controller {
	private Spillerliste spillerliste;
	private Spillebræt spillebræt;

	public Controller() {
		spillebræt = new Spillebræt();
	}
	
	public void spilkontrol() {
		spillebræt.sendBesked("Velkommen til Monopoly Junior!!");
		int antalSpillere = spillebræt.hentAntalSpillere();
		spillerliste = new Spillerliste(antalSpillere);
		for(int i = 0; i < antalSpillere; i++) {
			int startBeløb;
			if (antalSpillere == 2)
				startBeløb = 20;
			else if (antalSpillere == 3)
				startBeløb = 18;
			else
				startBeløb = 16;
			
			String navn = spillebræt.hentNavn();
			int alder = spillebræt.hentAlder();
			int farve = spillebræt.hentBilfarve();
			
			Color farve1;
			Color farve2;
			if (farve == 1) {
				farve1 = Color.BLUE;
				farve2 = Color.cyan;

			} else if (farve == 2) {
				farve1 = Color.RED;
				farve2 = Color.black;

			} else if (farve == 3) {
				farve1 = Color.YELLOW;
				farve2 = Color.orange;

			} else {
				farve1 = Color.GREEN;
				farve2 = Color.white;
			}
			
			Spiller spiller = new Spiller(navn, alder, new Konto(startBeløb), new Brik(farve1, farve2));
			spillerliste.tilføjSpiller(spiller, i);
		}
	}
}