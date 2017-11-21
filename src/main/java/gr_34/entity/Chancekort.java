/**
 * Håndterer navn og beskrivende tekst af et Matador Chancekort.
 * @author PeterTB
 */
package gr_34.entity;

public class Chancekort {
	private String navn;
	private String tekst;
	private ChancekortEffekt effekt;
	
	public Chancekort(String navn, String tekst, ChancekortEffekt effekt) {
		this.navn = navn;
		this.tekst = tekst;
		this.effekt = effekt;
	}
	public String getNavn() {
		return navn;
	}
	public String getTekst() {
		return tekst;
	}
	public ChancekortEffekt getEffekt() {
		return effekt;
	}
}
