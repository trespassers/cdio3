package gr_34.entity;

import gui_fields.GUI_Player;

/**
 *
 * @author Sebastian
 *
 */

public class Spiller {
	private String navn;
	//private int alder;
	private Konto konto;
	private Brik brik;
	private int position;
	private GUI_Player player;

	public Spiller(String navn, Konto konto, Brik brik) {
		this.navn = navn;
		//this.alder = alder;
		this.konto = konto;
		this.brik = brik;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

//	public int getAlder() {
//		return alder;
//	}
//	
//	public void setAlder(int alder) {
//		this.alder = alder;
//	}
	
	public Konto getKonto() {
		return konto;
	}

	public Brik getBrik() {
		return brik;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	public void setGUI_Player(GUI_Player player) {
		this.player = player;
	}
	
	public GUI_Player getGUI_PLayer()
	{
		return player;
	}
	
	public void opdaterSpiller() {
		player.setBalance(konto.getPenge());
	}

	@Override
	public String toString() {
		return "\t\nSpiller: navn=" + navn + ", konto=" + konto + ", brik=" + brik;
	}

}
