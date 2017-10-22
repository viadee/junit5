package de.viadee.junit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.runner.SelectPackages;
import org.junit.platform.runner.UseTechnicalNames;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"de.viadee.junit5"})
@UseTechnicalNames
public class JUnit5Suite {
}
