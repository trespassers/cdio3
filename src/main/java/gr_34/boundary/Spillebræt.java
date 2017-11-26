package gr_34.boundary;

import gr_34.controller.Felter;
import gr_34.entity.Felt;
import gr_34.entity.Spiller;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Ownable;
import gui_fields.GUI_Player;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Start;
import gui_fields.GUI_Street;
import gui_main.GUI;

/**
 * Opretter spillebrættet med felter for monopoly
 * 
 * @author Sebastian
 * @author PeterTB
 *
 */
public class Spillebræt {
	private GUI_Field[] felter;
	private int[] lejeListe;
	GUI gui;

	public Spillebræt() {
		
		Felt[] feltData = Felter.getFelter();
		felter = new GUI_Field[feltData.length];
		lejeListe = new int[feltData.length];

		for (int i = 0; i < feltData.length; i++) {
			lejeListe[i] = feltData[i].getPris();

			// Kunne også have haft en attribut der bestemte hvad felttypen er.
			if (feltData[i].getTitel() == "Start")
				felter[i] = new GUI_Start();
			else if (feltData[i].getTitel() == "Chance")
				felter[i] = new GUI_Chance();
			else if (feltData[i].getTitel() == "Parkeringspladsen")
				felter[i] = new GUI_Refuge();
			else if (feltData[i].getTitel() == "I fængsel")
				felter[i] = new GUI_Jail();
			else if (feltData[i].getTitel() == "Gå i fængsel")
				felter[i] = new GUI_Street();
			else {
				// Kun gadefelter har priser og definerede farver
				felter[i] = new GUI_Street();
				((GUI_Street) felter[i]).setRent("M" + feltData[i].getPris());
				felter[i].setBackGroundColor(feltData[i].getFarve());
			}
			
			felter[i].setTitle(feltData[i].getTitel());
			felter[i].setDescription(feltData[i].getBeskrivelse());
			felter[i].setSubText(feltData[i].getSubText());

		}
		
		gui = new GUI(felter);
	}
	
	public GUI_Field[] getFelter()
	{
		return felter;
	}
	public GUI_Field getFelt(int index)
	{
		return felter[index];
	}
	
	public void købFelt(int index, String køberNavn)
	{
		((GUI_Street) felter[index]).setOwnerName(køberNavn);
	}
	
	public int hentBilfarve() {
		return gui.getUserInteger("Vælg bilfarve 1=blå, 2=rød, 3=gul, 4=grøn", 1, 4);
	}
	
	public String hentNavn() {
		return gui.getUserString("Indtast dit navn: ");
	}
	
	public int hentAlder() {
		return gui.getUserInteger("Indtast din alder: ");
	}
	
	public int hentAntalSpillere() {
		return gui.getUserInteger("Vælg antal spillere", 2, 4);
	}
	
	public void setEjer(Spiller spiller, int position) {
		((GUI_Ownable) felter[position]).setOwnerName(spiller.getNavn());
	}
	
	public GUI_Player tilføjSpillerTilBræt(Spiller spiller) {
		GUI_Player player = new GUI_Player(spiller.getNavn(), spiller.getKonto().getPenge(), spiller.getBrik().getCar());
		gui.addPlayer(player);
		return player;
	}
	
	public void sendBesked(String besked)
	{
		gui.showMessage(besked);
	}
	
	public void setTerning(int værdi)
	{
		gui.setDie(værdi);
	}
}
