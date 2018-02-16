package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ParametrisierterTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"Münster", "Köln"})
	public void testMitValueSource(String stadt) {
		assertNotNull(stadt);
	}

	@ParameterizedTest
	@CsvSource({"Münster, 80", "Köln, 50"})
	public void testMitCsvSource(String stadt, int mitarbeiter) {
		assertNotNull(stadt);
		assertTrue(mitarbeiter > 40);
	}

	@ParameterizedTest(name = "{index} => stadt={0}, mitarbeiter={1}")
	@CsvFileSource(resources="/parameters.csv")
	public void testMitCsvFileSource(String stadt, int mitarbeiter) {
		assertNotNull(stadt);
		assertTrue(mitarbeiter > 0);
	}
}
