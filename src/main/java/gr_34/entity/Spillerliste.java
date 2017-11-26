package gr_34.entity;

import java.util.Arrays;
/**
 * Spillerliste, som indeholder diverse informationer
 * omkring spilleren.
 * @author Sebastian
 *
 */

public class Spillerliste {
	private Spiller[] spillere;
	
	public Spillerliste(int antalSpillere) {
		spillere = new Spiller[antalSpillere];
	}
	
	public void tilføjSpiller(Spiller spiller, int index) {
		spillere[index] = spiller;
	}

	public Spiller getSpiller(int index) {
		return spillere[index];
	}

	@Override
	public String toString() {
		return "Spillerliste: " + Arrays.toString(spillere);
	}
}
