/**
 * Håndterer navn og beskrivende tekst af et Matador Chancekort.
 * @author PeterTB
 */
package gr_34.entity;

public class Chancekort {
	private String navn;
	private String tekst;
	
	public Chancekort(String navn, String tekst) {
		this.navn = navn;
		this.tekst = tekst;
	}
	public String getNavn() {
		return navn;
	}
	public String getTekst() {
		return tekst;
	}
}
