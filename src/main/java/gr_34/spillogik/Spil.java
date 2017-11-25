/**
 * 
 * @author PeterTB
 */
package gr_34.spillogik;

import gr_34.boundary.Spillebræt;
import gr_34.controller.Felter;
import gr_34.entity.Chancekort;
import gr_34.entity.ChancekortBunke;
import gr_34.entity.Felt;
import gr_34.entity.Spiller;
import gr_34.entity.Spillerliste;
import gr_34.entity.Terning;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class Spil {
	private Spillerliste spillere;
	private Spillebræt spillebræt;
	private ChancekortBunke chancekortBunke;
	private Felt[] feltData;

	public Spil(Spillerliste spillere, Spillebræt spillebræt, ChancekortBunke chancekortBunke) {
		this.spillere = spillere;
		this.spillebræt = spillebræt;
		this.chancekortBunke = chancekortBunke;
		feltData = Felter.getFelter();
	}

	public void udførLogik(Terning terning, Spiller aktivSpiller)
	{
		int slag = terning.getVærdi();
		
		int nyPosition = (aktivSpiller.getPosition() + slag) % spillebræt.getFelter().length;
		aktivSpiller.setPosition(nyPosition);
		GUI_Field ramtFelt = spillebræt.getFelter()[nyPosition];
		String ramtFeltNavn = ramtFelt.getTitle();
		
		if (ramtFeltNavn == "Start")
			aktivSpiller.getKonto().tilføjPenge(2);
		else if (ramtFeltNavn == "Chance") {
			Chancekort trukket = chancekortBunke.trækKort();
		}	
		else if (ramtFeltNavn == "Parkeringspladsen")
			// Parkeringspladsen er gratis?
			spillebræt.sendBesked("Gratis parkering.");
		else if (ramtFeltNavn == "I fængsel")
			// På besøg.
			spillebræt.sendBesked("Du er på besøg i fængslet");
		else if (ramtFeltNavn == "Gå i fængsel")
			// Spring tur over, osv. grimt magisk sekstal.
			aktivSpiller.setPosition(6);
		else {
			if (aktivSpiller.getNavn() != ((GUI_Street) ramtFelt).getOwnerName())
			{
				aktivSpiller.getKonto().fratrækPenge(feltData[nyPosition].getPris());
			}
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
