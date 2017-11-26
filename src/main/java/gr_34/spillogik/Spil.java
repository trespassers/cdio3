/**
 * 
 * @author PeterTB
 */
package gr_34.spillogik;

import gr_34.boundary.Spillebræt;
import gr_34.controller.Felter;
import gr_34.entity.Chancekort;
import gr_34.entity.Felt;
import gr_34.entity.Spiller;
import gr_34.entity.Spillerliste;
import gr_34.entity.Terning;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_fields.GUI_Refuge;
import gui_fields.GUI_Street;

public class Spil {
	private Spillerliste spillere;
	private Spillebræt spillebræt;
	// private ChancekortBunke chancekortBunke;
	private Felt[] feltData;

	public Spil(Spillerliste spillere, Spillebræt spillebræt) {
		this.spillere = spillere;
		this.spillebræt = spillebræt;
		// this.chancekortBunke = chancekortBunke;
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
			// TODO send besked EFTER bilen flytter.
			spillebræt.sendBesked(besked + " har passeret start og modtaget 2M.");
			aktivSpiller.getKonto().tilføjPenge(2);
			nyPosition -= spillebræt.getFelter().length;
		}

		// Fjerner spiller fra forrige felt
		spillebræt.getFelt(gammelPosition).setCar(aktivSpiller.getGUI_PLayer(), false);

		aktivSpiller.setPosition(nyPosition);

		GUI_Field ramtFelt = spillebræt.getFelter()[nyPosition];
		String ramtFeltNavn = ramtFelt.getTitle();


		if (ramtFeltNavn == "Start")
		{
			
		}
		else if (ramtFelt instanceof GUI_Chance) {
			//			Chancekort trukket = chancekortBunke.trækKort();
			aktivSpiller.getKonto().tilføjPenge(500);
			besked += " fandt 500M.";
		}	
		else if (ramtFelt instanceof GUI_Refuge)
			// Parkeringspladsen er gratis?
			besked += " parkerer gratis.";
		else if (ramtFelt instanceof GUI_Jail)
			// På besøg.
			besked += " er på besøg i fængslet.";
		else if (ramtFeltNavn == "Gå i fængsel")
		{
			// TODO få det her til at virke
			// Spring tur over, osv. grimt magisk sekstal.
			aktivSpiller.setPosition(6);
			besked += " ryger direkte i fængsel.";
		}
		else if (ramtFelt instanceof GUI_Street){
			String ejerNavn = ((GUI_Street) ramtFelt).getOwnerName();
			int pris = feltData[nyPosition].getPris();

			if (ejerNavn != null)
			{
				if (aktivSpiller.getNavn() != ejerNavn)
				{
					aktivSpiller.getKonto().fratrækPenge(pris);
					// TODO Betal anden spiller
					besked += " er landet på " + ramtFelt.getTitle() +
							" som tilhører " + ejerNavn +
							", og har betalt dem " + pris + "M.";
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
				besked += " har købt " + feltData[nyPosition].getTitel() +
						" for " + feltData[nyPosition].getPris() + "M.";
			}
		}
		ramtFelt.setCar(aktivSpiller.getGUI_PLayer(), true);
		aktivSpiller.opdaterSpiller();
		if (!besked.equals(aktivSpiller.getNavn()))
			spillebræt.sendBesked(besked);

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
