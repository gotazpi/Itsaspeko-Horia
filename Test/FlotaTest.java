package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ItsaspekoHoria.Flota;
import ItsaspekoHoria.Fragata;
import ItsaspekoHoria.Itsaspekoa;
import ItsaspekoHoria.Ontzia;
import ItsaspekoHoria.Suntsituta;

public class FlotaTest {
	Flota flota1;
	Flota flota2; //null
	Itsaspekoa itsaspekoa;
	Fragata fragata;
	Suntsituta suntsituta;

	@Before
	public void setUp() throws Exception {
		flota1 = new Flota();
		itsaspekoa = new Itsaspekoa();
		fragata = new Fragata();
		suntsituta = new Suntsituta();
	}

	@After
	public void tearDown() throws Exception {
		flota1=null;
		itsaspekoa=null;
		fragata=null;
	}

	@Test
	public void testFlota() {
		assertNotNull(flota1);
		assertNull(flota2);
	}
	@Test
	public void testSetNorabidea() {
		assertTrue(flota1.getNorabidea()==0);
		flota1.setNorabidea(2);
		assertTrue(flota1.getNorabidea()==2);
		assertFalse(flota1.getNorabidea()==3);
	}
	@Test
	public void testGetNorabidea() {
		assertTrue(flota1.getNorabidea()==0);
		flota1.setNorabidea(2);
		assertTrue(flota1.getNorabidea()==2);
		assertFalse(flota1.getNorabidea()==3);
	}
	@Test
	public void testGetOntziKop() {
		assertTrue(flota1.getOntziKop()==10);
		assertFalse(flota1.getOntziKop()==9);
	}
	@Test
	public void testGetOntzia() {
		assertTrue(flota1.getOntzia(2) instanceof Itsaspekoa);
		assertFalse(flota1.getOntzia(2) instanceof Fragata);
		assertTrue(flota1.getOntzia(8) instanceof Fragata);
	}
	@Test
	public void testGetZein() {
		assertTrue(flota1.getZein()==0);
		flota1.hurrengoa();
		assertTrue(flota1.getZein()==1);
		assertFalse(flota1.getZein()==0);
	}
	@Test
	public void testHurrengoa() {
		assertTrue(flota1.getZein()==0);
		flota1.hurrengoa();
		assertTrue(flota1.getZein()==1);
		assertFalse(flota1.getZein()==0);
	}
	@Test
	public void testSuntsitutakoOntziaLortu() {
		flota1.ontziaSuntsitu(6);
		assertTrue(flota1.suntsitutakoOntziaLortu() instanceof Fragata);
		assertFalse(flota1.suntsitutakoOntziaLortu() instanceof Itsaspekoa);
		flota1.ontziaSuntsitu(1);
		assertTrue(flota1.suntsitutakoOntziaLortu()instanceof Itsaspekoa);
	}

}
