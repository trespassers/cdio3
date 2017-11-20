package gr_34.entity;
/**
 *
 * @author Sebastian
 *
 */

public class Spiller {
	private String navn;
	private int alder;
	private Konto konto;
	private Brik brik;
	
	public Spiller(String navn, int alder, Konto konto, Brik brik) {
		this.navn = navn;
		this.alder = alder;
		this.konto = konto;
		this.brik = brik;
	}

	public String getNavn() {
		return navn;
	}

	public int getAlder() {
		return alder;
	}
	
	public Konto getKonto() {
		return konto;
	}

	public Brik getBrik() {
		return brik;
	}

	public String toString() {
		return navn;
	}

}
