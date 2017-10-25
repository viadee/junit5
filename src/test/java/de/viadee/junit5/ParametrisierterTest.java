package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ParametrisierterTest {
	
	@ParameterizedTest
	@ValueSource(strings = {"Münster", "Köln"})
	@CsvSource({"Münster, 800", "Köln, 40"})
	public void testMitParametern(String param) {
		assertNotNull(param);
	}

}
