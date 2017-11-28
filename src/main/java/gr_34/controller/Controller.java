package gr_34.controller;

import java.awt.Color;

import gr_34.boundary.Spillebræt;
import gr_34.entity.Brik;
import gr_34.entity.Konto;
import gr_34.entity.Spiller;
import gr_34.entity.Spillerliste;
import gr_34.entity.Terning;
import gr_34.spillogik.Spil;
import gui_fields.GUI_Player;

public class Controller {
	private Spillerliste spillerliste;
	private Spillebræt spillebræt;
	private Terning terning;
	private Spil spil;

	public Controller() {
		spillebræt = new Spillebræt();
		terning = new Terning();
		terning.kast();
	}

	public void spilkontrol() {
		spillebræt.sendBesked("Velkommen til Monopoly Junior!!");
		opretSpillere();
		spil = new Spil(spillerliste, spillebræt);

		int nutidigSpillerInt = -1;
		do {
			nutidigSpillerInt = (nutidigSpillerInt + 1) % spillerliste.antalSpillere();
			spillebræt.setTerning(terning.kast());
			spil.udførSpillerTur(terning, spillerliste.getSpiller(nutidigSpillerInt));

		} while (!spillerliste.getSpiller(nutidigSpillerInt).isHarTabt());

	}

	public void opretSpillere() {
		int antalSpillere = spillebræt.hentAntalSpillere();
		spillerliste = new Spillerliste(antalSpillere);

		// opretter spillerliste med input fra gui'en
		for (int i = 0; i < antalSpillere; i++) {
			int startBeløb;
			if (antalSpillere == 2)
				startBeløb = 20;
			else if (antalSpillere == 3)
				startBeløb = 18;
			else
				startBeløb = 16;

			String navn = spillebræt.hentNavn();
			// int alder = spillebræt.hentAlder();
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

			Spiller spiller = new Spiller(navn, new Konto(startBeløb), new Brik(farve1, farve2));
			spillerliste.tilføjSpiller(spiller, i);
			GUI_Player player = spillebræt.tilføjSpillerTilBræt(spiller);
			spiller.setGUI_Player(player);
			spiller.opdaterSpiller();
		}
	}
}