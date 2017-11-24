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
	private int position;
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Spiller(String navn, int alder, Konto konto, Brik brik) {
		this.navn = navn;
		this.alder = alder;
		this.konto = konto;
		this.brik = brik;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getAlder() {
		return alder;
	}
	
	public void setAlder(int alder) {
		this.alder = alder;
	}
	
	public Konto getKonto() {
		return konto;
	}
	
	public void setKonto(Konto konto) {
		this.konto = konto;
	}

	public Brik getBrik() {
		return brik;
	}
	
	public void setBrik(Brik brik) {
		this.brik = brik;
	}

	@Override
	public String toString() {
		return "\t\nSpiller: navn=" + navn + ", alder=" + alder + ", konto=" + konto + ", brik=" + brik;
	}

}
