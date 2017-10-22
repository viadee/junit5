package de.viadee.junit5;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class HelloWorldTest {
	
	@Test
	void toImplement() {
		fail("Hello World!");
	}

}