package gr_34.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gr_34.entity.Chancekort;
import gr_34.entity.ChancekortBunke;
import gr_34.entity.ChancekortEffekt;

public class ChancekortBunkeTest {
	ChancekortBunke bunkeUnderTest;

	@Before
	public void setUp() throws Exception {
		Chancekort[] bunke = new Chancekort[10];
		for (int i = 0; i < 10; i++)
		{
			bunke[i] = new Chancekort("Navn"+i, "Tekst"+i, ChancekortEffekt.GratisLyseblå);
		}
		
		bunkeUnderTest = new ChancekortBunke(bunke);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTrækkort()
	{
		Chancekort expected = new Chancekort("Navn9", "Tekst9",
				ChancekortEffekt.GratisLyseblå);
		Chancekort actual = bunkeUnderTest.trækKort();
		assertEquals(expected.getNavn(), actual.getNavn());
		Chancekort expected2 = new Chancekort("Navn8", "Tekst8",
				ChancekortEffekt.GratisLyseblå);
		Chancekort actual2 = bunkeUnderTest.trækKort();
		assertEquals(expected2.getNavn(), actual2.getNavn());
	}
	
	@Test
	public void testBland() {
		ChancekortBunke blandetBunke = bunkeUnderTest;
		blandetBunke.bland();
		int antalUændret = 0;
		boolean ens = false;
		for (int i = 0; i < bunkeUnderTest.getLength(); i++)
		{
			Chancekort a = bunkeUnderTest.trækKort();
			Chancekort b = blandetBunke.trækKort();
			if (a.equals(b))
				antalUændret++;
		}
		
		if (antalUændret == bunkeUnderTest.getLength())
			ens = true;
		assertFalse(ens);
	}

	@Test
	public void testFjernNederste()
	{
		int expected = bunkeUnderTest.getLength() - 1;
		bunkeUnderTest.fjernNederste();
		int actual = bunkeUnderTest.getLength();
		assertEquals(expected, actual);
		// TODO Test for at kortene der kommer ud er korrekte, det er svært da
		// det er objektreferencer det hele.
	}
}