/**
 * Håndterer navn og beskrivende tekst af et Matador Chancekort.
 * @author PeterTB
 */
package gr_34.entity;

public class Chancekort {
	String navn;
	String tekst;
	public Chancekort(String navn, String tekst) {
		super();
		this.navn = navn;
		this.tekst = tekst;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
}
