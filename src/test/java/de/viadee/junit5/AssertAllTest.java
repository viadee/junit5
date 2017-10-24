package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class AssertAllTest {
	
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
