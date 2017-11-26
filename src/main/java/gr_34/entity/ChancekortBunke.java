package gr_34.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Representerer en bunke af chancekort, med
 * 
 * @author PeterTB
 *
 */

public class ChancekortBunke {

	private ArrayList<Chancekort> bunke;

	public ChancekortBunke(ArrayList<Chancekort> bunke) {
		this.bunke = bunke;
	}

	
	public int getLength()
	{
		return bunke.size();
	}
	
	public void bland() {
		Collections.shuffle(bunke);
	}

	/**
	 * Trækker det øverste kort og lægger det direkte nederst i bunken.
	 * 
	 * @return reference til trukkede kort
	 */
	public Chancekort trækKort() {
		
		// Tag øverste kort
		Chancekort trukket = bunke.get(0);
		bunke.remove(0);
		// Læg tilbage i bunden
		bunke.add(bunke.size(), trukket);
		
		return trukket;
	}

	/**
	 * Fjerner nederste kort i bunden, f.eks. hvis fængselsfrikortet lige er blevet
	 * trukket
	 */
//	public void fjernNederste() {
//		Chancekort[] mindreBunke = new Chancekort[bunke.length - 1];
//		
//		for (int i = 0; i < bunke.length - 1; i++)
//		{
//			mindreBunke[i] = bunke[i+1];
//		}
//		bunke = mindreBunke;
//	}

}
