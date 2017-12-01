<<<<<<< HEAD
package gr_34.entity;
import java.awt.Color;
import gr_34.entity.Felt;

/**
 * 
 * @author David
 * @author Alan
 * @author Burhan
 * @author Andreas
 *
 */

public class Felter {

	public static Felt[] getFelter() {

		Felt[] felter = new Felt[24];
		felter[0] = new Felt();
		felter[0].setTitel("Start");
		felter[0].setPris(-1);
		felter[0].setBeskrivelse("Spillerstart");
		felter[0].setSubText("");
		
		felter[1] = new Felt();
		felter[1].setTitel("Burgerbaren");
		felter[1].setPris(1);
		felter[1].setFarve(Color.DARK_GRAY);
		felter[1].setSubText("M1");
		felter[1].setBeskrivelse("Snup en burger");
		
		felter[2] = new Felt();
		felter[2].setTitel("Pizzariaet");
		felter[2].setPris(1);
		felter[2].setFarve(Color.DARK_GRAY);
		felter[2].setSubText("M1");
		felter[2].setBeskrivelse("Slå dig løs i pizzaland");

		felter[3] = new Felt();
		felter[3].setTitel("Chance");
		felter[3].setPris(-1);
		felter[3].setBeskrivelse("Tag chancen");
		felter[3].setSubText("");

		felter[4] = new Felt();
		felter[4].setTitel("Slikbutikken");
		felter[4].setPris(1);
		felter[4].setFarve(Color.CYAN);
		felter[4].setSubText("M1");
		felter[4].setBeskrivelse("Fyld din pose op med slik!");
		
		felter[5] = new Felt();
		felter[5].setTitel("Iskiosken");
		felter[5].setPris(1);
		felter[5].setFarve(Color.CYAN);
		felter[5].setSubText("M1");
		felter[5].setBeskrivelse("Køl ned med en is");

		felter[6] = new Felt();
		felter[6].setTitel("I fængsel");
		felter[6].setPris(-1);
		felter[6].setBeskrivelse("Hellere en plet for vold, end at skuffe sit hold");
		felter[6].setSubText("");

		felter[7] = new Felt();
		felter[7].setTitel("Museet");
		felter[7].setPris(2);
		felter[7].setFarve(Color.PINK);
		felter[7].setSubText("M2");
		felter[7].setBeskrivelse("Fald i søvn i antikke omgivelser");

		felter[8] = new Felt();
		felter[8].setTitel("Biblioteket");
		felter[8].setPris(2);
		felter[8].setFarve(Color.PINK);
		felter[8].setSubText("M2");
		felter[8].setBeskrivelse("Stå i lange køer for masser af bøger");

		felter[9] = new Felt();
		felter[9].setTitel("Chance");
		felter[9].setPris(-1);
		felter[9].setBeskrivelse("Tag chancen");
		felter[9].setSubText("");

		felter[10] = new Felt();
		felter[10].setTitel("Skaterparken");
		felter[10].setPris(2);
		felter[10].setFarve(Color.ORANGE);
		felter[10].setSubText("M2");
		felter[10].setBeskrivelse("Gå op på bakken og tag i skaterparken");

		felter[11] = new Felt();
		felter[11].setTitel("Swimmingpoolen");
		felter[11].setPris(2);
		felter[11].setFarve(Color.ORANGE);
		felter[11].setSubText("M2");
		felter[11].setBeskrivelse("Snup en dukkert");

		felter[12] = new Felt();
		felter[12].setTitel("Parkeringspladsen");
		felter[12].setBeskrivelse("Gratis parkering");
		felter[12].setPris(-1);
		felter[12].setSubText("");

		felter[13] = new Felt();
		felter[13].setTitel("Spillehallen");
		felter[13].setPris(3);
		felter[13].setFarve(Color.RED);
		felter[13].setSubText("M3");
		felter[13].setBeskrivelse("Slå dig løs i Spillehallen");

		felter[14] = new Felt();
		felter[14].setTitel("Biografen");
		felter[14].setPris(3);
		felter[14].setFarve(Color.RED);
		felter[14].setSubText("M3");
		felter[14].setBeskrivelse("Se den nyeste superheltefilm");

		felter[15] = new Felt();
		felter[15].setTitel("Chance");
		felter[15].setPris(-1);
		felter[15].setBeskrivelse("Tag chancen");
		felter[15].setSubText("");

		felter[16] = new Felt();
		felter[16].setTitel("Legetøjsbutikken");
		felter[16].setPris(3);
		felter[16].setFarve(Color.YELLOW);
		felter[16].setSubText("M3");
		felter[16].setBeskrivelse("Brug din mors penge og køb en fodbold");

		felter[17] = new Felt();
		felter[17].setTitel("Dyrehandleren");
		felter[17].setPris(3);
		felter[17].setFarve(Color.YELLOW);
		felter[17].setSubText("M3");
		felter[17].setBeskrivelse("Køb alle dyrene");

		felter[18] = new Felt();
		felter[18].setTitel("Gå i fængsel");
		felter[18].setPris(-1);
		felter[18].setBeskrivelse("Ryk direkte i fængsel");
		felter[18].setSubText("");
		
		felter[19] = new Felt();
		felter[19].setTitel("Bowlinghallen");
		felter[19].setPris(4);
		felter[19].setFarve(Color.GREEN);
		felter[19].setSubText("M4");
		felter[19].setBeskrivelse("Det eneste sted dine medarbejdere må strike");

		felter[20] = new Felt();
		felter[20].setTitel("Zoo");
		felter[20].setPris(4);
		felter[20].setFarve(Color.GREEN);
		felter[20].setSubText("M4");
		felter[20].setBeskrivelse("Sig hej til aberne");

		felter[21] = new Felt();
		felter[21].setTitel("Chance");
		felter[21].setPris(-1);
		felter[21].setBeskrivelse("Tag chancen");
		felter[21].setSubText("");

		felter[22] = new Felt();
		felter[22].setTitel("Vandlandet");
		felter[22].setPris(5);
		felter[22].setFarve(Color.BLUE);
		felter[22].setSubText("M5");
		felter[22].setBeskrivelse("Husk dine briller og tag en dukkert");

		felter[23] = new Felt();
		felter[23].setTitel("Strandpromenaden");
		felter[23].setPris(5);
		felter[23].setFarve(Color.BLUE);
		felter[23].setSubText("M5");
		felter[23].setBeskrivelse("Tag en tur og køb nogle souvenirs");
		
		return felter;
	}
=======
package gr_34.entity;
import java.awt.Color;
import gr_34.entity.Felt;

/**
 * 
 * @author David
 * @author Alan
 * @author Burhan
 * @author Andreas
 *
 */

public class Felter {

	public static Felt[] getFelter() {

		Felt[] felter = new Felt[24];
		felter[0] = new Felt();
		felter[0].setTitel("Start");
		felter[0].setPris(-1);
		felter[0].setBeskrivelse("Spillerstart");
		felter[0].setSubText("");
		
		felter[1] = new Felt();
		felter[1].setTitel("Burgerbaren");
		felter[1].setPris(1);
		felter[1].setFarve(Color.DARK_GRAY);
		felter[1].setSubText("M1");
		felter[1].setBeskrivelse("Snup en burger");
		
		felter[2] = new Felt();
		felter[2].setTitel("Pizzariaet");
		felter[2].setPris(1);
		felter[2].setFarve(Color.DARK_GRAY);
		felter[2].setSubText("M1");
		felter[2].setBeskrivelse("Slå dig løs i pizzaland");

		felter[3] = new Felt();
		felter[3].setTitel("Chance");
		felter[3].setPris(-1);
		felter[3].setBeskrivelse("Tag chancen");
		felter[3].setSubText("");

		felter[4] = new Felt();
		felter[4].setTitel("Slikbutikken");
		felter[4].setPris(1);
		felter[4].setFarve(Color.CYAN);
		felter[4].setSubText("M1");
		felter[4].setBeskrivelse("Fyld din pose op med slik!");
		
		felter[5] = new Felt();
		felter[5].setTitel("Iskiosken");
		felter[5].setPris(1);
		felter[5].setFarve(Color.CYAN);
		felter[5].setSubText("M1");
		felter[5].setBeskrivelse("Køl ned med en is");

		felter[6] = new Felt();
		felter[6].setTitel("I fængsel");
		felter[6].setPris(-1);
		felter[6].setBeskrivelse("Hellere en plet for vold, end at skuffe sit hold");
		felter[6].setSubText("");

		felter[7] = new Felt();
		felter[7].setTitel("Museet");
		felter[7].setPris(2);
		felter[7].setFarve(Color.PINK);
		felter[7].setSubText("M2");
		felter[7].setBeskrivelse("Fald i søvn i antikke omgivelser");

		felter[8] = new Felt();
		felter[8].setTitel("Biblioteket");
		felter[8].setPris(2);
		felter[8].setFarve(Color.PINK);
		felter[8].setSubText("M2");
		felter[8].setBeskrivelse("Stå i lange køer for masser af bøger");

		felter[9] = new Felt();
		felter[9].setTitel("Chance");
		felter[9].setPris(-1);
		felter[9].setBeskrivelse("Tag chancen");
		felter[9].setSubText("");

		felter[10] = new Felt();
		felter[10].setTitel("Skaterparken");
		felter[10].setPris(2);
		felter[10].setFarve(Color.ORANGE);
		felter[10].setSubText("M2");
		felter[10].setBeskrivelse("Gå op på bakken og tag i skaterparken");

		felter[11] = new Felt();
		felter[11].setTitel("Swimmingpoolen");
		felter[11].setPris(2);
		felter[11].setFarve(Color.ORANGE);
		felter[11].setSubText("M2");
		felter[11].setBeskrivelse("Snup en dukkert");

		felter[12] = new Felt();
		felter[12].setTitel("Parkeringspladsen");
		felter[12].setBeskrivelse("Gratis parkering");
		felter[12].setPris(-1);
		felter[12].setSubText("");

		felter[13] = new Felt();
		felter[13].setTitel("Spillehallen");
		felter[13].setPris(3);
		felter[13].setFarve(Color.RED);
		felter[13].setSubText("M3");
		felter[13].setBeskrivelse("Slå dig løs i Spillehallen");

		felter[14] = new Felt();
		felter[14].setTitel("Biografen");
		felter[14].setPris(3);
		felter[14].setFarve(Color.RED);
		felter[14].setSubText("M3");
		felter[14].setBeskrivelse("Se den nyeste superheltefilm");

		felter[15] = new Felt();
		felter[15].setTitel("Chance");
		felter[15].setPris(-1);
		felter[15].setBeskrivelse("Tag chancen");
		felter[15].setSubText("");

		felter[16] = new Felt();
		felter[16].setTitel("Legetøjsbutikken");
		felter[16].setPris(3);
		felter[16].setFarve(Color.YELLOW);
		felter[16].setSubText("M3");
		felter[16].setBeskrivelse("Brug din mors penge og køb en fodbold");

		felter[17] = new Felt();
		felter[17].setTitel("Dyrehandleren");
		felter[17].setPris(3);
		felter[17].setFarve(Color.YELLOW);
		felter[17].setSubText("M3");
		felter[17].setBeskrivelse("Køb alle dyrene");

		felter[18] = new Felt();
		felter[18].setTitel("Gå i fængsel");
		felter[18].setPris(-1);
		felter[18].setBeskrivelse("Ryk direkte i fængsel");
		felter[18].setSubText("");
		
		felter[19] = new Felt();
		felter[19].setTitel("Bowlinghallen");
		felter[19].setPris(4);
		felter[19].setFarve(Color.GREEN);
		felter[19].setSubText("M4");
		felter[19].setBeskrivelse("Det eneste sted dine medarbejdere må strike");

		felter[20] = new Felt();
		felter[20].setTitel("Zoo");
		felter[20].setPris(4);
		felter[20].setFarve(Color.GREEN);
		felter[20].setSubText("M4");
		felter[20].setBeskrivelse("Sig hej til aberne");

		felter[21] = new Felt();
		felter[21].setTitel("Chance");
		felter[21].setPris(-1);
		felter[21].setBeskrivelse("Tag chancen");
		felter[21].setSubText("");

		felter[22] = new Felt();
		felter[22].setTitel("Vandlandet");
		felter[22].setPris(5);
		felter[22].setFarve(Color.BLUE);
		felter[22].setSubText("M5");
		felter[22].setBeskrivelse("Husk dine briller og tag en dukkert");

		felter[23] = new Felt();
		felter[23].setTitel("Strandpromenaden");
		felter[23].setPris(5);
		felter[23].setFarve(Color.BLUE);
		felter[23].setSubText("M5");
		felter[23].setBeskrivelse("Tag en tur og køb nogle souvenirs");
		
		return felter;
	}
>>>>>>> e93ff822c8c226f2854d406bae57a55f39eccf31
}