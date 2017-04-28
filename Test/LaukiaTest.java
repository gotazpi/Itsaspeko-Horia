package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ItsaspekoHoria.EgoeraLaukia;
import ItsaspekoHoria.Fragata;
import ItsaspekoHoria.Laukia;
import ItsaspekoHoria.OntziaDago;
import ItsaspekoHoria.Ura;

public class LaukiaTest {
	Laukia lauki1;
	Laukia lauki2; // null
	EgoeraLaukia egoera;
	Fragata fragata;

	@Before
	public void setUp() {
		lauki1 = new Laukia(1, 2);
		egoera = new OntziaDago();
		fragata = new Fragata();
	}

	@After
	public void tearDown() {
		lauki1 = null;
		fragata = null;
	}

	@Test
	public void Laukia() {
		assertNotNull(lauki1);
		assertNull(lauki2);
	}

	@Test
	public void testEgoeraAldatu() {
		lauki1.egoeraAldatu(egoera);
		assertTrue(lauki1.getEgoera() instanceof OntziaDago);
		assertFalse(lauki1.getEgoera() instanceof Ura);
	}

	@Test
	public void testGetEgoera() {
		lauki1.egoeraAldatu(egoera);
		assertTrue(lauki1.getEgoera() instanceof OntziaDago);
		assertFalse(lauki1.getEgoera() instanceof Ura);
	}

	@Test
	public void testGetOntzia() {
		lauki1.setOntzia(fragata);
		assertTrue(lauki1.getOntzia() instanceof Fragata);
	}

	@Test
	public void testSetOntzia() {
		lauki1.setOntzia(fragata);
		assertTrue(lauki1.getOntzia() instanceof Fragata);
	}

}
