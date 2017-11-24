package gr_34.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Terning;

public class TC_1 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void tc_1_terningeslag() {
		Terning t = new Terning();
		int ANTAL_SLAG = 10000;
		for(int i = 0; i < ANTAL_SLAG; i++) {
			int resultat = t.kast();
			assertTrue(1 <= resultat && resultat <= 6);
		}
	}
}
