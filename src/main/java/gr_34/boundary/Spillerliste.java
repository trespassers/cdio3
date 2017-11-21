package gr_34.boundary;

import java.util.Arrays;
import java.util.Scanner;

import gr_34.entity.Brik;
import gr_34.entity.Konto;
import gr_34.entity.Spiller;

public class Spillerliste {
	private Spiller[] spillere;
	
	public void tilføjSpiller(int antalSpillere) {
		Scanner in = new Scanner(System.in);
		spillere = new Spiller[antalSpillere];
		for(int i = 0; i < spillere.length; i++) {
			TUI.print("Indast spiller navn: ");
			String navn = in.next();
			TUI.print("Indtast din alder "+navn+": ");
			int alder = in.nextInt();
			if(antalSpillere == 2) {
				spillere[i] = new Spiller(navn, alder, new Konto(20), new Brik());
			} else if(antalSpillere == 3) {
				spillere[i] = new Spiller(navn, alder, new Konto(18), new Brik());
			} else {
				spillere[i] = new Spiller(navn, alder, new Konto(16), new Brik());
			}
		}
		in.close();
	}

	public Spiller getSpillere(int index) {
		return spillere[index];
	}

	@Override
	public String toString() {
		return "Spillerliste: " + Arrays.toString(spillere);
	}
}
