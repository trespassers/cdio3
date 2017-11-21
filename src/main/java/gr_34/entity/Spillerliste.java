package gr_34.entity;

import java.awt.Color;
import java.util.Arrays;
import java.util.Scanner;

import gr_34.boundary.TUI;

public class Spillerliste {
	private Spiller[] spillere;

	public void tilføjSpiller(int antalSpillere) {
		Scanner in = new Scanner(System.in);
		spillere = new Spiller[antalSpillere];

		int startBeløb;
		if (antalSpillere == 2)
			startBeløb = 20;
		else if (antalSpillere == 3)
			startBeløb = 18;
		else
			startBeløb = 16;

		for (int i = 0; i < spillere.length; i++) {
			TUI.print("Indast spiller navn: ");
			String navn = in.next();
			TUI.print("Indtast din alder " + navn + ": ");
			int alder = in.nextInt();
			TUI.print("Vælg din farve; Blå(1), Rød(2), Gul(3), Grøn(4): ");
			// bruger skal indtaste tal mellem 1-4.
			int farve = in.nextInt();
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
			spillere[i] = new Spiller(navn, alder, new Konto(startBeløb), new Brik(farve1, farve2));
		}
		in.close();
	}

	public Spiller getSpillere(int index) {
		return spillere[index];
	}
	
	public String toString() {
		return "Spillerliste: " + Arrays.toString(spillere);
	}
}
