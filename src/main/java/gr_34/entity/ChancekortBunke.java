package gr_34.entity;

import java.util.Random;

/**
 * Representerer en bunke af chancekort, med
 * 
 * @author PeterTB
 *
 */

public class ChancekortBunke {

	private Chancekort[] bunke;

	public ChancekortBunke(Chancekort[] bunke) {
		this.bunke = bunke;
	}

	
	public int getLength()
	{
		return bunke.length;
	}
	
	public void bland()
	{
		// Kopieret fra løsningsforslag til kortspil lektion 8.
		Chancekort[] tempBunke = new Chancekort[bunke.length];
		Random rn = new Random();
		int count = 0;
		do
		{
			int i = rn.nextInt(bunke.length);
			if (tempBunke[i] == null) {
				tempBunke[i] = bunke[count];
				count++;
			}
		} while (count < bunke.length);
		bunke = tempBunke;
	}

	/**
	 * Trækker det øverste kort og lægger det direkte nederst i bunken.
	 * 
	 * @return reference til trukkede kort
	 */
	public Chancekort trækKort() {
		// Tag øverste kort
		Chancekort trukket = bunke[bunke.length - 1];
		// Læg tilbage i bunden
		for (int i = bunke.length-1; i > 0; i--) {
			bunke[i] = bunke[i - 1];
		}
		bunke[0] = trukket;
		return trukket;
	}

	/**
	 * Fjerner nederste kort i bunden, f.eks. hvis fængselsfrikortet lige er blevet
	 * trukket
	 */
	public void fjernNederste() {
		Chancekort[] mindreBunke = new Chancekort[bunke.length - 1];
		
		for (int i = 0; i < bunke.length - 1; i++)
		{
			mindreBunke[i] = bunke[i+1];
		}
		bunke = mindreBunke;
	}

}
