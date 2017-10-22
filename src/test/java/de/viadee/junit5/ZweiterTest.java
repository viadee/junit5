package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class ZweiterTest {
	
	
	@Test
	@Disabled
	void isDisabled() {
		fail("wird nicht auftreten");
	}

	
	@Test
	@DisplayName("leerer Testfall")
	void displayName() {

	}

	@End2EndTest
	void kompletterEndeZuEndeTest() {
		// kompletter Ende-zu-Ende-Testfall
	}
	
	@Test
	void testAssertAll() {
		Autor autor = new Autor("Tobias", "Voß");
		assertAll("autor",
				() -> assertEquals("Tobi", autor.getVorname()),
				() -> assertEquals("Voss", autor.getNachname())
		);
	}
	
	
	class Autor {
		String vorname;
		String nachname;
		
		public Autor(String vorname, String nachname) {
			super();
			this.vorname = vorname;
			this.nachname = nachname;
		}
		public String getVorname() {
			return vorname;
		}
		public void setVorname(String vorname) {
			this.vorname = vorname;
		}
		public String getNachname() {
			return nachname;
		}
		public void setNachname(String nachname) {
			this.nachname = nachname;
		}
		
	}
}
