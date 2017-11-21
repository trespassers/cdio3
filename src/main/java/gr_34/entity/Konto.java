package gr_34.entity;
/**
 * 
 * @author Sebastian
 *
 */

public class Konto {
	private int penge;
	
	public Konto(int penge) {
		this.penge = penge;
	}

	public int getPenge() {
		return penge;
	}

	public void setPenge(int penge) {
		this.penge = penge;
	}
	
	public void tilføjPenge(int beløb) {
		int sum;
		sum = getPenge()+beløb;
		setPenge(sum);
	}
	
	public void fratrækPenge(int beløb) {
		int sum;
		sum = getPenge()-beløb;
		setPenge(sum);
	}

	public String toString() {
		return "["+penge+"]";
	}
	
}
