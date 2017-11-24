package gr_34.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Konto;
import gr_34.entity.Spillerliste;

public class TC2_3spillere {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void tc_2_startbeløb_3_spillere() {
		Spillerliste l1 = new Spillerliste();
		l1.tilføjSpiller(3);
		int expected = new Konto(18).getPenge();
		int actual = l1.getSpillere(0).getKonto().getPenge();
		assertEquals(expected, actual);
	}
}
