package de.eldecker.dhbw.pangrammchecker.engine;

/**
 * Eigener Aufzählungstyp für verschiedene Alphabete.
 */
public enum AlphabetEnum {

    /**
     * Das englische Alphabet (keine Umlaute, kein "ß").
     */
    ALPHABET_ENGLISCH,

    /**
     * Das deutsche Alphabet mit Umlauten (ohne "ß").
     */
    ALPHABET_DEUTSCH_UMLAUTE,

    /**
     * Das deutsche Alphabet mit Umlauten und dem Eszett.
     */
    ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT;
}
