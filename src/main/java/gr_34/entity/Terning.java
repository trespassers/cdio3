package gr_34.entity;

/**
 * Terningklasse taget fra cdio1 og modificeret så den passer til vores
 * programspil.
 * 
 * @author Andreas
 * @author Asef
 * @author David
 * @author Alan
 * @author Peter
 * @author Burhan
 * @author Sebastian
 *
 */
public class Terning {

	private int værdi;
	double antalSider = 6.0;

	public int kast() {
		return this.værdi = (int) (Math.random() * antalSider) + 1;
	}

	public int getVærdi() {
		return this.værdi;
	}
}
