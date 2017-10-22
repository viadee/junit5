package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class GeldautomatTest {

	private Geldautomat geldautomat;

	@BeforeEach
	void setUp() {
		geldautomat = new Geldautomat();		
	}
	
	@TestFactory
	Stream<DynamicTest> testZuGering() {
		return Stream.of(-50, 0)
			  .map(i -> dynamicTest("Wert=" + i,
					  () -> assertFalse(geldautomat.auszahlen(i))));
	}

	@TestFactory
	Stream<DynamicTest> testGueltig() {
		return Stream.of(10, 50, 100, 200, 5, 500)
			  .map(i -> dynamicTest("Wert=" + i,
					  () -> assertTrue(geldautomat.auszahlen(i))));
	}
	
	@TestFactory
	Stream<DynamicTest> testUngueltig() {
		return Stream.of(42, 421, 1, 499)
			  .map(i -> dynamicTest("Wert=" + i,
					  () -> assertFalse(geldautomat.auszahlen(i))));
	}
	
	@TestFactory
	Stream<DynamicTest> testZuHoch() {
		return Stream.of(600, 1000, 501, 505)
			  .map(i -> dynamicTest("Wert=" + i,
					  () -> assertFalse(geldautomat.auszahlen(i))));
	}
	
	class Geldautomat {
	boolean auszahlen(Integer betrag) {
		if (betrag >= 5 && betrag <= 500 && betrag % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
	}
}
