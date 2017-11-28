/**
 * 
 * @author Sebastian
 * @author PeterTB
 */
package gr_34.spillogik;

import java.util.ArrayList;
import java.util.Collections;
import gr_34.boundary.Spillebræt;
import gr_34.controller.Felter;
import gr_34.entity.Chancekort;
import gr_34.entity.Felt;
import gr_34.entity.Spiller;
import gr_34.entity.Spillerliste;
import gr_34.entity.Terning;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Street;

public class Spil {
	private Spillerliste spillere;
	private Spillebræt spillebræt;
	//private ChancekortBunke chancekortBunke;
	private Felt[] feltData;

	public Spil(Spillerliste spillere, Spillebræt spillebræt) {
		this.spillere = spillere;
		this.spillebræt = spillebræt;
		//this.chancekortBunke = chancekortBunke;
		feltData = Felter.getFelter();
	}

	public void udførSpillerTur(Terning terning, Spiller aktivSpiller)
	{
		int slag = terning.getVærdi();
		String besked = aktivSpiller.getNavn();

		int gammelPosition = aktivSpiller.getPosition();
		int nyPosition = (gammelPosition + slag);
		
		if (nyPosition >= spillebræt.getFelter().length)
		{
			spillebræt.sendBesked(besked + " har passeret start og modtaget M2");
			aktivSpiller.getKonto().tilføjPenge(2);
			nyPosition -= spillebræt.getFelter().length;
		}

		// Fjerner spiller fra forrige felt
		spillebræt.getFelt(gammelPosition).setCar(aktivSpiller.getGUI_PLayer(), false);

		aktivSpiller.setPosition(nyPosition);

		GUI_Field ramtFelt = spillebræt.getFelt(nyPosition);
		String ramtFeltNavn = ramtFelt.getTitle();


		if (ramtFeltNavn == "Start")
		{
			
		}
		else if (ramtFelt instanceof GUI_Chance) {
			aktivSpiller.getKonto().tilføjPenge(1);
			besked += " er landet på chancen! du modtager M1";
		}	
		else if (ramtFelt instanceof GUI_Refuge)
			// Parkeringspladsen er gratis.
			besked += " parkerer gratis.";
		else if (ramtFelt == spillebræt.getFelt(6))
			// På besøg.
			besked += " er på besøg i fængslet.";
		else if (ramtFelt == spillebræt.getFelt(18))
		{
			nyPosition = 6;
			ramtFelt = spillebræt.getFelt(nyPosition);
			aktivSpiller.setPosition(nyPosition);
			besked += " ryger direkte i fængsel.";
		}
		else if (ramtFelt instanceof GUI_Street){
			String ejerNavn = ((GUI_Street) ramtFelt).getOwnerName();
			int pris = feltData[nyPosition].getPris();
			Spiller ejer = feltData[nyPosition].getEjer();
			
			if (ejerNavn != null)
			{
				if (aktivSpiller.getNavn() != ejerNavn)
				{
					aktivSpiller.getKonto().fratrækPenge(pris);
					ejer.getKonto().tilføjPenge(pris);
					ejer.opdaterSpiller();
					besked += " er landet på " + ramtFelt.getTitle() +
							" som tilhører " + ejerNavn +
							", og har betalt dem M" + pris;
				}
				else
				{
					besked += " er landet på " + ramtFelt.getTitle() +
							" som de selv ejer.";
				}

			}
			else
			{
				aktivSpiller.getKonto().fratrækPenge(feltData[nyPosition].getPris());
				spillebræt.købFelt(nyPosition, aktivSpiller.getNavn());
				feltData[nyPosition].setEjer(aktivSpiller);
				besked += " har købt " + feltData[nyPosition].getTitel() +
						" for M" + feltData[nyPosition].getPris();
			}
		}
		ramtFelt.setCar(aktivSpiller.getGUI_PLayer(), true);
		aktivSpiller.opdaterSpiller();
		if (!besked.equals(aktivSpiller.getNavn()))
			spillebræt.sendBesked(besked);
		
		if(aktivSpiller.getKonto().getPenge() == 0) {
			spillebræt.sendBesked(aktivSpiller.getNavn() + " har tabt spillet..");
			aktivSpiller.setHarTabt(true);
			
			ArrayList<Integer> placeringer = new ArrayList<Integer>();
			for(int i = 0; i < spillere.antalSpillere(); i++) {
				placeringer.add(spillere.getSpiller(i).getKonto().getPenge());
			}
			
			Collections.sort(placeringer);
			spillebræt.sendBesked("Vinderen er spilleren med beløbet på " + placeringer.get(placeringer.size()-1));
		}

	}

	public void udførChancekortEffekt(Chancekort trukketKort, Spiller aktivSpiller) {
		switch (trukketKort.getEffekt()) {
		case BetalTo:
			break;
		case GratisBrunGul:
			break;
		case GratisLyseblå:
			break;
		case GratisLyseblåRød:
			break;
		case GratisOrange:
			break;
		case GratisOrangeGrøn:
			break;
		case GratisPinkMørkeblå:
			break;
		case GratisRød:
			break;
		case GratisSkaterparken:
			break;
		case KøbNæsteLedigeBilen:
			break;
		case KøbNæsteLedigeRacerbilen:
			break;
		case KøbNæsteLedigeTraktoren:
			break;
		case KøbNæsteLedigeUFOen:
			break;
		case ModtagTo:
			break;
		case RykEnEllerNytKort:
			break;
		case RykOpTilFem:
			break;
		case RykTilStartMedBonus:
			break;
		case RykTilStrandpromenaden:
			break;
		case TagEnFraAlle:
			break;
		default:
			break;
		}

	}
}
