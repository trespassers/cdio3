package gr_34.boundary;

import gr_34.controller.Felter;
import gr_34.entity.Felt;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
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
				felter[i] = new GUI_Start();
			// Gadefelter har pris over nul, specielle felter har -1.
			// Burde egentligt ikke behøve at tjekke prisen her til sidst.
			else if (feltData[i].getPris() < 0) {
				// Kun gadefelter har priser og definerede farver
				felter[i] = new GUI_Street();
				((GUI_Street) felter[i]).setRent("M" + feltData[i].getPris());
				felter[i].setBackGroundColor(feltData[i].getFarve());
			}

			felter[i].setTitle(feltData[i].getTitel());
			felter[i].setDescription(feltData[i].getBeskrivelse());

		}
		
		gui = new GUI(felter);
	}
	
	public GUI_Field[] getFelter()
	{
		return felter;
	}
	
	public void sendBesked(String besked)
	{
		gui.showMessage(besked);
	}
}
