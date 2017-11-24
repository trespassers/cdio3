package gr_34.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Konto;

public class TC_3_4_5 {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void tc_3_konto_fratræk() {
		Konto k = new Konto(20);
		k.fratrækPenge(10);
		int expected = 10;
		int actual = k.getPenge();
		assertEquals(expected, actual);
	}
	
	@Test
	public void tc_4_konto_fratræk_i_minus() {
		Konto k = new Konto(20);
		k.fratrækPenge(21);
		int expected = 0;
		int actual = k.getPenge();
		assertEquals(expected, actual);
	}

	@Test
	public void tc_5_konto_tilføjPenge() {
		Konto k = new Konto(20);
		k.tilføjPenge(10);
		int expected = 30;
		int actual = k.getPenge();
		assertEquals(expected, actual);
	}
}
