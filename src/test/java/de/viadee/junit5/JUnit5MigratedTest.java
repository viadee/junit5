package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class JUnit5MigratedTest {
	
	private String firma;
	
	@BeforeAll
	public static void setUpClass() throws Exception {
		// umfangreiche Initialisierung (DB-Verbindung, ...)
	}
	
	@BeforeEach
	public void setUp() {
		firma = "viadee";
	}
	
	@Test
	public void testFirma() {
		assertEquals("viade", firma, () -> "Firma != viadee");
	}
	
	@Disabled
	@Test
	public void test() {
		// momentan nicht lauffähig
	}
	
	@AfterAll
	public static void tearDownClass() throws SQLException {
		// Abbau der Ressourcen und Infrastruktur
	}

}
