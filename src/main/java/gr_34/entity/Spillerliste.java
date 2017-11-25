package gr_34.entity;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import gr_34.boundary.TUI;
/**
 * Spillerliste, som indeholder diverse informationer
 * omkring spilleren.
 * @author Sebastian
 *
 */

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

		ArrayList<String> brik = new ArrayList<String>();
		brik.add("Blå(1)");
		brik.add("Rød(2)");
		brik.add("Gul(3)");
		brik.add("Grøn(4)");
		
		for (int i = 0; i < spillere.length; i++) {
			TUI.print("Indast spiller navn: ");
			String navn = in.next();
			TUI.println("----------");
			TUI.print("Indtast din alder " + navn + ": ");
			int alder = in.nextInt();
			TUI.println("----------");
			TUI.print("Indtast et tal mellem 1 & 4 for at vælge din farve; " + brik + ": ");
			int farve = in.nextInt();
			TUI.print("\t\n");
			Color farve1;
			Color farve2;
			if (farve == 1) {
				farve1 = Color.BLUE;
				farve2 = Color.cyan;
				brik.remove(0);
				brik.add(0, "");
			} else if (farve == 2) {
				farve1 = Color.RED;
				farve2 = Color.black;
				brik.remove(1);
				brik.add(1, "");
			} else if (farve == 3) {
				farve1 = Color.YELLOW;
				farve2 = Color.orange;
				brik.remove(2);
				brik.add(2, "");
			} else {
				farve1 = Color.GREEN;
				farve2 = Color.white;
				brik.remove(3);
				brik.add(3, "");
			}
			spillere[i] = new Spiller(navn, alder, new Konto(startBeløb), new Brik(farve1, farve2));
		}
		in.close();
	}

	public Spiller getSpiller(int index) {
		return spillere[index];
	}

	@Override
	public String toString() {
		return "Spillerliste: " + Arrays.toString(spillere);
	}
}
