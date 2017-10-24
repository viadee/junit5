package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
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
	

}
