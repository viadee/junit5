package de.viadee.junit4;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit4LegacyTest {
	
	private String firma;
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		// umfangreiche Initialisierung (DB-Verbindung, ...)
	}
	
	@Before
	public void setUp() {
		firma = "viadee";
	}
	
	@Test
	public void testFirma() {
		assertEquals("Firma != viadee", "viade", firma);
	}
	
	@Ignore
	@Test
	public void test() {
		// momentan nicht lauffähig
	}
	
	@AfterClass
	public static void tearDownClass() throws SQLException {
		// Abbau der Ressourcen und Infrastruktur
	}

}
