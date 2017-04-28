package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ItsaspekoHoria.Koordenatuak;

public class KoordenatuakTest {
	
	Koordenatuak koordenatuak1;
	Koordenatuak koordenatuak2;  //null

	@Before
	public void setUp() throws Exception {
		koordenatuak1 = new Koordenatuak(1,2);
	}

	@After
	public void tearDown() throws Exception {
		koordenatuak1=null;
	}

	@Test
	public void testKoordenatuak() {
		assertNotNull(koordenatuak1);
		assertNull(koordenatuak2);
	}
	@Test
	public void testGetErrenkada() {
		assertTrue(koordenatuak1.getErrenkada()==1);
		assertFalse(koordenatuak1.getErrenkada()==3);
	}
	@Test
	public void testGetZutabea() {
		assertTrue(koordenatuak1.getZutabea()==2);
		assertFalse(koordenatuak1.getZutabea()==3);
	}
	@Test
	public void testSetErrenkada() {
		assertTrue(koordenatuak1.getErrenkada()==1);
		koordenatuak1.setErrenkada(3);
		assertTrue(koordenatuak1.getErrenkada()==3);
		assertFalse(koordenatuak1.getErrenkada()==1);
	}
	@Test
	public void testSetZutabea() {
		assertTrue(koordenatuak1.getZutabea()==2);
		koordenatuak1.setZutabea(4);
		assertTrue(koordenatuak1.getZutabea()==4);
		assertFalse(koordenatuak1.getZutabea()==2);
	}
	@Test
	public void testKoordenatuakDa() {
		assertTrue(koordenatuak1.koordenatuaDa(1, 2));
		assertFalse(koordenatuak1.koordenatuaDa(2, 3));
		assertFalse(koordenatuak1.koordenatuaDa(1, 3));
	}
	@Test
	public void testIkutua() {
		assertFalse(koordenatuak1.ikutua());
		koordenatuak1.ikutu();
		assertTrue(koordenatuak1.ikutua());
	}
	@Test
	public void testIkutu() {
		assertFalse(koordenatuak1.ikutua());
		koordenatuak1.ikutu();
		assertTrue(koordenatuak1.ikutua());
	}
}
