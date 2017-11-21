/**
 * 
 * @author PeterTB
 */
package gr_34.spillogik;

import gr_34.boundary.Spillebræt;
import gr_34.entity.Chancekort;
import gr_34.entity.ChancekortBunke;
import gr_34.entity.Spillerliste;
import gr_34.entity.Terning;

public class Spil {
	private Spillerliste spillere;
	private Spillebræt spillebræt;
	private ChancekortBunke chancekortBunke;
	
	public Spil(Spillerliste spillere, Spillebræt spillebræt, ChancekortBunke chancekortBunke) {
		this.spillere = spillere;
		this.spillebræt = spillebræt;
		this.chancekortBunke = chancekortBunke;
	}
	
	public static void udførLogik(Terning terning)
	{
		int slag = terning.getVærdi();
	}
	
	public static void udførChancekortEffekt(Chancekort trukketKort)
	{
		switch (trukketKort.getEffekt())
		{
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
