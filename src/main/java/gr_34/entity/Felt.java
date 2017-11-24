package gr_34.entity;

import java.awt.Color;

/**
 * 
 * @author Burhan 
 * @author Alan
 */

public class Felt {
	
	private String beskrivelse;
	private Spiller ejer;
	private int pris;
	private Color farve;

	private String titel;
	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getBeskrivelse() {
		return beskrivelse;
	}
	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
	public Spiller getEjer() {
		return ejer;
	}
	public void setEjer(Spiller ejer) {
		this.ejer = ejer;
	}
	public int getPris() {
		return pris;
	}
	public void setPris(int pris) {
		this.pris = pris;
	}
	public Color getFarve() {
		return farve;
	}
	public void setFarve(Color farve) {
		this.farve = farve;
	}

	
	
	
	}
	
	
	