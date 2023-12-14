package de.eldecker.dhbw.pangrammchecker.test;

import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_ENGLISCH;
import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class PangrammCheckerTest {

    @Test
    public void testPangram() {
        String pangram = "The quick brown fox jumps over the lazy dog";
        assertTrue(istPangramm(pangram, ALPHABET_ENGLISCH));
    }

    @Test
    public void testNonPangram() {
        String nonPangram = "Hello world";
        assertFalse(istPangramm(nonPangram, ALPHABET_ENGLISCH));
    }

    @Test
    public void testEmptyString() {
        String emptyString = "";
        assertThrows(IllegalArgumentException.class, () -> istPangramm(emptyString, ALPHABET_ENGLISCH));
    }

    @Test
    public void testNull() {
        assertThrows(IllegalArgumentException.class, () -> istPangramm(null, ALPHABET_ENGLISCH));
    }
}