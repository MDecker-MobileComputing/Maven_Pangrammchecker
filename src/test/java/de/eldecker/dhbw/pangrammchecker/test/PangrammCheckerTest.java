package de.eldecker.dhbw.pangrammchecker.test;

import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class PangrammCheckerTest {

    @Test
    public void testPangram() {
        String pangram = "The quick brown fox jumps over the lazy dog";
        assertTrue(istPangramm(pangram));
    }

    @Test
    public void testNonPangram() {
        String nonPangram = "Hello world";
        assertFalse(istPangramm(nonPangram));
    }

    @Test
    public void testEmptyString() {
        String emptyString = "";
        assertThrows(IllegalArgumentException.class, () -> istPangramm(emptyString));
    }

    @Test
    public void testNull() {
        assertThrows(IllegalArgumentException.class, () -> istPangramm(null));
    }
}