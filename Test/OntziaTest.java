package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ItsaspekoHoria.Ezkutatuta;
import ItsaspekoHoria.Fragata;
import ItsaspekoHoria.HegazkinOntzia;
import ItsaspekoHoria.IkutuGabe;
import ItsaspekoHoria.Itsaspekoa;
import ItsaspekoHoria.Suntsituta;
import ItsaspekoHoria.Suntsitzailea;


public class OntziaTest {
	Fragata fragata;
	HegazkinOntzia hegazkinOntzia;
	Itsaspekoa itsaspekoa;
	Suntsitzailea suntsitzailea;
	Fragata fragata2; //null
	
	@Before
	public void setUp(){
		fragata = new Fragata();
		hegazkinOntzia = new HegazkinOntzia();
		itsaspekoa = new Itsaspekoa();
		suntsitzailea = new Suntsitzailea();
			
	}

	@After
	public void tearDown(){
		fragata = null;
		hegazkinOntzia = null;
		itsaspekoa = null;
		suntsitzailea = null;	
	}
	
	@Test
	public void testFragata() {
		assertNotNull(fragata);
		assertNull(fragata2);
	}
	@Test
	public void testEzkutatu() {
		fragata.ezkutatu();
		assertTrue(fragata.getEgoera() instanceof Ezkutatuta);
		assertFalse(fragata.getEgoera() instanceof IkutuGabe);
		assertFalse(fragata.getEgoera()instanceof Suntsituta);
	}
	@Test
	public void testGetLuzera() {
		assertTrue(fragata.getLuzera()==1);
		assertTrue(hegazkinOntzia.getLuzera()==4);
		assertTrue(itsaspekoa.getLuzera()==3);
		assertTrue(suntsitzailea.getLuzera()==2);
		assertFalse(fragata.getLuzera()==3);
		}
	/*@Test
	public void testIkutua() {
		fail("Not yet implemented");
	}
	@Test
	public void testIkutu() {
		fail("Not yet implemented");
	}*/  //LAUKIAREN METODOAK

	@Test
	public void testEgoeraAldatu() {
		itsaspekoa.egoeraAldatu(new Ezkutatuta());
		assertTrue(itsaspekoa.getEgoera() instanceof Ezkutatuta);
	}
	@Test
	public void testGetEgoera() {
		assertTrue(itsaspekoa.getEgoera() instanceof IkutuGabe);
		itsaspekoa.egoeraAldatu(new Ezkutatuta());
		assertTrue(itsaspekoa.getEgoera() instanceof Ezkutatuta);
	}
	@Test
	public void testJasandakoBonbaKopGainditu() {
		suntsitzailea.jasandakoBonbaKopAldatu(0);
		assertFalse(suntsitzailea.jasandakoBonbaKopGainditu());
		suntsitzailea.jasandakoBonbaKopAldatu(1);
		assertTrue(suntsitzailea.jasandakoBonbaKopGainditu());
	}
}
