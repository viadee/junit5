package de.viadee.junit5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Test
@Tag("end2end")
public @interface End2EndTest {}

// Hinweis: Include/Exclude von Tags geht über das maven-surefire-plugin
//<build>
//<plugins>
//    <plugin>
//        <artifactId>maven-surefire-plugin</artifactId>
//        <configuration>
//            <properties>
//                <includeTags>end2end</includeTags>
//            </properties>
//        </configuration>
//    </plugin>
//</plugins>
//</build>
