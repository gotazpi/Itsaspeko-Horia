package Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ItsaspekoHoria.Armamentua;
import ItsaspekoHoria.Radar;

public class ArmamentuaTest {
	
	Armamentua armamentua1;
	Armamentua armamentua2=null;
	Radar radar;
	Radar radar1;
	Radar radar2;
	Radar radar3;
	Radar radar4;

	@Before
	public void setUp() throws Exception {
		armamentua1 = new Armamentua();
		radar = new Radar();
		radar1 = new Radar();
		radar2 = new Radar();
		radar3 = new Radar();
		radar4 = new Radar();
	}

	@After
	public void tearDown() throws Exception {
		armamentua1=null;
		radar = null;
		radar1 = null;
		radar2 = null;
		radar3 = null;
		radar4 = null;
	}

	@Test
	public void testArmamentua() {
		assertNotNull(armamentua1);
		assertNull(armamentua2);
	}
	
	@Test
	public void testGetRadarKop() {  //armamentu hasieran 5 radar ditu
		assertTrue(armamentua1.getRadarKop()==5);
		assertFalse(armamentua1.getRadarKop()==4);
		armamentua1.armaKendu(radar);
		assertTrue(armamentua1.getRadarKop()==4);
	}
	
	
	@Test
	public void testArmaDago() {
		assertTrue(armamentua1.armaDago("Ezkutua"));
		assertTrue(armamentua1.armaDago("Bonba"));
		assertTrue(armamentua1.armaDago("Misil Zuzendua Gurutzea"));
		assertTrue(armamentua1.armaDago("Misila"));
		assertTrue(armamentua1.armaDago("Radar"));
		assertTrue(armamentua1.armaDago("Misil Zuzendua Norabidea"));
		armamentua1.armaKendu(radar);
		armamentua1.armaKendu(radar1);
		armamentua1.armaKendu(radar2);
		armamentua1.armaKendu(radar3);
		armamentua1.armaKendu(radar4);
		assertFalse(armamentua1.armaDago("Radar"));
	}
	
	/*@Test
	public void testArmaHartu() {
		assertTrue(armamentua1.hartuArma("Radar").equals(radar));
		assertTrue(armamentua1.hartuArma("Radar").equals(radar1));
	}*/
	
	@Test
	public void testArmakDaude() {
		assertTrue(armamentua1.armakDaude());
	}
	
	@Test
	public void testArmaKendu() {
		assertTrue(armamentua1.getRadarKop()==5);
		armamentua1.armaKendu(radar);
		assertTrue(armamentua1.getRadarKop()==4);
		assertFalse(armamentua1.getRadarKop()==5);
	}
	
	@Test
	public void testArmaGehitu() {
		assertTrue(armamentua1.getRadarKop()==5);
		armamentua1.armaGehitu(radar);
		assertTrue(armamentua1.getRadarKop()==6);
		assertFalse(armamentua1.getRadarKop()==5);
	}
	

}
