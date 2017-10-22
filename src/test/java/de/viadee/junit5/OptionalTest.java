package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class OptionalTest {

	@Nested
	@DisplayName("Testfälle für ein leeres Optional")
	class EmptyOptionalTest {
		
		private Optional<String> emptyOptional;

		@BeforeEach
		void setUp() {
			emptyOptional = Optional.empty();
		}
		
		@Test
		@DisplayName("Optional.isPresent() liefert false")
		void isPresent() {
			assertFalse(emptyOptional.isPresent());
		}
		
		@Test
		@DisplayName("Optional.get() liefert Exception")
		void get() {
			NoSuchElementException exception = assertThrows(NoSuchElementException.class, emptyOptional::get);
		    assertEquals("No value present", exception.getMessage());
		}
	}

	@Nested
	@DisplayName("Testfälle für ein vorhandenes Optional")
	class PresentOptionalTest {
		
		private static final String VIADEE = "viadee";
		private Optional<String> presentOptional;

		@BeforeEach
		void setUp() {
			presentOptional = Optional.of(VIADEE);
		}
		
		@Test
		@DisplayName("Optional.isPresent() liefert true")
		void isPresent() {
			assertTrue(presentOptional.isPresent());
		}
		
		@Test
		@DisplayName("Optional.get() liefert den Wert")
		void get() {
			assertEquals(VIADEE, presentOptional.get());
		}
	}

}
