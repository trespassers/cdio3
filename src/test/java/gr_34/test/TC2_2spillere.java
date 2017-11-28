package gr_34.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Konto;
import gr_34.entity.Spillerliste;

public class TC2_2spillere {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void tc_2_startbeløb_2_spillere() {
		Spillerliste l = new Spillerliste(2);
		int expected = new Konto(20).getPenge();
		int actual = l.getSpiller(0).getKonto().getPenge();
		assertEquals(expected, actual);
	}
}
