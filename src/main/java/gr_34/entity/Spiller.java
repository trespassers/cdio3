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
	
	public Spiller(String navn, int alder, Konto konto) {
		this.navn = navn;
		this.alder = alder;
		this.konto = konto;
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

}
