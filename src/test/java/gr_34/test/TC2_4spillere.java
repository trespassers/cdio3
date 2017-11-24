package gr_34.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Konto;
import gr_34.entity.Spillerliste;

public class TC2_4spillere {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void tc_2_startbeløb_4_spillere() {
		Spillerliste l2 = new Spillerliste();
		l2.tilføjSpiller(4);
		int expected = new Konto(16).getPenge();
		int actual = l2.getSpillere(0).getKonto().getPenge();
		assertEquals(expected, actual);
	}
}
