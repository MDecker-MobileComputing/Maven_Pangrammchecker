package de.eldecker.dhbw.pangrammchecker;

import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_ENGLISCH;
import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT;
import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;

public class App  {

    public static void main( String[] args ) {

        final String text1 = "The quick brown fox jumps over the lazy dog";
        boolean ergebnis1 = istPangramm(text1, ALPHABET_ENGLISCH);
        System.out.println("\nIst '" + text1 + "' ein Pangramm? " + ergebnis1 + "\n");

        final String text2 = "Falsches Üben von Xylophonmusik quält jeden größeren Zwerg";
        boolean ergebnis2 = istPangramm(text2, ALPHABET_ENGLISCH);
        System.out.println("\nIst '" + text2 + "' ein Pangramm? " + ergebnis2 + "\n");
    }

}
